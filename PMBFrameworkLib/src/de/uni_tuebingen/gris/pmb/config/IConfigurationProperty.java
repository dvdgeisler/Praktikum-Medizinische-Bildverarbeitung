package de.uni_tuebingen.gris.pmb.config;

import java.io.Serializable;

public interface IConfigurationProperty<T extends Serializable> extends Serializable {
	
	/**
	 * TODO no doc
	 * @return
	 */
	String getKey();

	/**
	 * TODO no doc
	 * @return
	 */
	T getValue();
  
}