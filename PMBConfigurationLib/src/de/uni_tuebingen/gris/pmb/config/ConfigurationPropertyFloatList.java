package de.uni_tuebingen.gris.pmb.config;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="floats")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConfigurationPropertyFloatList extends ConfigurationProperty<ArrayList<Float>> implements IConfigurationPropertyFloatList {

	/**
	 * TODO no doc
	 */
	private static final long serialVersionUID = -8331402891130909730L;

	@XmlAttribute(required=true, name="value")
	private ArrayList<Float> value;
	
	public ConfigurationPropertyFloatList() {
		super();
	}

	public ConfigurationPropertyFloatList(ConfigurationPropertyFloatList configurationProperty) {
		this(configurationProperty.getKey(),configurationProperty.getValue());
	}

	public ConfigurationPropertyFloatList(String key, ArrayList<Float> value) {
		super(key);
		this.value = value;
	}

	/**
	 * TODO no doc
	 */
	@Override
	public ConfigurationPropertyFloatList clone() {
		return new ConfigurationPropertyFloatList(this);
	}

	@Override
	public ArrayList<Float> getValue() {
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
		ConfigurationPropertyFloatList other = (ConfigurationPropertyFloatList) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	
}
