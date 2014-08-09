package de.uni_tuebingen.gris.pmb.awt;

import java.awt.color.ColorSpace;
import java.awt.image.DataBuffer;

import org.opencv.core.CvType;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import de.uni_tuebingen.gris.pmb.data.IImage;

public final class AWTImageUtils {
	
	private AWTImageUtils() {};
	
	public static int getDataType(IImage image) {
		switch (CvType.depth(image.getType())) {
		case CvType.CV_8S:
		case CvType.CV_8U:
			return DataBuffer.TYPE_BYTE;
		case CvType.CV_16S:
			return DataBuffer.TYPE_SHORT;
		case CvType.CV_16U:
			return DataBuffer.TYPE_USHORT;
		case CvType.CV_32F:
			return DataBuffer.TYPE_FLOAT;
		case CvType.CV_32S:
			return DataBuffer.TYPE_INT;
		case CvType.CV_64F:
			return DataBuffer.TYPE_DOUBLE;
		default:
			return DataBuffer.TYPE_UNDEFINED;
		}
	}

	public static int getPixelBits(IImage image) {
		return CvType.ELEM_SIZE(image.getType()) * 8;
	}

	public static int[] getBits(IImage image) {
		int[] bits;
		
		bits = new int[getChannels(image)];
		for(int i = 0; i < bits.length; i++)
			bits[i] = getPixelBits(image)/getChannels(image);
		
		return bits;
	}

	public static int getChannels(IImage image) {
		return CvType.channels(image.getType());
	}

	public static ColorSpace getColorSpace(IImage image) {
		switch(getChannels(image)) {
		case 1:
			return ColorSpace.getInstance(ColorSpace.CS_GRAY);
		case 3:
			return ColorSpace.getInstance(ColorSpace.CS_sRGB);
		case 4:
			return ColorSpace.getInstance(ColorSpace.CS_sRGB);
		default:
			throw new NotImplementedException();
		}
	}

	public static boolean hasAlpha(IImage image) {
		return getChannels(image) > 3;
	}
}
