package de.uni_tuebingen.gris.pmb.config;

import java.util.ArrayList;

public interface IConfigurationPropertyShortList extends IConfigurationProperty<ArrayList<Short>> {
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	IConfigurationPropertyShortList clone();
}