package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.utils.listener.IObservable;
import java.util.Collection;

public interface IModuleManager extends IObservable<IModuleManagerListener> {
  
	/**
	 * TODO no doc
	 * @param id
	 * @return
	 */
	IModule getModule(String id);

	/**
	 * TODO no doc
	 * @param id
	 * @param module
	 * @return
	 */
	IModule addModule(String id, IModule module);

	/**
	 * TODO no doc
	 * @param id
	 * @return
	 */
	IModule removeModule(String id);

	/**
	 * TODO no doc
	 * @param module
	 * @return
	 */
	IModule removeModule(IModule module);

	/**
	 * TODO no doc
	 * @return
	 */
	Collection<IModule> getModules();

	/**
	 * TODO no doc
	 * @param moduleClass
	 * @return
	 */
	Collection<IModule> getModules(Class<?> moduleClass);

	/**
	 * TODO no doc
	 * @param module
	 * @return
	 */
	String getModuleIdentifier(IModule module);

	/**
	 * {@inheritDoc}
	 */
	IModuleManagerObserver getObserver();
	
	/**
	 * TODO no doc
	 * @return
	 */
	IModuleManagerConfiguration getConfiguration();
	
}