package de.uni_tuebingen.gris.pmb.config;

import java.util.ArrayList;

public interface IConfigurationPropertyBooleanList extends IConfigurationProperty<ArrayList<Boolean>> {
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	IConfigurationPropertyBooleanList clone();
}