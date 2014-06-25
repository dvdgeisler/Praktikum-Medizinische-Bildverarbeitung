package de.uni_tuebingen.gris.pmb.module;

import java.util.logging.Logger;

import org.opencv.highgui.VideoCapture;

import de.uni_tuebingen.gris.pmb.data.DefaultImage;
import de.uni_tuebingen.gris.pmb.data.IImage;

public class ModuleVideoReader extends DefaultModule implements IModule {
	
	private VideoCapture videoCapture;
	
	public ModuleVideoReader() {
		super();
	}

	@Override
	public void initialize() {
		Logger.getGlobal().info("initialize video reader module");
		this.setVideoCapture(new VideoCapture(this.getConfiguration().getString("source")));
	}

	@Override
	public IImage perform() {
		IImage img;
		
		img = new DefaultImage();
		if(!this.getVideoCapture().read(img.getData()))
			Logger.getGlobal().info("End of video stream");
		
		return img;
	}

	public VideoCapture getVideoCapture() {
		return this.videoCapture;
	}

	public void setVideoCapture(VideoCapture videoCapture) {
		this.videoCapture = videoCapture;
	}

}
