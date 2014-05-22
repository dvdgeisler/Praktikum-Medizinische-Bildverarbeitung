package de.uni_tuebingen.gris.pmb.module;

public class ModuleUnknownPropertyException extends Exception {
  
	private static final long serialVersionUID = -6050823837135147959L;

	public ModuleUnknownPropertyException() {
		super();
	}

	public ModuleUnknownPropertyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ModuleUnknownPropertyException(String message, Throwable cause) {
		super(message, cause);
	}

	public ModuleUnknownPropertyException(String message) {
		super(message);
	}

	public ModuleUnknownPropertyException(Throwable cause) {
		super(cause);
	}
	
}