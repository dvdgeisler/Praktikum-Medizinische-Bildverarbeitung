package de.uni_tuebingen.gris.pmb.data;

import org.opencv.core.Mat;

public interface IImage {
	
	Mat getData();
	
	Object setAnnotation(String key, Object value);
	
	Object getAnnotation(String key);
	
	Object removeAnnotation(String key);

	int getType();
	
	int getWidth();
	
	int getHeight();

	int getSize();
}