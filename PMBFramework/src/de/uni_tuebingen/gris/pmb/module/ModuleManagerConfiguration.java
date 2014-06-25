package de.uni_tuebingen.gris.pmb.module;

import java.util.ArrayList;
import java.util.List;

import de.uni_tuebingen.gris.pmb.config.ConfigurationSectionDelegater;
import de.uni_tuebingen.gris.pmb.config.IConfigurationSection;

public class ModuleManagerConfiguration extends ConfigurationSectionDelegater implements IModuleManagerConfiguration {

	private static final long serialVersionUID = 6127316267911030788L;

	public ModuleManagerConfiguration(IConfigurationSection config) {
		super(config);
	}

	@Override
	public List<IModuleConfiguration> getModuleConfigurations() {
		ArrayList<IModuleConfiguration> moduleConfigurations;
		
		moduleConfigurations = new ArrayList<IModuleConfiguration>();
		for(IConfigurationSection moduleConfiguration : this.getConfig().getSectionList(PROPERTY_KEY_MODULE_CONFIGURATIONS))
			moduleConfigurations.add(new ModuleConfiguration(moduleConfiguration));
		
		return moduleConfigurations;
	}

	@Override
	public IModuleConfiguration getModuleConfiguration(String moduleId) {
		for(IModuleConfiguration moduleConfiguration : this.getModuleConfigurations())
			if(moduleConfiguration.getModuleId().equals(moduleId))
				return moduleConfiguration;
		
		return null;
	}

	@Override
	public List<String> getLoadPaths() {
		return this.getStringList(PROPERTY_KEY_MODULE_LOAD_PATHS);
	}
}
