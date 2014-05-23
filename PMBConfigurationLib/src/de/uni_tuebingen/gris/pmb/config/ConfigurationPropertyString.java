package de.uni_tuebingen.gris.pmb.config;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ConfigurationPropertyString extends ConfigurationProperty<String> implements IConfigurationPropertyString {

	/**
	 * TODO no doc
	 */
	private static final long serialVersionUID = 8390613102316875037L;

	public ConfigurationPropertyString() {
		super();
	}

	public ConfigurationPropertyString(ConfigurationPropertyString configurationProperty) {
		super(configurationProperty);
	}

	public ConfigurationPropertyString(String key, String value) {
		super(key, value);
	}

	/**
	 * TODO no doc
	 */
	@Override
	public ConfigurationPropertyString clone() {
		return new ConfigurationPropertyString(this);
	}
}
