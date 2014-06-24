package de.uni_tuebingen.gris.pmb.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="bool")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConfigurationPropertyBoolean extends ConfigurationProperty<Boolean> implements IConfigurationPropertyBoolean {

	/**
	 * TODO no doc
	 */
	private static final long serialVersionUID = -8331402891130909730L;
	
	@XmlAttribute(required=true, name="value")
	private Boolean value;

	public ConfigurationPropertyBoolean() {
		super();
	}

	public ConfigurationPropertyBoolean(ConfigurationPropertyBoolean configurationProperty) {
		this(configurationProperty.getKey(),configurationProperty.getValue());
	}

	public ConfigurationPropertyBoolean(String key, Boolean value) {
		super(key);
		this.value = value;
	}

	/**
	 * TODO no doc
	 */
	@Override
	public ConfigurationPropertyBoolean clone() {
		return new ConfigurationPropertyBoolean(this);
	}

	@Override
	public Boolean getValue() {
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
		ConfigurationPropertyBoolean other = (ConfigurationPropertyBoolean) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	
}
