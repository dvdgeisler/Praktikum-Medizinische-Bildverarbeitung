package de.uni_tuebingen.gris.pmb.config;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ConfigurationPropertyList<T extends Serializable> extends ConfigurationProperty<IConfigurationPropertyValueList<T>> implements IConfigurationPropertyList<T> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6355044378451473220L;
	
}
