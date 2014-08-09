package de.uni_tuebingen.gris.pmb.awt;

import java.awt.Point;
import java.awt.image.WritableRaster;

import de.uni_tuebingen.gris.pmb.data.IImage;

public class AWTImageRasterWrapper extends WritableRaster {

	public AWTImageRasterWrapper(IImage image) {
		super(new AWTImageSampleModelWrapper(image), new AWTImageDataBufferWrapper(image), new Point());
	}

}
