package de.uni_tuebingen.gris.pmb.config;

public class ConfigurationUnknownPropertyException extends Exception {
  
	/**
	 * TODO no doc
	 */
	private static final long serialVersionUID = -6050823837135147959L;

	/**
	 * TODO no doc
	 */
	public ConfigurationUnknownPropertyException() {
		super();
	}

	/**
	 * TODO no doc
	 * @param message
	 * @param cause
	 */
	public ConfigurationUnknownPropertyException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * TODO no doc
	 * @param message
	 */
	public ConfigurationUnknownPropertyException(String message) {
		super(message);
	}

	/**
	 * TODO no doc
	 * @param cause
	 */
	public ConfigurationUnknownPropertyException(Throwable cause) {
		super(cause);
	}
	
}