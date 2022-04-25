package dev.thatsnasu.ansi.exceptions;

/**
 * Thrown to indicate that an attempt to instantiate a {@link Color} with an illegal value for either red, green or blue.
 */
public class MalformedRGBException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	/**
	 * Creates a new MalformedRGBException with a given message to output
	 * @param message to be shown
	 */
	public MalformedRGBException(String message) {
		super(message);
	}
}
