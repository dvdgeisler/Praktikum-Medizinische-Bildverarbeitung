package de.uni_tuebingen.gris.pmb.config;

public class ConfigurationInvalidePropertyValueException extends Exception {
	
	/**
	 * TODO no doc
	 */
	private static final long serialVersionUID = 9092602411142931518L;

	/**
	 * TODO no doc
	 */
	public ConfigurationInvalidePropertyValueException() {
		super();
	}

	/**
	 * TODO no doc
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public ConfigurationInvalidePropertyValueException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	/**
	 * TODO no doc
	 * @param message
	 * @param cause
	 */
	public ConfigurationInvalidePropertyValueException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * TODO no doc
	 * @param message
	 */
	public ConfigurationInvalidePropertyValueException(String message) {
		super(message);
	}

	/**
	 * TODO no doc
	 * @param cause
	 */
	public ConfigurationInvalidePropertyValueException(Throwable cause) {
		super(cause);
	}
	
}