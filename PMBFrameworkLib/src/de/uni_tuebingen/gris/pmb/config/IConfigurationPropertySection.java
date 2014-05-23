package de.uni_tuebingen.gris.pmb.config;

import java.io.Serializable;
import java.util.Collection;

import de.uni_tuebingen.gris.pmb.module.ModuleInvalidePropertyValueException;
import de.uni_tuebingen.gris.pmb.module.ModuleUnknownPropertyException;

public interface IConfigurationPropertySection extends IConfigurationPropertyList<IConfigurationProperty<?>> {
	
	/**
	 * TODO no doc
	 * @param key
	 * @param value
	 * @return
	 * @throws ModuleUnknownPropertyException
	 * @throws ModuleInvalidePropertyValueException
	 */
	<T extends Serializable> T setProperty(String key, T value) throws ModuleUnknownPropertyException, ModuleInvalidePropertyValueException;

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 * @throws ModuleUnknownPropertyException
	 * @throws ModuleInvalidePropertyValueException
	 */
	String removeProperty(String key) throws ModuleUnknownPropertyException, ModuleInvalidePropertyValueException;

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 * @throws ModuleUnknownPropertyException
	 */
	<T extends Serializable> T getProperty(String key) throws ModuleUnknownPropertyException;

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
	 * @throws ModuleUnknownPropertyException
	 */
	<T extends Serializable> boolean isValidProperty(String key, T value) throws ModuleUnknownPropertyException;

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	boolean isPropertyKey(String key);
	
}