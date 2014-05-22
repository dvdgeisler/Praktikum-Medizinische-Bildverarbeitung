package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.utils.listener.DefaultObserver;

public class ModuleManagerObserver extends DefaultObserver<IModuleManagerListener> implements IModuleManagerObserver {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void fireModuleLoadedEvent(IModuleManagerModuleLoadedEvent event) {
		this.fireEvent(event,new CustomEventHandler<IModuleManagerListener,IModuleManagerModuleLoadedEvent>() {
			@Override public void callEventHandler(IModuleManagerListener listener, IModuleManagerModuleLoadedEvent event) {
				listener.onModuleLoaded(event);
			}});
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void fireModuleLoadedEvent(IModuleManager source, IModule module, String moduleIdentifier) {
		this.fireModuleLoadedEvent(new ModuleManagerModuleLoadedEvent(source, this, module, moduleIdentifier));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void fireModuleUnloadedEvent(IModuleManagerModuleUnloadedEvent event) {
		this.fireEvent(event,new CustomEventHandler<IModuleManagerListener,IModuleManagerModuleUnloadedEvent>() {
			@Override public void callEventHandler(IModuleManagerListener listener, IModuleManagerModuleUnloadedEvent event) {
				listener.onModuleUnloaded(event);
			}});
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void fireModuleUnloadedEvent(IModuleManager source, IModule module, String moduleIdentifier) {
		this.fireModuleUnloadedEvent(new ModuleManagerModuleUnloadedEvent(source, this, module, moduleIdentifier));
	}

}
