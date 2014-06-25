package de.uni_tuebingen.gris.pmb.module;

import java.util.logging.Logger;

import de.uni_tuebingen.gris.pmb.data.DefaultImage;
import de.uni_tuebingen.gris.pmb.data.IImage;

public class ModuleOpticalFlow extends DefaultModule implements IModule {
	
	public ModuleOpticalFlow() {
		super();
	}

	@Override
	public void initialize() {
		Logger.getGlobal().info("initialize optical flow module");
	}

	@Override
	public IImage perform() {
		IImage img;
		
		img = new DefaultImage();

		
		return img;
	}

}
