package dev.thatsnasu.ansi.exceptions;

/**
 * Thrown to indicate that an attempt to instantiate a {@link Color} with an illegal hexadecimal color value.
 */
public class MalformedHexadecimalException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	/**
	 * Creates a new MalformedHexadecimalException with a given message to output.
	 * @param message to be shown.
	 */
	public MalformedHexadecimalException(String message) {
		super(message);
	}
}
