package de.uni_tuebingen.gris.pmb.awt;

import java.awt.Color;
import java.awt.Transparency;
import java.awt.image.ColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.Raster;

import de.uni_tuebingen.gris.pmb.data.IImage;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class AWTImageColorModel extends ColorModel {

	public AWTImageColorModel(IImage image) {
		super(	AWTImageUtils.getPixelBits(image),
				AWTImageUtils.getBits(image),
				AWTImageUtils.getColorSpace(image),
				AWTImageUtils.hasAlpha(image),
				false,
				Transparency.OPAQUE,
				AWTImageUtils.getDataType(image));
	}

	@Override
	public int getAlpha(int pix) {
		return new Color(pix, this.hasAlpha()).getAlpha();
	}

	@Override
	public int getBlue(int pix) {
		return new Color(pix, this.hasAlpha()).getBlue();
	}

	@Override
	public int getGreen(int pix) {
		return new Color(pix, this.hasAlpha()).getGreen();
	}

	@Override
	public int getRed(int pix) {
		return new Color(pix, this.hasAlpha()).getRed();
	}

	@Override
	public boolean isCompatibleRaster(Raster raster) {
		return raster instanceof AWTImageRasterWrapper;
	}

	@Override
	public Object getDataElements(int rgb, Object pixel) {
		switch (this.getTransferType()) {
		case DataBuffer.TYPE_BYTE:
			return this.getDataElements(rgb, (byte[]) pixel); 
		case DataBuffer.TYPE_SHORT:
		case DataBuffer.TYPE_USHORT:
			return this.getDataElements(rgb, (short[]) pixel); 
		case DataBuffer.TYPE_INT:
			return this.getDataElements(rgb, (int[]) pixel); 
		case DataBuffer.TYPE_FLOAT:
			return this.getDataElements(rgb, (float[]) pixel); 
		case DataBuffer.TYPE_DOUBLE:
			return this.getDataElements(rgb, (double[]) pixel); 
		default:
			throw new NotImplementedException();
		}
	}
	
	public byte[] getDataElements(int rgb, byte[] pixel) {
		byte[] ret;
		
		if(pixel != null)
			ret = pixel;
		else
			ret = new byte[this.getNumComponents()];
		
		if(this.hasAlpha()) {
			ret[0] = (byte) this.getAlpha(rgb);
			ret[1] = (byte) this.getRed(rgb);
			ret[2] = (byte) this.getGreen(rgb);
			ret[3] = (byte) this.getBlue(rgb);
		} else {
			ret[0] = (byte) this.getRed(rgb);
			ret[1] = (byte) this.getGreen(rgb);
			ret[2] = (byte) this.getBlue(rgb);
		}
		
		return ret;
	}
	
	public short[] getDataElements(int rgb, short[] pixel) {
		short[] ret;
		
		if(pixel != null)
			ret = pixel;
		else
			ret = new short[this.getNumComponents()];
		
		if(this.hasAlpha()) {
			ret[0] = (short) this.getAlpha(rgb);
			ret[1] = (short) this.getRed(rgb);
			ret[2] = (short) this.getGreen(rgb);
			ret[3] = (short) this.getBlue(rgb);
		} else {
			ret[0] = (short) this.getRed(rgb);
			ret[1] = (short) this.getGreen(rgb);
			ret[2] = (short) this.getBlue(rgb);
		}
		
		return ret;
	}
	
	public int[] getDataElements(int rgb, int[] pixel) {
		int[] ret;
		
		if(pixel != null)
			ret = pixel;
		else
			ret = new int[this.getNumComponents()];
		
		if(this.hasAlpha()) {
			ret[0] = (int) this.getAlpha(rgb);
			ret[1] = (int) this.getRed(rgb);
			ret[2] = (int) this.getGreen(rgb);
			ret[3] = (int) this.getBlue(rgb);
		} else {
			ret[0] = (int) this.getRed(rgb);
			ret[1] = (int) this.getGreen(rgb);
			ret[2] = (int) this.getBlue(rgb);
		}
		
		return ret;
	}
	
	public float[] getDataElements(int rgb, float[] pixel) {
		float[] ret;
		
		if(pixel != null)
			ret = pixel;
		else
			ret = new float[this.getNumComponents()];
		
		if(this.hasAlpha()) {
			ret[0] = (float) this.getAlpha(rgb);
			ret[1] = (float) this.getRed(rgb);
			ret[2] = (float) this.getGreen(rgb);
			ret[3] = (float) this.getBlue(rgb);
		} else {
			ret[0] = (float) this.getRed(rgb);
			ret[1] = (float) this.getGreen(rgb);
			ret[2] = (float) this.getBlue(rgb);
		}
		
		return ret;
	}
	
	public double[] getDataElements(int rgb, double[] pixel) {
		double[] ret;
		
		if(pixel != null)
			ret = pixel;
		else
			ret = new double[this.getNumComponents()];
		
		if(this.hasAlpha()) {
			ret[0] = (double) this.getAlpha(rgb);
			ret[1] = (double) this.getRed(rgb);
			ret[2] = (double) this.getGreen(rgb);
			ret[3] = (double) this.getBlue(rgb);
		} else {
			ret[0] = (double) this.getRed(rgb);
			ret[1] = (double) this.getGreen(rgb);
			ret[2] = (double) this.getBlue(rgb);
		}
		
		return ret;
	}
	
	@Override
	public int getAlpha(Object pix) {
		
		if(pix instanceof byte[]) {
			byte[] pixel;
			
			pixel = (byte[]) pix;
			if(this.hasAlpha())
				return new Color(pixel[0]&0xff, pixel[1]&0xff, pixel[2]&0xff, pixel[3]&0xff).getAlpha();
			else
				return new Color(pixel[0]&0xff, pixel[1]&0xff, pixel[2]&0xff).getAlpha();
		}
		
		if(pix instanceof short[]) {
			short[] pixel;
			
			pixel = (short[]) pix;
			if(this.hasAlpha())
				return new Color(pixel[0]&0xffff, pixel[1]&0xffff, pixel[2]&0xffff, pixel[3]&0xffff).getAlpha();
			else
				return new Color(pixel[0]&0xffff, pixel[1]&0xffff, pixel[2]&0xffff).getAlpha();
		}
		
		if(pix instanceof int[]) {
			int[] pixel;
			
			pixel = (int[]) pix;
			if(this.hasAlpha())
				return new Color(pixel[0], pixel[1], pixel[2], pixel[3]).getAlpha();
			else
				return new Color(pixel[0], pixel[1], pixel[2]).getAlpha();
		}
		
		if(pix instanceof float[]) {
			float[] pixel;
			
			pixel = (float[]) pix;
			if(this.hasAlpha())
				return new Color(pixel[0], pixel[1], pixel[2], pixel[3]).getAlpha();
			else
				return new Color(pixel[0], pixel[1], pixel[2]).getAlpha();
		}
		
		if(pix instanceof double[]) {
			double[] pixel;
			
			pixel = (double[]) pix;
			if(this.hasAlpha())
				return new Color((float)pixel[0], (float)pixel[1], (float)pixel[2], (float)pixel[3]).getAlpha();
			else
				return new Color((float)pixel[0], (float)pixel[1], (float)pixel[2]).getAlpha();
		}
		
		throw new NotImplementedException();
	}

	@Override
	public int getBlue(Object pix) {
		
		if(pix instanceof byte[]) {
			byte[] pixel;
			
			pixel = (byte[]) pix;
			if(this.hasAlpha())
				return new Color(pixel[0]&0xff, pixel[1]&0xff, pixel[2]&0xff, pixel[3]&0xff).getBlue();
			else
				return new Color(pixel[0]&0xff, pixel[1]&0xff, pixel[2]&0xff).getBlue();
		}
		
		if(pix instanceof short[]) {
			short[] pixel;
			
			pixel = (short[]) pix;
			if(this.hasAlpha())
				return new Color(pixel[0]&0xffff, pixel[1]&0xffff, pixel[2]&0xffff, pixel[3]&0xffff).getBlue();
			else
				return new Color(pixel[0]&0xffff, pixel[1]&0xffff, pixel[2]&0xffff).getBlue();
		}
		
		if(pix instanceof int[]) {
			int[] pixel;
			
			pixel = (int[]) pix;
			if(this.hasAlpha())
				return new Color(pixel[0], pixel[1], pixel[2], pixel[3]).getBlue();
			else
				return new Color(pixel[0], pixel[1], pixel[2]).getBlue();
		}
		
		if(pix instanceof float[]) {
			float[] pixel;
			
			pixel = (float[]) pix;
			if(this.hasAlpha())
				return new Color(pixel[0], pixel[1], pixel[2], pixel[3]).getBlue();
			else
				return new Color(pixel[0], pixel[1], pixel[2]).getBlue();
		}
		
		if(pix instanceof double[]) {
			double[] pixel;
			
			pixel = (double[]) pix;
			if(this.hasAlpha())
				return new Color((float)pixel[0], (float)pixel[1], (float)pixel[2], (float)pixel[3]).getBlue();
			else
				return new Color((float)pixel[0], (float)pixel[1], (float)pixel[2]).getBlue();
		}
		
		throw new NotImplementedException();
	}

	@Override
	public int getGreen(Object pix) {
		
		if(pix instanceof byte[]) {
			byte[] pixel;
			
			pixel = (byte[]) pix;
			if(this.hasAlpha())
				return new Color(pixel[0]&0xff, pixel[1]&0xff, pixel[2]&0xff, pixel[3]&0xff).getGreen();
			else
				return new Color(pixel[0]&0xff, pixel[1]&0xff, pixel[2]&0xff).getGreen();
		}
		
		if(pix instanceof short[]) {
			short[] pixel;
			
			pixel = (short[]) pix;
			if(this.hasAlpha())
				return new Color(pixel[0], pixel[1], pixel[2], pixel[3]).getGreen();
			else
				return new Color(pixel[0], pixel[1], pixel[2]).getGreen();
		}
		
		if(pix instanceof int[]) {
			int[] pixel;
			
			pixel = (int[]) pix;
			if(this.hasAlpha())
				return new Color(pixel[0], pixel[1], pixel[2], pixel[3]).getGreen();
			else
				return new Color(pixel[0], pixel[1], pixel[2]).getGreen();
		}
		
		if(pix instanceof float[]) {
			float[] pixel;
			
			pixel = (float[]) pix;
			if(this.hasAlpha())
				return new Color(pixel[0], pixel[1], pixel[2], pixel[3]).getGreen();
			else
				return new Color(pixel[0], pixel[1], pixel[2]).getGreen();
		}
		
		if(pix instanceof double[]) {
			double[] pixel;
			
			pixel = (double[]) pix;
			if(this.hasAlpha())
				return new Color((float)pixel[0], (float)pixel[1], (float)pixel[2], (float)pixel[3]).getGreen();
			else
				return new Color((float)pixel[0], (float)pixel[1], (float)pixel[2]).getGreen();
		}
		
		throw new NotImplementedException();
	}

	@Override
	public int getRed(Object pix) {
		
		if(pix instanceof byte[]) {
			byte[] pixel;
			
			pixel = (byte[]) pix;
			if(this.hasAlpha())
				return new Color(pixel[0]&0xff, pixel[1]&0xff, pixel[2]&0xff, pixel[3]&0xff).getRed();
			else
				return new Color(pixel[0]&0xff, pixel[1]&0xff, pixel[2]&0xff).getRed();
		}
		
		if(pix instanceof short[]) {
			short[] pixel;
			
			pixel = (short[]) pix;
			if(this.hasAlpha())
				return new Color(pixel[0]&0xffff, pixel[1]&0xffff, pixel[2]&0xffff, pixel[3]&0xffff).getRed();
			else
				return new Color(pixel[0]&0xffff, pixel[1]&0xffff, pixel[2]&0xffff).getRed();
		}
		
		if(pix instanceof int[]) {
			int[] pixel;
			
			pixel = (int[]) pix;
			if(this.hasAlpha())
				return new Color(pixel[0], pixel[1], pixel[2], pixel[3]).getRed();
			else
				return new Color(pixel[0], pixel[1], pixel[2]).getRed();
		}
		
		if(pix instanceof float[]) {
			float[] pixel;
			
			pixel = (float[]) pix;
			if(this.hasAlpha())
				return new Color(pixel[0], pixel[1], pixel[2], pixel[3]).getRed();
			else
				return new Color(pixel[0], pixel[1], pixel[2]).getRed();
		}
		
		if(pix instanceof double[]) {
			double[] pixel;
			
			pixel = (double[]) pix;
			if(this.hasAlpha())
				return new Color((float)pixel[0], (float)pixel[1], (float)pixel[2], (float)pixel[3]).getRed();
			else
				return new Color((float)pixel[0], (float)pixel[1], (float)pixel[2]).getRed();
		}
		
		throw new NotImplementedException();
	}

}
