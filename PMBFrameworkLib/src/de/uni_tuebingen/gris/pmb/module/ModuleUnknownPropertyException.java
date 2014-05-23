package de.uni_tuebingen.gris.pmb.module;

public class ModuleUnknownPropertyException extends Exception {
  
	/**
	 * TODO no doc
	 */
	private static final long serialVersionUID = -6050823837135147959L;

	/**
	 * TODO no doc
	 */
	public ModuleUnknownPropertyException() {
		super();
	}

	/**
	 * TODO no doc
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public ModuleUnknownPropertyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	/**
	 * TODO no doc
	 * @param message
	 * @param cause
	 */
	public ModuleUnknownPropertyException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * TODO no doc
	 * @param message
	 */
	public ModuleUnknownPropertyException(String message) {
		super(message);
	}

	/**
	 * TODO no doc
	 * @param cause
	 */
	public ModuleUnknownPropertyException(Throwable cause) {
		super(cause);
	}
	
}