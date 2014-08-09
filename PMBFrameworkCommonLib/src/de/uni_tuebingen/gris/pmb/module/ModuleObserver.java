package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.data.IImage;
import de.uni_tuebingen.gris.pmb.utils.listener.DefaultObserver;

public class ModuleObserver extends DefaultObserver<IModuleListener> implements IModuleObserver {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void fireModulePerformedEvent(IModule source, IImage img) {
		this.fireModulePerformedEvent(new ModulePerformedEvent(source, this, img));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void fireModulePerformedEvent(IModulePerformedEvent event) {
		this.fireEvent(event,new CustomEventHandler<IModuleListener,IModulePerformedEvent>() {
			@Override public void callEventHandler(IModuleListener listener, IModulePerformedEvent event) {
				listener.onModulePerformed(event);
			}});
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void fireModuleInitializedEvent(IModule source) {
		this.fireModuleInitializedEvent(new ModuleInitializedEvent(source, this));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void fireModuleInitializedEvent(IModuleInitializedEvent event) {
		this.fireEvent(event,new CustomEventHandler<IModuleListener,IModuleInitializedEvent>() {
			@Override public void callEventHandler(IModuleListener listener, IModuleInitializedEvent event) {
				listener.onModuleInitialized(event);
			}});
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void fireModuleDeinitializedEvent(IModule source) {
		this.fireModuleDeinitializedEvent(new ModuleDeinitializedEvent(source, this));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void fireModuleDeinitializedEvent(IModuleDeinitializedEvent event) {
		this.fireEvent(event,new CustomEventHandler<IModuleListener,IModuleDeinitializedEvent>() {
			@Override public void callEventHandler(IModuleListener listener, IModuleDeinitializedEvent event) {
				listener.onModuleDeinitialized(event);
			}});
	}

}
