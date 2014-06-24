package de.uni_tuebingen.gris.pmb.config;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="sections")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConfigurationPropertySectionList extends ConfigurationProperty<ArrayList<IConfigurationSection>> implements IConfigurationPropertySectionList {
	
	/**
	 * TODO no doc
	 */
	private static final long serialVersionUID = 8390613102316875037L;

	@XmlElementRef(type=ConfigurationSection.class)
	private ArrayList<IConfigurationSection> value;
	
	public ConfigurationPropertySectionList() {
		super();
	}

	public ConfigurationPropertySectionList(ConfigurationPropertySectionList configurationProperty) {
		this(configurationProperty.getKey(),configurationProperty.getValue());
	}

	public ConfigurationPropertySectionList(String key, ArrayList<IConfigurationSection> value) {
		super(key);
		this.value = value;
	}

	/**
	 * TODO no doc
	 */
	@Override
	public ConfigurationPropertySectionList clone() {
		return new ConfigurationPropertySectionList(this);
	}

	@Override
	public ArrayList<IConfigurationSection> getValue() {
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
		ConfigurationPropertySectionList other = (ConfigurationPropertySectionList) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	
}
