package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.utils.listener.IObservable;
import java.util.Collection;

public interface IModuleManager extends IObservable<IModuleManagerListener> {
  
	IModule getModule(String id);

	IModule addModule(String id, IModule module);

	IModule removeModule(String id);

	IModule removeModule(IModule module);

	Collection<IModule> getModules();

	Collection<IModule> getModules(Class<?> moduleClass);

	String getModuleIdentifier(IModule module);

	IModuleManagerObserver getObserver();
}