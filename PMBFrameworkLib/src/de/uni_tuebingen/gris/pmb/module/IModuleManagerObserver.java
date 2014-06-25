package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.utils.listener.IObserver;

public interface IModuleManagerObserver extends IObserver<IModuleManagerListener> {
  
	/**
	 * {@inheritDoc}
	 */
	@Override
	boolean addListener(IModuleManagerListener listener);

	/**
	 * {@inheritDoc}
	 */
	@Override
	boolean removeListener(IModuleManagerListener listener);

	/**
	 * TODO no doc
	 * @param event
	 */
	void fireModuleLoadedEvent(IModuleManagerModuleLoadedEvent event);

	/**
	 * TODO no doc
	 * @param moduleManager
	 * @param module
	 * @param id
	 */
	void fireModuleLoadedEvent(IModuleManager moduleManager, IModule module, String id);

	/**
	 * TODO no doc
	 * @param event
	 */
	void fireModuleUnloadedEvent(IModuleManagerModuleUnloadedEvent event);

	/**
	 * TODO no doc
	 * @param moduleManager
	 * @param module
	 * @param id
	 */
	void fireModuleUnloadedEvent(IModuleManager moduleManager, IModule module, String id);

	/**
	 * TODO no doc
	 * @param event
	 */
	void fireModuleInitializedEvent(IModuleManagerModuleInitializedEvent event);
	
	/**
	 * TODO no doc
	 * @param moduleManager
	 * @param module
	 * @param id
	 */
	void fireModuleInitializedEvent(IModuleManager moduleManager, IModule module, String id);

	/**
	 * TODO no doc
	 * @param event
	 */
	void fireModuleDeinitializedEvent(IModuleManagerModuleDeinitializedEvent event);
	
	/**
	 * TODO no doc
	 * @param moduleManager
	 * @param module
	 * @param id
	 */
	void fireModuleDeinitializedEvent(IModuleManager moduleManager, IModule module, String id);
}