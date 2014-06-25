package de.uni_tuebingen.gris.pmb.data;

import java.util.HashMap;
import java.util.Map;

import org.opencv.core.Mat;

public class DefaultImage implements IImage {
	
	private final Mat data;
	private final Map<String, Object> annotations;
	
	public DefaultImage() {
		this.data = new Mat();
		this.annotations = new HashMap<String, Object>();
	}

	@Override
	public Object setAnnotation(String key, Object value) {
		return this.annotations.put(key, value);
	}

	@Override
	public Object getAnnotation(String key) {
		return this.annotations.get(key);
	}

	@Override
	public Object removeAnnotation(String key) {
		return this.annotations.remove(key);
	}

	@Override
	public Mat getData() {
		return this.data;
	}

}
