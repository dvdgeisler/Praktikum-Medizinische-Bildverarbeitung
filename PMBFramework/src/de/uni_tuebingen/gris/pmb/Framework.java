package de.uni_tuebingen.gris.pmb;

import de.uni_tuebingen.gris.pmb.module.IModuleManager;
import de.uni_tuebingen.gris.pmb.module.ModuleManager;
import de.uni_tuebingen.gris.pmb.utils.listener.IObserver;

public class Framework implements IFramework {
	
	private final FrameworkObserver observer;
	private final ModuleManager moduleManager;
	 
	{
		this.observer = new FrameworkObserver();
		this.moduleManager = new ModuleManager();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IModuleManager getModuleManager() {
		return this.moduleManager;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IObserver<IFrameworkListener> getObserver() {
		return this.observer;
	}

}
