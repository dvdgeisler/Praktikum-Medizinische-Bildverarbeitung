package de.uni_tuebingen.gris.pmb.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="string")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConfigurationPropertyString extends ConfigurationProperty<String> implements IConfigurationPropertyString {

	/**
	 * TODO no doc
	 */
	private static final long serialVersionUID = 8390613102316875037L;

	@XmlAttribute(required=true, name="value")
	private String value;
	
	public ConfigurationPropertyString() {
		super();
	}

	public ConfigurationPropertyString(ConfigurationPropertyString configurationProperty) {
		this(configurationProperty.getKey(),configurationProperty.getValue());
	}

	public ConfigurationPropertyString(String key, String value) {
		super(key);
		this.value = value;
	}

	/**
	 * TODO no doc
	 */
	@Override
	public ConfigurationPropertyString clone() {
		return new ConfigurationPropertyString(this);
	}

	@Override
	public String getValue() {
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
		ConfigurationPropertyString other = (ConfigurationPropertyString) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	
}
