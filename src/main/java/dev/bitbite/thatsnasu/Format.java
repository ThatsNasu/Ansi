package dev.bitbite.thatsnasu;

/**
 * Predefined Format options to be used wherever you want. These ANSI Escaping Codes only work in environments which support ANSI Escaping.
 */
public enum Format {
	/**
	 * Formats text as bold.
	 */
	BOLD ("1"),
	/**
	 * Puts a bounding box around text.
	 */
	BOXED("51"),
	/**
	 * Crosses out text.
	 */
	CROSSED_OUT("9"),
	/**
	 * Double underlines text.
	 */
	DOUBLE_UNDERLINED("21"),
	/**
	 * Formats text as italic.
	 */
	ITALIC("3"),
	/**
	 * Resets any colorization or formatting on text.
	 */
	RESET("0"),
	/**
	 * Underlines text.
	 */
	UNDERLINE("4");
	
	
	private final String formatCode;
	
	Format(String formatCode) {
		this.formatCode = formatCode;
	}
	
	/**
	 * Returns the String representation of the ANSI Escape value associated with a given {@link Format}.
	 * @return formatCode as ANSI ESCAPE Sequence String part.
	 */
	public String getFormatCode() {
		return this.formatCode;
	}

	/**
	 * Returns the String representation of the ANSI Escape value associated with a given {@link Format}.
	 * @return formatCode as full ANSI Escape Sequence String.
	 */
	@Override
	public String toString() {
		return "\u001b["+this.formatCode+"m";
	}
}
