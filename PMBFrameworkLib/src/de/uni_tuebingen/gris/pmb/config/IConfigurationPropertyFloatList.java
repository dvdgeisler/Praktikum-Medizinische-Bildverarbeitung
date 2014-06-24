package de.uni_tuebingen.gris.pmb.config;

import java.util.ArrayList;

public interface IConfigurationPropertyFloatList extends IConfigurationProperty<ArrayList<Float>> {
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	IConfigurationPropertyFloatList clone();
}