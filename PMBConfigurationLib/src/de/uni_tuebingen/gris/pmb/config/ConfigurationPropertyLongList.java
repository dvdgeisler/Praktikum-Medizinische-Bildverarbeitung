package de.uni_tuebingen.gris.pmb.config;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="longs")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConfigurationPropertyLongList extends ConfigurationProperty<ArrayList<Long>> implements IConfigurationPropertyLongList {

	/**
	 * TODO no doc
	 */
	private static final long serialVersionUID = -8331402891130909730L;

	@XmlAttribute(required=true, name="value")
	private ArrayList<Long> value;
	
	public ConfigurationPropertyLongList() {
		super();
	}

	public ConfigurationPropertyLongList(ConfigurationPropertyLongList configurationProperty) {
		this(configurationProperty.getKey(),configurationProperty.getValue());
	}

	public ConfigurationPropertyLongList(String key, ArrayList<Long> value) {
		super(key);
		this.value = value;
	}

	/**
	 * TODO no doc
	 */
	@Override
	public ConfigurationPropertyLongList clone() {
		return new ConfigurationPropertyLongList(this);
	}

	@Override
	public ArrayList<Long> getValue() {
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
		ConfigurationPropertyLongList other = (ConfigurationPropertyLongList) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	
}
