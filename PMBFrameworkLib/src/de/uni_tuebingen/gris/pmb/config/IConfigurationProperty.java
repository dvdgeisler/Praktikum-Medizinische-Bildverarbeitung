package de.uni_tuebingen.gris.pmb.config;

import java.io.Serializable;

public interface IConfigurationProperty<T extends Serializable> extends Serializable {
	
	String getKey();

	T getValue();
  
}