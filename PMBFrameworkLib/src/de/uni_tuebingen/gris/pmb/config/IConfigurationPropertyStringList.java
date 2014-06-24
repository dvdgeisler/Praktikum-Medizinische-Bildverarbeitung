package de.uni_tuebingen.gris.pmb.config;

import java.util.ArrayList;

public interface IConfigurationPropertyStringList extends IConfigurationProperty<ArrayList<String>> {
	
	/**
	 * {@inheritDoc}
	 */@Override
	IConfigurationPropertyStringList clone();
}