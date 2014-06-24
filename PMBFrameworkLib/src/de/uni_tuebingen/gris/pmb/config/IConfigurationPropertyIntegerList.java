package de.uni_tuebingen.gris.pmb.config;

import java.util.ArrayList;

public interface IConfigurationPropertyIntegerList extends IConfigurationProperty<ArrayList<Integer>> {
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	IConfigurationPropertyIntegerList clone();
}