package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.utils.listener.IEvent;

public interface IModuleManagerModuleUnloadedEvent extends IEvent<IModuleManagerListener> {

	IModule getModule();

	String getModuleIdentifier();

	@Override
  	IModuleManagerModuleUnloadedEvent clone();
}