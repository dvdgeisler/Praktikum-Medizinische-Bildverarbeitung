package de.uni_tuebingen.gris.pmb.config;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ConfigurationPropertyFloat extends ConfigurationProperty<Float> implements IConfigurationPropertyFloat {

	/**
	 * TODO no doc
	 */
	private static final long serialVersionUID = -8331402891130909730L;

	public ConfigurationPropertyFloat() {
		super();
	}

	public ConfigurationPropertyFloat(ConfigurationPropertyFloat configurationProperty) {
		super(configurationProperty);
	}

	public ConfigurationPropertyFloat(String key, Float value) {
		super(key, value);
	}

	/**
	 * TODO no doc
	 */
	@Override
	public ConfigurationPropertyFloat clone() {
		return new ConfigurationPropertyFloat(this);
	}
	
}
