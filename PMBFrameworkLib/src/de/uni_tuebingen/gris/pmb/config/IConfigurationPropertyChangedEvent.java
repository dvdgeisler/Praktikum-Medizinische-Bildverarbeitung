package de.uni_tuebingen.gris.pmb.config;

import java.io.Serializable;

import de.uni_tuebingen.gris.pmb.utils.listener.IEvent;

public interface IConfigurationPropertyChangedEvent<T extends Serializable> extends IEvent<IConfigurationListener> {

	/**
	 * TODO no doc
	 * @return
	 */
	IConfigurationProperty<T> getNewProperty();
	
	/**
	 * TODO no doc
	 * @return
	 */
	IConfigurationProperty<T> getOldProperty();
}
