package de.uni_tuebingen.gris.pmb.config;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement
public class ConfigurationProperty<T extends Serializable> implements IConfigurationProperty<T> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3292523397733535822L;

	@XmlAttribute
	private String key;
	
	@XmlValue	
	private T value;
	
	public ConfigurationProperty() { }
	
	public ConfigurationProperty(String key, T value) {
		this.key = key;
		this.value = value;
	}
	
	@Override
	public String getKey() {
		return this.key;
	}

	@Override
	public T getValue() {
		return this.value;
	}

}
