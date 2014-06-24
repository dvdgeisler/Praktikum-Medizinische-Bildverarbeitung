package de.uni_tuebingen.gris.pmb.config;


public class ConfigurationRootModuleNotSpecifiedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1084663316939726085L;

	public ConfigurationRootModuleNotSpecifiedException(ConfigurationUnknownPropertyException e) {
		super("There is no root module specified in configuration",e);
	}

}
