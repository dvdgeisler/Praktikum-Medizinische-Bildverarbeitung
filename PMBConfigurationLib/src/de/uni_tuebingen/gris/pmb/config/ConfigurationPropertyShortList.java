package de.uni_tuebingen.gris.pmb.config;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="shorts")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConfigurationPropertyShortList extends ConfigurationProperty<ArrayList<Short>> implements IConfigurationPropertyShortList {

	/**
	 * TODO no doc
	 */
	private static final long serialVersionUID = -8331402891130909730L;

	@XmlAttribute(required=true, name="value")
	private final List<Short> value;
	
	{
		this.value = new ArrayList<Short>();
	}
	
	public ConfigurationPropertyShortList() {
		super();
	}

	public ConfigurationPropertyShortList(ConfigurationPropertyShortList configurationProperty) {
		this(configurationProperty.getKey(),configurationProperty.getValue());
	}

	public ConfigurationPropertyShortList(String key, ArrayList<Short> value) {
		super(key);
		this.value.addAll(value);
	}

	/**
	 * TODO no doc
	 */
	@Override
	public ConfigurationPropertyShortList clone() {
		return new ConfigurationPropertyShortList(this);
	}

	@Override
	public ArrayList<Short> getValue() {
		return (ArrayList<Short>) this.value;
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
		ConfigurationPropertyShortList other = (ConfigurationPropertyShortList) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	
}
