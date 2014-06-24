package de.uni_tuebingen.gris.pmb.config;

import java.util.ArrayList;

public interface IConfigurationPropertyLongList extends IConfigurationProperty<ArrayList<Long>> {
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	IConfigurationPropertyLongList clone();
}