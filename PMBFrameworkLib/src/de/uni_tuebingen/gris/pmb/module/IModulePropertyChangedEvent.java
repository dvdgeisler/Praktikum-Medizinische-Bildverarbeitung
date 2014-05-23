package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.utils.listener.IEvent;

public abstract interface IModulePropertyChangedEvent extends IEvent<IModuleListener> {
	
	/**
	 * TODO no doc
	 * @return
	 */
	String getKey();

	/**
	 * TODO no doc
	 * @return
	 */
	String getOldValue();

	/**
	 * TODO no doc
	 * @return
	 */
	String getNewValue();

	/**
	 * {@inheritDoc}
	 */
	@Override
	IModulePropertyChangedEvent clone();
}