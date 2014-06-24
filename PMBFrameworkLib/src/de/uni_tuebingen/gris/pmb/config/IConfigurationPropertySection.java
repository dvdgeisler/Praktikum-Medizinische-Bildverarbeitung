package de.uni_tuebingen.gris.pmb.config;

public interface IConfigurationPropertySection extends IConfigurationProperty<IConfigurationSection> {
	
	/**
	 * {@inheritDoc}
	 */@Override
	IConfigurationPropertySection clone();
}