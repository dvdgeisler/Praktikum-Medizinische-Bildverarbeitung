package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.utils.listener.IEvent;

public interface IModuleManagerModuleLoadedEvent extends IEvent<IModuleManagerListener> {
	
	/**
	 * TODO no doc
	 * @return
	 */
	IModule getModule();

	/**
	 * TODO no doc
	 * @return
	 */
  	String getModuleIdentifier();

  	/**
  	 * {@inheritDoc}
  	 */
  	@Override
  	IModuleManagerModuleLoadedEvent clone();
}