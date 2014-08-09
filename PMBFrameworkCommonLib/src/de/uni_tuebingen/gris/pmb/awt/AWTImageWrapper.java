package de.uni_tuebingen.gris.pmb.awt;

import java.awt.image.BufferedImage;
import java.util.Hashtable;

import de.uni_tuebingen.gris.pmb.data.IImage;

public class AWTImageWrapper extends BufferedImage {

	private final IImage image;
	
	public AWTImageWrapper(IImage image) {
		super(new AWTImageColorModel(image), new AWTImageRasterWrapper(image), false, new Hashtable<Object, Object>());
		this.image = image;
	}

	public IImage getImage() {
		return this.image;
	}

}
