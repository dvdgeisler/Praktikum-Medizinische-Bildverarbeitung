package de.uni_tuebingen.gris.pmb.module;


import de.uni_tuebingen.gris.pmb.config.ConfigurationSectionDelegater;
import de.uni_tuebingen.gris.pmb.config.IConfigurationSection;

public class ModuleConfiguration extends ConfigurationSectionDelegater implements IModuleConfiguration {

	private static final long serialVersionUID = 569947261172198600L;

	public ModuleConfiguration(IConfigurationSection configurationSection) {
		super(configurationSection);
	}

	@Override
	public String getModuleId() {
		return this.getString(IModuleConfiguration.PROPERTY_KEY_MODULE_ID);
	}

	@Override
	public String getModuleName() {
		return this.getString(IModuleConfiguration.PROPERTY_KEY_MODULE_NAME);
	}

}
