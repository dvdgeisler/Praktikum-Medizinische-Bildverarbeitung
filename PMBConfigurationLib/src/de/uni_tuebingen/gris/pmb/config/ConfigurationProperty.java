package de.uni_tuebingen.gris.pmb.config;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;

@XmlAccessorType(XmlAccessType.FIELD)
public abstract class ConfigurationProperty<T extends Serializable> implements IConfigurationProperty<T> {

	/**
	 * TODO no doc
	 */
	private static final long serialVersionUID = -3292523397733535822L;

	/**
	 * TODO no doc
	 */
	@XmlAttribute(required=true, name="name")
	@XmlID
	private String key;
	
	/**
	 * TODO no doc
	 */
	public ConfigurationProperty() { }
	
	/**
	 * TODO no doc
	 * @param key
	 * @param value
	 */
	public ConfigurationProperty(String key) {
		this.key = key;
	}
	
	/**
	 * TODO no doc
	 * @param configurationProperty
	 */
	protected ConfigurationProperty(IConfigurationProperty<T> configurationProperty) {
		this(configurationProperty.getKey());
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
	public abstract ConfigurationProperty<T> clone();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConfigurationProperty other = (ConfigurationProperty) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		return true;
	}

}
