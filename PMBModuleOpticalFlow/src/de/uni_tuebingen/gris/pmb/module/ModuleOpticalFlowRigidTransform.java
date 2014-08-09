package de.uni_tuebingen.gris.pmb.module;

import java.util.LinkedList;
import java.util.logging.Logger;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.video.Video;

import de.uni_tuebingen.gris.pmb.data.IImage;
import de.uni_tuebingen.gris.pmb.module.gui.ModuleOpticalFlowRigidTransformationDebugGUI;

public class ModuleOpticalFlowRigidTransform extends DefaultModule implements IModule {

	private final static String CONFIGURATION_KEY_IMAGE_SOURCE = "source";
	private final static String CONFIGURATION_KEY_FULL_AFFINE = "fullAffine";
	public final static String CONFIGURATION_KEY_DEBUG = "debug";
	
	private IModule source;
	private Mat prev;
	private boolean fullAffine;
	private boolean debug;
	private ModuleOpticalFlowRigidTransformationDebugGUI debugGui;
	private final LinkedList<Mat> transforms;
	
	{
		this.debug = false;
		this.debugGui = null;
		this.source = null;
		this.prev = null;
		this.fullAffine = true;
		this.transforms = new LinkedList<Mat>();
	}
	
	/**
	 * TODO no doc
	 */
	public ModuleOpticalFlowRigidTransform() {
		super();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void initialize() {
		this.setSource(this.getModuleManager().getModule(this.getConfiguration().getString(CONFIGURATION_KEY_IMAGE_SOURCE)));
		
		if(this.getConfiguration().isBooleanKey(CONFIGURATION_KEY_FULL_AFFINE))
			this.setFullAffine(this.getConfiguration().getBoolean(CONFIGURATION_KEY_FULL_AFFINE));
		else
			Logger.global.warning(
					String.format("full affine not specified in configuration! use default: %s", Boolean.toString(this.isFullAffine())));

		if(this.getConfiguration().isBooleanKey(CONFIGURATION_KEY_DEBUG))
			this.setDebug(this.getConfiguration().getBoolean(CONFIGURATION_KEY_DEBUG));
		else
			Logger.global.warning(
					String.format("debug mode not specified in configuration! use default: %s", Boolean.toString(this.isDebug())));
		
		if(this.isDebug())
			this.setDebugGui(new ModuleOpticalFlowRigidTransformationDebugGUI(this));
		
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
		Mat from, to;
		Mat transform, globalTransform;

		// invoke image source
		img = this.getSource().perform();
		to = img.getData();
		
		if(this.getTransform().size() == 0) {
			from = to;
			transform = Mat.eye(3, 3, CvType.CV_64FC1);
			globalTransform = transform;
		} else {
			from = this.getPrev();
			transform = Video.estimateRigidTransform(from, to, true);
			transform.push_back(Mat.zeros(1, 3, transform.type()));
			transform.put(2, 2, 1d);
			
			globalTransform = this.getTransform().getLast().mul(transform);
			
			Core.gemm(transform, this.getTransform().getLast(), 1d, new Mat(), 1d, globalTransform);
		}

		img.setAnnotation("optical_flow_local_transform", transform);
		img.setAnnotation("optical_flow_global_transform", globalTransform);
		
		this.getTransform().addLast(globalTransform);
		
		this.getObserver().fireModulePerformedEvent(this,img);
		
		this.setPrev(to);
		
		return img;
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

	public boolean isDebug() {
		return this.debug;
	}

	public void setDebug(boolean debug) {
		this.debug = debug;
	}

	public ModuleOpticalFlowRigidTransformationDebugGUI getDebugGui() {
		return this.debugGui;
	}

	public void setDebugGui(ModuleOpticalFlowRigidTransformationDebugGUI debugGui) {
		this.debugGui = debugGui;
	}

	public LinkedList<Mat> getTransform() {
		return this.transforms;
	}

	public boolean isFullAffine() {
		return this.fullAffine;
	}

	public void setFullAffine(boolean fullAffine) {
		this.fullAffine = fullAffine;
	}

}
