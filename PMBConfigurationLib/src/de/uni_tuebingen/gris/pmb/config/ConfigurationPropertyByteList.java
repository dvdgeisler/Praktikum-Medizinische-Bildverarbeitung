package de.uni_tuebingen.gris.pmb.config;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="bytes")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConfigurationPropertyByteList extends ConfigurationProperty<ArrayList<Byte>> implements IConfigurationPropertyByteList {

	/**
	 * TODO no doc
	 */
	private static final long serialVersionUID = -8331402891130909730L;

	@XmlAttribute(required=true, name="value")
	private ArrayList<Byte> value;
	
	public ConfigurationPropertyByteList() {
		super();
	}

	public ConfigurationPropertyByteList(ConfigurationPropertyByteList configurationProperty) {
		this(configurationProperty.getKey(),configurationProperty.getValue());
	}

	public ConfigurationPropertyByteList(String key, ArrayList<Byte> value) {
		super(key);
		this.value = value;
	}

	/**
	 * TODO no doc
	 */
	@Override
	public ConfigurationPropertyByteList clone() {
		return new ConfigurationPropertyByteList(this);
	}

	@Override
	public ArrayList<Byte> getValue() {
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
		ConfigurationPropertyByteList other = (ConfigurationPropertyByteList) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	
}
