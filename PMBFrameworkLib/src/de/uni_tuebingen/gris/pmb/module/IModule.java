package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.data.IImage;
import de.uni_tuebingen.gris.pmb.utils.listener.IObservable;
import java.util.Collection;

public interface IModule extends IObservable<IModuleListener> {
  
	/**
	 * TODO no doc
	 * @param key
	 * @param value
	 * @return
	 * @throws ModuleUnknownPropertyException
	 * @throws ModuleInvalidePropertyValueException
	 */
	String setProperty(String key, String value) throws ModuleUnknownPropertyException, ModuleInvalidePropertyValueException;

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
	String getProperty(String key) throws ModuleUnknownPropertyException;

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
	boolean isValidProperty(String key, String value) throws ModuleUnknownPropertyException;

	/**
	 * TODO no doc
	 * @param key
	 * @return
	 */
	boolean isPropertyKey(String key);

	/**
	 * TODO no doc
	 * @return
	 */
	IImage perform();

	/**
	 * {@inheritDoc}
	 */
	IModuleObserver getObserver();
}