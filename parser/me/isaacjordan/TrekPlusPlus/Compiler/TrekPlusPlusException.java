package me.isaacjordan.TrekPlusPlus.Compiler;

public class TrekPlusPlusException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5289629697250162920L;

	public TrekPlusPlusException() {
		
	}

	public TrekPlusPlusException(String message) {
		super(message);
	}

	public TrekPlusPlusException(Throwable cause) {
		super(cause);
	}

	public TrekPlusPlusException(String message, Throwable cause) {
		super(message, cause);
	}

	public TrekPlusPlusException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
