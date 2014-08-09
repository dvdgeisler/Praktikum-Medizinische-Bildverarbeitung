package de.uni_tuebingen.gris.pmb.module;

import java.util.LinkedList;
import java.util.logging.Logger;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.core.MatOfFloat;
import org.opencv.core.MatOfPoint;
import org.opencv.core.MatOfPoint2f;
import org.opencv.core.Scalar;
import org.opencv.imgproc.Imgproc;
import org.opencv.video.Video;

import de.uni_tuebingen.gris.pmb.data.IImage;
import de.uni_tuebingen.gris.pmb.module.gui.ModuleOpticalFlowLKDebugGUI;

public class ModuleOpticalFlowLK extends DefaultModule implements IModule {

	private final static String CONFIGURATION_KEY_IMAGE_SOURCE = "source";
	private final static String CONFIGURATION_KEY_MAX_CORNERS = "maxCorners";
	private final static String CONFIGURATION_KEY_QUALITY_LEVEL = "qualityLevel";
	private final static String CONFIGURATION_KEY_MIN_FEATURE_DISTANCE = "minFeatureDistance";
	public final static String CONFIGURATION_KEY_DEBUG = "debug";
	
	private IModule source;
	private Mat prev;
	private int maxCorners;
	private double qualityLevel;
	private double minDistance;
	private boolean debug;
	private ModuleOpticalFlowLKDebugGUI debugGui;
	private final LinkedList<Scalar> position;
	
	{
		this.debug = false;
		this.debugGui = null;
		this.source = null;
		this.prev = null;
		this.maxCorners = 100;
		this.qualityLevel = 0.01;
		this.minDistance = 50.0;
		this.position = new LinkedList<Scalar>();
	}
	
