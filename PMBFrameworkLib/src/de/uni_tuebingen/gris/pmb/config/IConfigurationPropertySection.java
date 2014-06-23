package de.uni_tuebingen.gris.pmb.config;

import java.io.Serializable;
import java.util.Collection;


public interface IConfigurationPropertySection extends IConfigurationPropertyList<IConfigurationProperty<?>> {
	
	/**
	 * TODO no doc
	 * @param key
	 * @param value
	 * @return
	 * @throws ConfigurationUnknownPropertyException
	 * @throws ConfigurationInvalidePropertyValueException
	 */
	<T extends Serializable> T setProperty(String key, T value) throws ConfigurationUnknownPropertyException, ConfigurationInvalidePropertyValueException;

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 * @throws ConfigurationUnknownPropertyException
	 * @throws ConfigurationInvalidePropertyValueException
	 */
	String removeProperty(String key) throws ConfigurationUnknownPropertyException, ConfigurationInvalidePropertyValueException;

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 * @throws ConfigurationUnknownPropertyException
	 */
	<T extends Serializable> T getProperty(String key) throws ConfigurationUnknownPropertyException;

	/**
	 * TODO no doc
	 * @return
	 */
	Collection<String> getPropertyKeys();

	/**
	 * TODO no doc
	 * @param key
	 * @param value
	 * @return
	 * @throws ConfigurationUnknownPropertyException
	 */
	<T extends Serializable> boolean isValidProperty(String key, T value) throws ConfigurationUnknownPropertyException;

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	boolean isPropertyKey(String key);
	
}