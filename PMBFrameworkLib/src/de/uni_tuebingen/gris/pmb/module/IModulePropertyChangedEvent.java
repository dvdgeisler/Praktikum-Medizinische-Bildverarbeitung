package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.utils.listener.IEvent;

public abstract interface IModulePropertyChangedEvent extends IEvent<IModuleListener> {
	
	String getKey();

	String getOldValue();

	String getNewValue();

	@Override
	IModulePropertyChangedEvent clone();
}