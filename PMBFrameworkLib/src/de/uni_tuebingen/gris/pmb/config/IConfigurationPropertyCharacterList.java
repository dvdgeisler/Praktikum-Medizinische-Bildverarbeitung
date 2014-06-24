package de.uni_tuebingen.gris.pmb.config;

import java.util.ArrayList;

public interface IConfigurationPropertyCharacterList extends IConfigurationProperty<ArrayList<Character>> {
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	IConfigurationPropertyCharacterList clone();
}