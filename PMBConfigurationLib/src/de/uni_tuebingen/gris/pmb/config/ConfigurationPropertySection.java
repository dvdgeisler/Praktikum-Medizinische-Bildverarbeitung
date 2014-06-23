package de.uni_tuebingen.gris.pmb.config;

import java.io.Serializable;
import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class ConfigurationPropertySection extends ConfigurationProperty<IConfigurationPropertyValueList<IConfigurationProperty<?>>> implements IConfigurationPropertySection {

	/**
	 * TODO no doc
	 */
	private static final long serialVersionUID = 2545736528875246781L;

	public ConfigurationPropertySection() {
		super();
	}

	public ConfigurationPropertySection(ConfigurationPropertySection configurationProperty) {
		super(configurationProperty);
	}

	public ConfigurationPropertySection(String key, IConfigurationPropertyValueList<IConfigurationProperty<?>> value) {
		super(key, value);
	}

	/**
	 * TODO no doc
	 */
	@Override
	public ConfigurationPropertySection clone() {
		return new ConfigurationPropertySection(this);
	}

	@Override
	public <T extends Serializable> T setProperty(String key, T value) throws ConfigurationUnknownPropertyException, ConfigurationInvalidePropertyValueException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removeProperty(String key) throws ConfigurationUnknownPropertyException, ConfigurationInvalidePropertyValueException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Serializable> T getProperty(String key) throws ConfigurationUnknownPropertyException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<String> getPropertyKeys() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Serializable> boolean isValidProperty(String key, T value) throws ConfigurationUnknownPropertyException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isPropertyKey(String key) {
		// TODO Auto-generated method stub
		return false;
	}
}
