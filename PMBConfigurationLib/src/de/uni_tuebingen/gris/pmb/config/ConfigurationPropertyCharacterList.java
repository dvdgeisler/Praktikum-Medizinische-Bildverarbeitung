package de.uni_tuebingen.gris.pmb.config;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="chars")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConfigurationPropertyCharacterList extends ConfigurationProperty<ArrayList<Character>> implements IConfigurationPropertyCharacterList {

	/**
	 * TODO no doc
	 */
	private static final long serialVersionUID = -8331402891130909730L;

	@XmlAttribute(required=true, name="value")
	private ArrayList<Character> value;
	
	public ConfigurationPropertyCharacterList() {
		super();
	}

	public ConfigurationPropertyCharacterList(ConfigurationPropertyCharacterList configurationProperty) {
		this(configurationProperty.getKey(),configurationProperty.getValue());
	}

	public ConfigurationPropertyCharacterList(String key, ArrayList<Character> value) {
		super(key);
		this.value = value;
	}

	/**
	 * TODO no doc
	 */
	@Override
	public ConfigurationPropertyCharacterList clone() {
		return new ConfigurationPropertyCharacterList(this);
	}

	@Override
	public ArrayList<Character> getValue() {
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
		ConfigurationPropertyCharacterList other = (ConfigurationPropertyCharacterList) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	
}