	/**
	 * TODO no doc
	 */
	public ModuleOpticalFlowLK() {
		super();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void initialize() {
		this.setSource(this.getModuleManager().getModule(this.getConfiguration().getString(CONFIGURATION_KEY_IMAGE_SOURCE)));
		
		if(this.getConfiguration().isIntegerKey(CONFIGURATION_KEY_MAX_CORNERS))
			this.setMaxCorners(this.getConfiguration().getInteger(CONFIGURATION_KEY_MAX_CORNERS));
		else
			Logger.global.warning(
					String.format("maximal corners not specified in configuration! use default: %d", this.getMaxCorners()));

		
		if(this.getConfiguration().isDoubleKey(CONFIGURATION_KEY_QUALITY_LEVEL))
			this.setQualityLevel(this.getConfiguration().getDouble(CONFIGURATION_KEY_QUALITY_LEVEL));
		else
			Logger.global.warning(
					String.format("quality level not specified in configuration! use default: %f", this.getQualityLevel()));

		
		if(this.getConfiguration().isDoubleKey(CONFIGURATION_KEY_MIN_FEATURE_DISTANCE))
			this.setMinDistance(this.getConfiguration().getDouble(CONFIGURATION_KEY_MIN_FEATURE_DISTANCE));
		else
			Logger.global.warning(
					String.format("minimal feature distance not specified in configuration! use default: %f", this.getMinDistance()));
		
		if(this.getConfiguration().isBooleanKey(CONFIGURATION_KEY_DEBUG))
			this.setDebug(this.getConfiguration().getBoolean(CONFIGURATION_KEY_DEBUG));
		else
			Logger.global.warning(
					String.format("debug mode not specified in configuration! use default: %s", Boolean.toString(this.isDebug())));
		
		if(this.isDebug())
			this.setDebugGui(new ModuleOpticalFlowLKDebugGUI(this));
		
		this.getObserver().fireModuleInitializedEvent(this);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void deinitialized() {
		this.getObserver().fireModuleDeinitializedEvent(this);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IImage perform() {
		IImage img;
		Mat fromGray, to, toGray;
		MatOfPoint fromFeaturePoints;
		MatOfPoint2f fromFeaturePoints2f, toFeaturePoints2f, motion;
		MatOfByte status;
		MatOfFloat err;
		Scalar postion;
		Scalar minMotion, maxMotion, meanMotion;
		Scalar minError,  maxError,  meanError;
		Scalar minDistance, maxDistance, meanDistance;

		fromFeaturePoints = new MatOfPoint();
		fromFeaturePoints2f = new MatOfPoint2f();
		toFeaturePoints2f = new MatOfPoint2f();
		status = new MatOfByte();
		err = new MatOfFloat();
		motion = new MatOfPoint2f();
		
		// invoke image source
		img = this.getSource().perform();
		to = img.getData();
		toGray = new Mat();
		
		// create gray images
		Imgproc.cvtColor(to, toGray, Imgproc.COLOR_BGR2GRAY);
		if(this.getPrev() == null)
			fromGray = toGray;
		else
			fromGray = this.getPrev();
		
		// find features
		Imgproc.goodFeaturesToTrack(
				fromGray,
				fromFeaturePoints,
				this.getMaxCorners(),
				this.getQualityLevel(),
				this.getMinDistance());
		fromFeaturePoints.convertTo(fromFeaturePoints2f, CvType.CV_32FC2);
		
		// calculate optical flow
		Video.calcOpticalFlowPyrLK(
				fromGray,
				toGray,
				fromFeaturePoints2f,
				toFeaturePoints2f,
				status,
				err);
		
		Core.subtract(toFeaturePoints2f, fromFeaturePoints2f, motion);
		
		meanMotion = weightedMean(motion,err);
		meanDistance = distance(meanMotion);
		meanError = mean(err);
		
		minMotion = min(motion);
		minDistance = distance(minMotion);
		minError = min(err);
		
		maxMotion = max(motion);
		maxDistance = distance(maxMotion);
		maxError = max(err);
		
		if(this.getPosition().size() == 0)
			postion = new Scalar(0,0);
		else
			postion = new Scalar(
				this.getPosition().getLast().val[0] + meanMotion.val[0],
				this.getPosition().getLast().val[1] + meanMotion.val[1]);

		img.setAnnotation("optical_flow_features", toFeaturePoints2f);
		img.setAnnotation("optical_flow_features_motion", motion);
		img.setAnnotation("optival_flow_features_error", err);
		
		img.setAnnotation("optical_flow_mean_motion", meanMotion);
		img.setAnnotation("optical_flow_mean_error", meanError);
		img.setAnnotation("optical_flow_mean_distance", meanDistance);
		
		img.setAnnotation("optical_flow_min_motion", minMotion);
		img.setAnnotation("optical_flow_min_error", minError);
		img.setAnnotation("optical_flow_min_distance", minDistance);
		
		img.setAnnotation("optical_flow_max_motion", maxMotion);
		img.setAnnotation("optical_flow_max_error", maxError);
		img.setAnnotation("optical_flow_max_distance", maxDistance);
		
		img.setAnnotation("optical_flow_position", postion);
		
		this.getPosition().addLast(postion);
		
		this.getObserver().fireModulePerformedEvent(this,img);
		
		this.setPrev(toGray);
		
		return img;
	}

	private static Scalar max(MatOfFloat err) {
		double val;
		
		val = 0;
		
		for(int r = 0; r < err.rows(); r++) {
			val = Math.max(val,err.get(r, 0)[0]);
		}
		
		return new Scalar(val);
	}

	private static Scalar max(MatOfPoint2f motion) {
		double[] val;
		
		val = new double[] {0,0};
		
		for(int r = 0; r < motion.rows(); r++) {
			val[0] = Math.max(val[0],motion.get(r, 0)[0]);
			val[1] = Math.max(val[1],motion.get(r, 0)[1]);
		}
		
		return new Scalar(val);
	}

	private static Scalar min(MatOfFloat err) {
		double val;
		
		val = 0;
		
		for(int r = 0; r < err.rows(); r++) {
			val = Math.min(val,err.get(r, 0)[0]);
		}
		
		return new Scalar(val);
	}

	private static Scalar min(MatOfPoint2f motion) {
		double[] val;
		
		val = new double[] {0,0};
		
		for(int r = 0; r < motion.rows(); r++) {
			val[0] = Math.min(val[0],motion.get(r, 0)[0]);
			val[1] = Math.min(val[1],motion.get(r, 0)[1]);
		}
		
		return new Scalar(val);
	}

	private static Scalar mean(MatOfFloat err) {
		return Core.mean(err);
	}

	private static Scalar distance(Scalar meanMotion) {
		double t;
		
		t = 0;
		for(double m : meanMotion.val)
			t += m*m;
		
		return new Scalar(Math.sqrt(t));
	}

	private static Scalar weightedMean(MatOfPoint2f motion, MatOfFloat err) {
		double x;
		double y;
		double totalError;
		double maxError;
		
		x = 0;
		y = 0;
		totalError = 0;
		maxError = 0;
		
		for(int i = 0; i < motion.rows(); i++) {
			maxError = Math.max(maxError, err.get(i, 0)[0]);
		}
		if(maxError < 1)
			return Core.mean(motion);
		
		for(int i = 0; i < motion.rows(); i++) {
			double weightedError;
			
			weightedError = (1 - (err.get(i, 0)[0] / maxError));
			
			x += motion.get(i, 0)[0] * weightedError;
			y += motion.get(i, 0)[1] * weightedError;
			totalError += weightedError;
		}
		
		return new Scalar(x/totalError, y/totalError);
	}

	/**
	 * TODO no doc
	 * @return
	 */
	public IModule getSource() {
		return this.source;
	}

	/**
	 * TODO no doc
	 * @param source
	 */
	public void setSource(IModule source) {
		this.source = source;
	}

	/**
	 * TODO no doc
	 * @return
	 */
	public Mat getPrev() {
		return this.prev;
	}

	/**
	 * TODO no doc
	 * @param prev
	 */
	public void setPrev(Mat prev) {
		this.prev = prev;
	}

	/**
	 * TODO no doc
	 * @return
	 */
	public int getMaxCorners() {
		return this.maxCorners;
	}

	/**
	 * TODO no doc
	 * @param maxCorners
	 */
	public void setMaxCorners(int maxCorners) {
		this.maxCorners = maxCorners;
	}

	/**
	 * TODO no doc
	 * @return
	 */
	public double getQualityLevel() {
		return this.qualityLevel;
	}

	/**
	 * TODO no doc
	 * @param qualityLevel
	 */
	public void setQualityLevel(double qualityLevel) {
		this.qualityLevel = qualityLevel;
	}

	/**
	 * TODO no doc
	 * @return
	 */
	public double getMinDistance() {
		return this.minDistance;
	}

	/**
	 * TODO no doc
	 * @param minDistance
	 */
	public void setMinDistance(double minDistance) {
		this.minDistance = minDistance;
	}

	public boolean isDebug() {
		return this.debug;
	}

	public void setDebug(boolean debug) {
		this.debug = debug;
	}

	public ModuleOpticalFlowLKDebugGUI getDebugGui() {
		return this.debugGui;
	}

	public void setDebugGui(ModuleOpticalFlowLKDebugGUI debugGui) {
		this.debugGui = debugGui;
	}

	public LinkedList<Scalar> getPosition() {
		return this.position;
	}

}
