package me.isaacjordan.TrekPlusPlus.Compiler;

public class TrekPPException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5289629697250162920L;

	public TrekPPException() {
		
	}

	public TrekPPException(String message) {
		super(message);
	}

	public TrekPPException(Throwable cause) {
		super(cause);
	}

	public TrekPPException(String message, Throwable cause) {
		super(message, cause);
	}

	public TrekPPException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
