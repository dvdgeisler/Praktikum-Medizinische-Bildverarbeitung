package de.uni_tuebingen.gris.pmb;

import java.io.FileNotFoundException;

import javax.xml.bind.JAXBException;

import de.uni_tuebingen.gris.pmb.config.Configuration;
import de.uni_tuebingen.gris.pmb.config.ConfigurationUnknownPropertyException;
import de.uni_tuebingen.gris.pmb.config.IConfigurationListener;
import de.uni_tuebingen.gris.pmb.utils.listener.IObserver;

public class FrameworkConfiguration extends Configuration implements IFrameworkConfiguration {

    public FrameworkConfiguration(String file) throws FileNotFoundException, JAXBException {
		super(file);
	}

	@Override
    public String getRootModuleId() {
        try {
			return this.getProperty(IFrameworkConfiguration.PROPERTY_KEY_ROOT_MODULE);
		} catch (ConfigurationUnknownPropertyException e) {
			e.printStackTrace();
		}
    }

	public static FrameworkConfiguration parseArguments(String[] args) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IObserver<IConfigurationListener> getObserver() {
		// TODO Auto-generated method stub
		return null;
	}

}
