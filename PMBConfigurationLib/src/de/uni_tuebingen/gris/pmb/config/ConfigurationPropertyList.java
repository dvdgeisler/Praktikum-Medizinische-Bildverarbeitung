package de.uni_tuebingen.gris.pmb.config;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ConfigurationPropertyList<T extends Serializable> extends ConfigurationProperty<IConfigurationPropertyValueList<T>> implements IConfigurationPropertyList<T> {

	/**
	 * TODO no doc
	 */
	private static final long serialVersionUID = -6355044378451473220L;
	
	public ConfigurationPropertyList() {
		super();
	}

	public ConfigurationPropertyList(ConfigurationPropertyList<T> configurationProperty) {
		super(configurationProperty);
	}

	public ConfigurationPropertyList(String key, IConfigurationPropertyValueList<T> value) {
		super(key, value);
	}

	/**
	 * TODO no doc
	 */
	@Override
	public ConfigurationPropertyList<T> clone() {
		return new ConfigurationPropertyList<T>(this);
	}
}
