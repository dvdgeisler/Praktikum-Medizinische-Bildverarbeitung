package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.utils.listener.IListener;

public interface IModuleManagerListener extends IListener<IModuleManagerListener> {
  
	void onModuleLoaded(IModuleManagerModuleLoadedEvent event);

	void onModuleUnloaded(IModuleManagerModuleUnloadedEvent event);
}