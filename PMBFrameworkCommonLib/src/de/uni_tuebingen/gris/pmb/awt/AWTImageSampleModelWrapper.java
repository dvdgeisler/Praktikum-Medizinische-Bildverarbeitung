package de.uni_tuebingen.gris.pmb.awt;

import java.awt.image.DataBuffer;
import java.awt.image.SampleModel;

import org.opencv.core.CvType;

import de.uni_tuebingen.gris.pmb.data.IImage;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class AWTImageSampleModelWrapper extends SampleModel {
	
	private final IImage image;

	public AWTImageSampleModelWrapper(IImage image) {
		super(AWTImageUtils.getDataType(image), image.getWidth(), image.getHeight(), CvType.channels(image.getType()));
		this.image = image;
	}

	public IImage getImage() {
		return this.image;
	}

	@Override
	public int getNumDataElements() {
		return this.getNumBands();
	}

	@Override
	public Object getDataElements(int x, int y, Object ret, DataBuffer dataBuffer) {
		AWTImageDataBufferWrapper db;
		
		if(dataBuffer instanceof AWTImageDataBufferWrapper) {
			db = (AWTImageDataBufferWrapper) dataBuffer;
			switch(dataBuffer.getDataType()) {
				case DataBuffer.TYPE_BYTE:
					return db.getPixel(x, y, (byte[]) ret, db);
				case DataBuffer.TYPE_SHORT:
				case DataBuffer.TYPE_USHORT:
					return db.getPixel(x, y, (short[]) ret, db);
				case DataBuffer.TYPE_INT:
					return db.getPixel(x, y, (int[]) ret, db);
				case DataBuffer.TYPE_DOUBLE:
					return db.getPixel(x, y, (double[]) ret, db);
				case DataBuffer.TYPE_FLOAT:
					return db.getPixel(x, y, (float[]) ret, db);
				case DataBuffer.TYPE_UNDEFINED:
				default:
					throw new NotImplementedException();
			}
		}
		throw new NotImplementedException();
	}

	@Override
	public void setDataElements(int x, int y, Object value, DataBuffer dataBuffer) {
		throw new NotImplementedException();
	}

	@Override
	public int getSample(int x, int y, int c, DataBuffer dataBuffer) {
		throw new NotImplementedException();
	}

	@Override
	public void setSample(int x, int y, int c, int value, DataBuffer dataBuffer) {
		throw new NotImplementedException();
	}

	@Override
	public SampleModel createCompatibleSampleModel(int w, int h) {
		throw new NotImplementedException();
	}

	@Override
	public SampleModel createSubsetSampleModel(int[] bands) {
		throw new NotImplementedException();
	}

	@Override
	public DataBuffer createDataBuffer() {
		return new AWTImageDataBufferWrapper(this.getImage());
	}

	@Override
	public int[] getSampleSize() {
		throw new NotImplementedException();
	}

	@Override
	public int getSampleSize(int paramInt) {
		throw new NotImplementedException();
	}

}
