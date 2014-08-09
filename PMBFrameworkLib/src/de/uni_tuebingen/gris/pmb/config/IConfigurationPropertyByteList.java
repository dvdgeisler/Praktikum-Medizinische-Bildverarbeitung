package de.uni_tuebingen.gris.pmb.config;

import java.util.ArrayList;

public interface IConfigurationPropertyByteList extends IConfigurationProperty<ArrayList<Byte>> {
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	IConfigurationPropertyByteList clone();
}