package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.utils.listener.IEvent;

public interface IModuleInitializedEvent extends IEvent<IModuleListener> {
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	IModuleInitializedEvent clone();
}