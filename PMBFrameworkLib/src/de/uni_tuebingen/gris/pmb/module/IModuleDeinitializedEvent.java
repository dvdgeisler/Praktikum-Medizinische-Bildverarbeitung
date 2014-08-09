package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.utils.listener.IEvent;

public interface IModuleDeinitializedEvent extends IEvent<IModuleListener> {
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	IModuleDeinitializedEvent clone();
}