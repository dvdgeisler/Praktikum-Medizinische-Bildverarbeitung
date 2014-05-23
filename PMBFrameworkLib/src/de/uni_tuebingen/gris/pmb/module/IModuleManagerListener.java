package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.utils.listener.IListener;

public interface IModuleManagerListener extends IListener<IModuleManagerListener> {
  
	/**
	 * TODO no doc
	 * @param event
	 */
	void onModuleLoaded(IModuleManagerModuleLoadedEvent event);

	/**
	 * TODO no doc
	 * @param event
	 */
	void onModuleUnloaded(IModuleManagerModuleUnloadedEvent event);
}