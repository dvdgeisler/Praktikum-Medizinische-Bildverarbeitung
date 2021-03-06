package de.uni_tuebingen.gris.pmb.config;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="doubles")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConfigurationPropertyDoubleList extends ConfigurationProperty<ArrayList<Double>> implements IConfigurationPropertyDoubleList {

	/**
	 * TODO no doc
	 */
	private static final long serialVersionUID = -8331402891130909730L;

	@XmlAttribute(required=true, name="value")
	private ArrayList<Double> value;
	
	public ConfigurationPropertyDoubleList() {
		super();
	}

	public ConfigurationPropertyDoubleList(ConfigurationPropertyDoubleList configurationProperty) {
		this(configurationProperty.getKey(),configurationProperty.getValue());
	}

	public ConfigurationPropertyDoubleList(String key, ArrayList<Double> value) {
		super(key);
		this.value = value;
	}

	/**
	 * TODO no doc
	 */
	@Override
	public ConfigurationPropertyDoubleList clone() {
		return new ConfigurationPropertyDoubleList(this);
	}

	@Override
	public ArrayList<Double> getValue() {
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
		ConfigurationPropertyDoubleList other = (ConfigurationPropertyDoubleList) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	
}
