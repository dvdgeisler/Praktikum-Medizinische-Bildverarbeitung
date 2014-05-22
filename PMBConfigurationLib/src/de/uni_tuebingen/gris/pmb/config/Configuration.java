package de.uni_tuebingen.gris.pmb.config;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Configuration extends ConfigurationPropertySection {

	private static final JAXBContext JAXB_CONTEXT;
	private static final Unmarshaller JAXB_UNMARSHALLER;
	private static final Marshaller JAXB_MARSHALLER;
	
	static {
		try {
			JAXB_CONTEXT = JAXBContext.newInstance(Configuration.class);
			JAXB_UNMARSHALLER = JAXB_CONTEXT.createUnmarshaller();
			JAXB_MARSHALLER = JAXB_CONTEXT.createMarshaller();
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2489708744364784038L;
	
	public Configuration(String file) throws FileNotFoundException, JAXBException {
		this(new File(file));
	}
	
	public Configuration(File file) throws FileNotFoundException, JAXBException {
		this(new FileReader(file));
	}
	
	public Configuration(Reader reader) throws JAXBException {
		this((Configuration) JAXB_UNMARSHALLER.unmarshal(reader));
	}

	public Configuration(Object unmarshal) {
		// TODO Auto-generated constructor stub
	}

}
