package de.uni_tuebingen.gris.pmb.module;

import java.util.Collection;

public class ModuleManager implements IModuleManager {
	
	private final ModuleManagerObserver observer;
	
	{
		this.observer = new ModuleManagerObserver();
	}

	@Override
	public IModule getModule(String identifier) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IModule addModule(String identifier, IModule module) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IModule removeModule(String identifer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IModule removeModule(IModule module) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<IModule> getModules() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<IModule> getModules(Class<?> clazz) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getModuleIdentifier(IModule module) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModuleManagerObserver getObserver() {
		return this.observer;
	}

}
