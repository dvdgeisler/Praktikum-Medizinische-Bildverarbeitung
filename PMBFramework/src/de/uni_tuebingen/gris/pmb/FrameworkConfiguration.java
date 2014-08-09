package de.uni_tuebingen.gris.pmb;

import java.io.FileNotFoundException;

import javax.xml.bind.JAXBException;

import de.uni_tuebingen.gris.pmb.config.Configuration;
import de.uni_tuebingen.gris.pmb.config.ConfigurationSectionDelegater;
import de.uni_tuebingen.gris.pmb.config.IConfiguration;
import de.uni_tuebingen.gris.pmb.config.IConfigurationSection;
import de.uni_tuebingen.gris.pmb.module.IModuleManagerConfiguration;
import de.uni_tuebingen.gris.pmb.module.ModuleManagerConfiguration;

public class FrameworkConfiguration extends ConfigurationSectionDelegater implements IFrameworkConfiguration {
	
	private static final long serialVersionUID = -5426520380870519810L;

	public FrameworkConfiguration(IConfigurationSection config) {
		super(config);
	}

	@Override
    public String getRootModuleId() {
		return this.getConfig().getString(IFrameworkConfiguration.PROPERTY_KEY_ROOT_MODULE_ID);
    }

	@Override
	public IModuleManagerConfiguration getModuleManagerConfiguration() {
		return new ModuleManagerConfiguration(this.getConfig().getSection(IFrameworkConfiguration.PROPERTY_KEY_MODULE_MANAGER));
	}

	public static FrameworkConfiguration parseArguments(String[] args) throws FileNotFoundException, JAXBException {
		IConfiguration config;
		
		config = new Configuration(args[0]);
		return new FrameworkConfiguration(config);
	}

	@Override
	public String getResultPath() {
		return this.getConfig().getString(IFrameworkConfiguration.PROPERTY_KEY_RESULT_PATH);
	}

}
