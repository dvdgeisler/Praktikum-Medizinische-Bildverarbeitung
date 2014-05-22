package de.uni_tuebingen.gris.pmb.module;

public class ModuleInvalidePropertyValueException extends Exception {
	
	private static final long serialVersionUID = 9092602411142931518L;

	public ModuleInvalidePropertyValueException() {
		super();
	}

	public ModuleInvalidePropertyValueException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ModuleInvalidePropertyValueException(String message, Throwable cause) {
		super(message, cause);
	}

	public ModuleInvalidePropertyValueException(String message) {
		super(message);
	}

	public ModuleInvalidePropertyValueException(Throwable cause) {
		super(cause);
	}
	
}