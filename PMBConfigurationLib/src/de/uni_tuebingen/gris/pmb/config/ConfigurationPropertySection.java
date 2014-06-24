package de.uni_tuebingen.gris.pmb.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="section")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConfigurationPropertySection extends ConfigurationProperty<IConfigurationSection> implements IConfigurationPropertySection {

	@XmlElement(type=ConfigurationSection.class,name="config")
	private IConfigurationSection value;
	
	/**
	 * TODO no doc
	 */
	private static final long serialVersionUID = 8390613102316875037L;

	public ConfigurationPropertySection() {
		super();
	}

	public ConfigurationPropertySection(IConfigurationPropertySection configurationProperty) {
		this(configurationProperty.getKey(),configurationProperty.getValue());
	}

	public ConfigurationPropertySection(String key, IConfigurationSection value) {
		super(key);
		this.value = value;
	}

	/**
	 * TODO no doc
	 */
	@Override
	public ConfigurationPropertySection clone() {
		return new ConfigurationPropertySection(this);
	}

	@Override
	public IConfigurationSection getValue() {
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
		ConfigurationPropertySection other = (ConfigurationPropertySection) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	
}
