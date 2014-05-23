package de.uni_tuebingen.gris.pmb.config;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ConfigurationPropertyInteger extends ConfigurationProperty<Integer> implements IConfigurationPropertyInteger {

	/**
	 * TODO no doc
	 */
	private static final long serialVersionUID = -4550055169617827101L;

	public ConfigurationPropertyInteger() {
		super();
	}

	public ConfigurationPropertyInteger(ConfigurationPropertyInteger configurationProperty) {
		super(configurationProperty);
	}

	public ConfigurationPropertyInteger(String key, Integer value) {
		super(key, value);
	}

	/**
	 * TODO no doc
	 */
	@Override
	public ConfigurationPropertyInteger clone() {
		return new ConfigurationPropertyInteger(this);
	}
}
