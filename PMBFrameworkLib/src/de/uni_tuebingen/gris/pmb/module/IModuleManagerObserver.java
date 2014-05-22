package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.utils.listener.IObserver;

public interface IModuleManagerObserver extends IObserver<IModuleManagerListener> {
  
	@Override
	boolean addListener(IModuleManagerListener listener);

	@Override
	boolean removeListener(IModuleManagerListener listener);

	void fireModuleLoadedEvent(IModuleManagerModuleLoadedEvent event);

	void fireModuleLoadedEvent(IModuleManager moduleManager, IModule module, String id);

	void fireModuleUnloadedEvent(IModuleManagerModuleUnloadedEvent event);

	void fireModuleUnloadedEvent(IModuleManager moduleManager, IModule module, String id);
}