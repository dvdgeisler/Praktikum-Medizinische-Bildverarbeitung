package de.uni_tuebingen.gris.pmb.config;

import java.util.ArrayList;

public interface IConfigurationPropertySectionList extends IConfigurationProperty<ArrayList<IConfigurationSection>> {
	
	/**
	 * {@inheritDoc}
	 */@Override
	IConfigurationPropertySectionList clone();
}