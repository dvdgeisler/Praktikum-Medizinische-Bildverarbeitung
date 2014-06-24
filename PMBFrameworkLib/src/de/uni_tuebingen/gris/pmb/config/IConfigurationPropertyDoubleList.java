package de.uni_tuebingen.gris.pmb.config;

import java.util.ArrayList;

public interface IConfigurationPropertyDoubleList extends IConfigurationProperty<ArrayList<Double>> {
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	IConfigurationPropertyDoubleList clone();
}