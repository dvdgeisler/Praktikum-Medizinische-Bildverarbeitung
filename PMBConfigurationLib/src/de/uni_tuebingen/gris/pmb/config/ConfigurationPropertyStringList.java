package de.uni_tuebingen.gris.pmb.config;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="strings")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConfigurationPropertyStringList extends ConfigurationProperty<ArrayList<String>> implements IConfigurationPropertyStringList {

	/**
	 * TODO no doc
	 */
	private static final long serialVersionUID = 8390613102316875037L;

	@XmlElement(required=true, name="string")
	private ArrayList<String> value;
	
	public ConfigurationPropertyStringList() {
		super();
	}

	public ConfigurationPropertyStringList(ConfigurationPropertyStringList configurationProperty) {
		this(configurationProperty.getKey(),configurationProperty.getValue());
	}

	public ConfigurationPropertyStringList(String key, ArrayList<String> value) {
		super(key);
		this.value = value;
	}

	/**
	 * TODO no doc
	 */
	@Override
	public ConfigurationPropertyStringList clone() {
		return new ConfigurationPropertyStringList(this);
	}

	@Override
	public ArrayList<String> getValue() {
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
		ConfigurationPropertyStringList other = (ConfigurationPropertyStringList) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	
}
