package de.uni_tuebingen.gris.pmb;

import de.uni_tuebingen.gris.pmb.config.IConfigurationSection;
import de.uni_tuebingen.gris.pmb.module.IModuleManagerConfiguration;

public interface IFrameworkConfiguration extends IConfigurationSection {

    static final String PROPERTY_KEY_MODULE_MANAGER = "moduleManager";
    static final String PROPERTY_KEY_ROOT_MODULE_ID = "rootModuleId";

    IModuleManagerConfiguration getModuleManagerConfiguration();
    
    String getRootModuleId();

}
