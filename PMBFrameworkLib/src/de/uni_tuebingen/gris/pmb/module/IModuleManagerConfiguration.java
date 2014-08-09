package de.uni_tuebingen.gris.pmb.module;

import java.util.List;

import de.uni_tuebingen.gris.pmb.config.IConfigurationSection;

public interface IModuleManagerConfiguration extends IConfigurationSection {

    static final String PROPERTY_KEY_MODULE_CONFIGURATIONS = "modules";
    static final String PROPERTY_KEY_MODULE_LOAD_PATHS = "paths";

	public IModuleConfiguration getModuleConfiguration(String moduleId);
	
	public List<IModuleConfiguration> getModuleConfigurations();
	
	public List<String> getLoadPaths();
}
