package de.uni_tuebingen.gris.pmb.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="integer")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConfigurationPropertyInteger extends ConfigurationProperty<Integer> implements IConfigurationPropertyInteger {

	/**
	 * TODO no doc
	 */
	private static final long serialVersionUID = -4550055169617827101L;

	@XmlElement(required=true, name="value")
	private Integer value;
	
	public ConfigurationPropertyInteger() {
		super();
	}

	public ConfigurationPropertyInteger(ConfigurationPropertyInteger configurationProperty) {
		this(configurationProperty.getKey(),configurationProperty.getValue());
	}

	public ConfigurationPropertyInteger(String key, Integer value) {
		super(key);
		this.value = value;
	}

	/**
	 * TODO no doc
	 */
	@Override
	public ConfigurationPropertyInteger clone() {
		return new ConfigurationPropertyInteger(this);
	}

	@Override
	public Integer getValue() {
		return this.value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConfigurationPropertyInteger other = (ConfigurationPropertyInteger) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	
}
