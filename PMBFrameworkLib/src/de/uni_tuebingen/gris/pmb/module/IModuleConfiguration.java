package de.uni_tuebingen.gris.pmb.module;

import de.uni_tuebingen.gris.pmb.config.IConfigurationSection;

public interface IModuleConfiguration extends IConfigurationSection {

	static final String PROPERTY_KEY_MODULE_ID = "id";
	static final String PROPERTY_KEY_MODULE_NAME = "name";
	
	String getModuleId();
	
	String getModuleName();

}
