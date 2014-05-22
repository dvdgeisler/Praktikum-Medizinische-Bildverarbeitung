package de.uni_tuebingen.gris.pmb.config;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ConfigurationPropertySection extends ConfigurationProperty<IConfigurationPropertyValueList<IConfigurationProperty<?>>> implements IConfigurationPropertySection {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2545736528875246781L;

}
