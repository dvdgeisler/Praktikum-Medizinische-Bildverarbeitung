package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.data.IImage;
import de.uni_tuebingen.gris.pmb.utils.listener.IObservable;
import java.util.Collection;

public interface IModule extends IObservable<IModuleListener> {
  
	String setProperty(String key, String value) throws ModuleUnknownPropertyException, ModuleInvalidePropertyValueException;

	String removeProperty(String key) throws ModuleUnknownPropertyException, ModuleInvalidePropertyValueException;

	String getProperty(String key) throws ModuleUnknownPropertyException;

	Collection<String> getPropertyKeys();

	boolean isValidProperty(String key, String value) throws ModuleUnknownPropertyException;

	boolean isPropertyKey(String key);

	IImage perform();

	IModuleObserver getObserver();
}