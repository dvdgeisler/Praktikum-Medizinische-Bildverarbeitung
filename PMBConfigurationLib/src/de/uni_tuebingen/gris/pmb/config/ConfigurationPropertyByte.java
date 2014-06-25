package de.uni_tuebingen.gris.pmb.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="byte")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConfigurationPropertyByte extends ConfigurationProperty<Byte> implements IConfigurationPropertyByte {

	/**
	 * TODO no doc
	 */
	private static final long serialVersionUID = -8331402891130909730L;

	@XmlAttribute(required=true, name="value")
	private Byte value;
	
	public ConfigurationPropertyByte() {
		super();
	}

	public ConfigurationPropertyByte(ConfigurationPropertyByte configurationProperty) {
		this(configurationProperty.getKey(),configurationProperty.getValue());
	}

	public ConfigurationPropertyByte(String key, Byte value) {
		super(key);
		this.value = value;
	}

	/**
	 * TODO no doc
	 */
	@Override
	public ConfigurationPropertyByte clone() {
		return new ConfigurationPropertyByte(this);
	}

	@Override
	public Byte getValue() {
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
		ConfigurationPropertyByte other = (ConfigurationPropertyByte) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	
}
