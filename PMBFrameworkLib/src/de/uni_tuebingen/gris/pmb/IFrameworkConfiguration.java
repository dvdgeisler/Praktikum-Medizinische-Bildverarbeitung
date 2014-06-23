package de.uni_tuebingen.gris.pmb;

import de.uni_tuebingen.gris.pmb.config.IConfiguration;

public interface IFrameworkConfiguration extends IConfiguration {

    static final String PROPERTY_KEY_ROOT_MODULE = "rootModule";

    /**
     * @TODO: no doc
     **/
    String getRootModuleId();

}
