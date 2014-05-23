package de.uni_tuebingen.gris.pmb.config;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement
public class ConfigurationProperty<T extends Serializable> implements IConfigurationProperty<T> {

	/**
	 * TODO no doc
	 */
	private static final long serialVersionUID = -3292523397733535822L;

	/**
	 * TODO no doc
	 */
	@XmlAttribute
	private String key;
	
	/**
	 * TODO no doc
	 */
	@XmlValue	
	private T value;
	
	/**
	 * TODO no doc
	 */
	public ConfigurationProperty() { }
	
	/**
	 * TODO no doc
	 * @param key
	 * @param value
	 */
	public ConfigurationProperty(String key, T value) {
		this.key = key;
		this.value = value;
	}
	
	/**
	 * TODO no doc
	 */
	@Override
	public String getKey() {
		return this.key;
	}

	/**
	 * TODO no doc
	 */
	@Override
	public T getValue() {
		return this.value;
	}

}
