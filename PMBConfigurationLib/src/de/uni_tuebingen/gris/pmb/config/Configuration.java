package de.uni_tuebingen.gris.pmb.config;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement(name="config")
@XmlSeeAlso({
	ConfigurationPropertyBoolean.class,
	ConfigurationPropertyCharacter.class,
	ConfigurationPropertyByte.class,
	ConfigurationPropertyFloat.class,
	ConfigurationPropertySection.class,
	ConfigurationPropertyString.class,
	ConfigurationPropertyInteger.class,
	ConfigurationPropertyDouble.class,
	ConfigurationPropertyLong.class,
	ConfigurationPropertyShort.class,
	ConfigurationPropertyBooleanList.class,
	ConfigurationPropertyCharacterList.class,
	ConfigurationPropertyByteList.class,
	ConfigurationPropertyFloatList.class,
	ConfigurationPropertySectionList.class,
	ConfigurationPropertyStringList.class,
	ConfigurationPropertyIntegerList.class,
	ConfigurationPropertyDoubleList.class,
	ConfigurationPropertyLongList.class,
	ConfigurationPropertyShortList.class})
@XmlAccessorType(XmlAccessType.FIELD)
public class Configuration extends ConfigurationSection implements IConfiguration {

	/**
	 * TODO no doc
	 */
	private static final JAXBContext JAXB_CONTEXT;
	
	/**
	 * TODO no doc
	 */
	private static final Unmarshaller JAXB_UNMARSHALLER;
	
	/**
	 * TODO no doc
	 */
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

	/**
	 * TODO no doc
	 * @param file
	 * @throws FileNotFoundException
	 * @throws JAXBException
	 */
	public Configuration(String file) throws FileNotFoundException, JAXBException {
		this(new File(file));
	}
	
	/**
	 * TODO no doc
	 * @param file
	 * @throws FileNotFoundException
	 * @throws JAXBException
	 */
	public Configuration(File file) throws FileNotFoundException, JAXBException {
		this(new FileReader(file));
	}
	
	/**
	 * TODO no doc
	 * @param reader
	 * @throws JAXBException
	 */
	public Configuration(Reader reader) throws JAXBException {
		this((Configuration) JAXB_UNMARSHALLER.unmarshal(reader));
	}

	/**
	 * TODO no doc
	 * @param unmarshal
	 */
	protected Configuration(Configuration unmarshal) {
		super(unmarshal);
	}

	/**
	 * TODO no doc
	 * @param unmarshal
	 */
	public Configuration() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringWriter sw;
		
		sw = new StringWriter();
		try {
			JAXB_MARSHALLER.marshal(this, sw);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
		return sw.toString();
	}
	
}
