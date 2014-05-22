package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.utils.listener.IEvent;

public interface IModuleManagerModuleLoadedEvent extends IEvent<IModuleManagerListener> {
	
	IModule getModule();

  	String getModuleIdentifier();

  	@Override
  	IModuleManagerModuleLoadedEvent clone();
}