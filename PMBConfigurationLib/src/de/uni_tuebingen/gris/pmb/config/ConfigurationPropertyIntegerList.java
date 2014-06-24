package de.uni_tuebingen.gris.pmb.config;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="integers")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConfigurationPropertyIntegerList extends ConfigurationProperty<ArrayList<Integer>> implements IConfigurationPropertyIntegerList {

	/**
	 * TODO no doc
	 */
	private static final long serialVersionUID = -4550055169617827101L;

	@XmlAttribute(required=true, name="value")
	private ArrayList<Integer> value;
	
	public ConfigurationPropertyIntegerList() {
		super();
	}

	public ConfigurationPropertyIntegerList(ConfigurationPropertyIntegerList configurationProperty) {
		this(configurationProperty.getKey(),configurationProperty.getValue());
	}

	public ConfigurationPropertyIntegerList(String key, ArrayList<Integer> value) {
		super(key);
		this.value = value;
	}

	/**
	 * TODO no doc
	 */
	@Override
	public ConfigurationPropertyIntegerList clone() {
		return new ConfigurationPropertyIntegerList(this);
	}

	@Override
	public ArrayList<Integer> getValue() {
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
		ConfigurationPropertyIntegerList other = (ConfigurationPropertyIntegerList) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	
}
