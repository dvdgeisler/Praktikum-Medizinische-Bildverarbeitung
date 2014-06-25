package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.IFramework;

public abstract class DefaultModule implements IModule {

	private IModuleConfiguration configuration;
	private IFramework framework;
	private IModuleManager moduleManager;
	private final IModuleObserver observer;
	
	public DefaultModule() {
		this.observer = new DefaultModuleObserver();
	}

	@Override
	public IModuleConfiguration getConfiguration() {
		return this.configuration;
	}

	@Override
	public IModuleObserver getObserver() {
		return this.observer;
	}

	public IFramework getFramework() {
		return this.framework;
	}

	@Override
	public void setFramework(IFramework framework) {
		this.framework = framework;
	}

	public IModuleManager getModuleManager() {
		return this.moduleManager;
	}

	@Override
	public void setModuleManager(IModuleManager moduleManager) {
		this.moduleManager = moduleManager;
	}

	@Override
	public void setConfiguration(IModuleConfiguration configuration) {
		this.configuration = configuration;
	}

}
