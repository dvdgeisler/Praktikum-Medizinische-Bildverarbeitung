package de.uni_tuebingen.gris.pmb.module;

import java.util.logging.Logger;

import org.opencv.highgui.VideoCapture;

import de.uni_tuebingen.gris.pmb.data.DefaultImage;
import de.uni_tuebingen.gris.pmb.data.IImage;
import de.uni_tuebingen.gris.pmb.module.gui.ModuleVideoReaderDebugGUI;

public class ModuleVideoReader extends DefaultModule implements IModule {

	public final static String CONFIGURATION_KEY_IMAGE_SOURCE = "source";
	public final static String CONFIGURATION_KEY_DEBUG = "debug";
	
	private VideoCapture videoCapture;
	private boolean debug;
	private ModuleVideoReaderDebugGUI debugGui;
	
	{
		this.videoCapture = null;
		this.debug = false;
		this.debugGui = null;
	}
	
	/**
	 * TODO no doc
	 */
	public ModuleVideoReader() {
		super();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void initialize() {
		this.setVideoCapture(new VideoCapture(this.getConfiguration().getString(CONFIGURATION_KEY_IMAGE_SOURCE)));
		
		if(this.getConfiguration().isBooleanKey(CONFIGURATION_KEY_DEBUG))
			this.setDebug(this.getConfiguration().getBoolean(CONFIGURATION_KEY_DEBUG));
		else
			Logger.getGlobal().warning(
					String.format("maximal corners not specified in configuration! use default: %s", Boolean.toString(this.isDebug())));
		
		if(this.isDebug())
			this.setDebugGui(new ModuleVideoReaderDebugGUI(this));
		
		this.getObserver().fireModuleInitializedEvent(this);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void deinitialized() {
		this.getVideoCapture().release();
		this.setVideoCapture(null);
		this.getObserver().fireModuleDeinitializedEvent(this);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IImage perform() {
		IImage img;
		
		img = new DefaultImage();
		if(!this.getVideoCapture().read(img.getData()))
			Logger.getGlobal().info("End of video stream");
		
		this.getObserver().fireModulePerformedEvent(this, img);
		
		return img;
	}

	/**
	 * TODO no doc
	 * @return
	 */
	public VideoCapture getVideoCapture() {
		return this.videoCapture;
	}

	/**
	 * TODO no doc
	 * @param videoCapture
	 */
	public void setVideoCapture(VideoCapture videoCapture) {
		this.videoCapture = videoCapture;
	}

	public boolean isDebug() {
		return this.debug;
	}

	public void setDebug(boolean debug) {
		this.debug = debug;
	}

	public ModuleVideoReaderDebugGUI getDebugGui() {
		return this.debugGui;
	}

	public void setDebugGui(ModuleVideoReaderDebugGUI debugGui) {
		this.debugGui = debugGui;
	}

}
