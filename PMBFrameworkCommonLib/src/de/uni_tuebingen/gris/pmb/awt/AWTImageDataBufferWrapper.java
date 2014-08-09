package de.uni_tuebingen.gris.pmb.awt;

import java.awt.image.DataBuffer;

import org.opencv.core.CvType;

import de.uni_tuebingen.gris.pmb.data.IImage;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class AWTImageDataBufferWrapper extends DataBuffer {
	
	private final IImage image;
	
	public AWTImageDataBufferWrapper(IImage image) {
		super(AWTImageUtils.getDataType(image),image.getSize());
		this.image = image;
	}

	public IImage getImage() {
		return this.image;
	}

	@Override
	public int getElem(int bank, int i) {
		throw new NotImplementedException();
	}

	@Override
	public void setElem(int bank, int i, int value) {
		throw new NotImplementedException();
	}

	@Override
	public double getElemDouble(int bank, int i) {
		throw new NotImplementedException();
	}

	@Override
	public void setElemDouble(int bank, int i, double value) {
		throw new NotImplementedException();
	}

	@Override
	public float getElemFloat(int bank, int i) {
		throw new NotImplementedException();
	}

	@Override
	public void setElemFloat(int bank, int i, float value) {
		throw new NotImplementedException();
	}

	public int getChannels() {
		return CvType.channels(this.getImage().getType());
	}

	public byte[] getPixel(int x, int y, byte[] ret, AWTImageDataBufferWrapper db) {
		byte[] pixel;
		
		if(ret != null)
			pixel = ret;
		else
			pixel = new byte[this.getChannels()];
		
		this.getImage().getData().get(y, x, pixel);
		
		return pixel;
	}

	public short[] getPixel(int x, int y, short[] ret, AWTImageDataBufferWrapper db) {
		short[] pixel;
		
		if(ret != null)
			pixel = ret;
		else
			pixel = new short[this.getChannels()];
		
		this.getImage().getData().get(y, x, pixel);
		
		return pixel;
	}

	public int[] getPixel(int x, int y, int[] ret, AWTImageDataBufferWrapper db) {
		int[] pixel;
		
		if(ret != null)
			pixel = ret;
		else
			pixel = new int[this.getChannels()];
		
		this.getImage().getData().get(y, x, pixel);
		
		return pixel;
	}

	public float[] getPixel(int x, int y, float[] ret, AWTImageDataBufferWrapper db) {
		float[] pixel;
		
		if(ret != null)
			pixel = ret;
		else
			pixel = new float[this.getChannels()];
		
		this.getImage().getData().get(y, x, pixel);
		
		return pixel;
	}

	public double[] getPixel(int x, int y, double[] ret, AWTImageDataBufferWrapper db) {
		double[] pixel;
		
		if(ret != null)
			pixel = ret;
		else
			pixel = new double[this.getChannels()];
		
		this.getImage().getData().get(y, x, pixel);
		
		return pixel;
	}
}
