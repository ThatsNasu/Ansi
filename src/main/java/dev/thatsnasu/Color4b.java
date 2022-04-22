package dev.thatsnasu;

/**
 * Predefined Colors.
 * These ColorCodes follow the 4Bit scheme and only work in environments that support ANSI Escaping.
 */
public enum Color4b {
	/**
	 * Colorized text in black. Rgb value is 0, 0, 0. Hexadecimal value is #000000.
	 */
	BLACK("Black", "30", "#000000", new int[] {0, 0, 0}),
	/**
	 * Colorizes text in blue. Rgb value is 0, 0, 128. Hexadecimal value is #000080.
	 */
	BLUE("Blue", "34", "#000080", new int[] {0, 0, 128}),
	/**
	 * Colorizes text in  bright black. Rgb value is 85, 85, 85. Hexadecimal value is #555555.
	 */
	BRIGHT_BLACK("Bright_Black", "90", "555555", new int[] {85, 85, 85}),
	/**
	 * Colorizes text in bright blue. Rgb value is 85, 85, 255. Hexadecimal value is #5555ff.
	 */
	BRIGHT_BLUE("Bright_Blue", "94", "#5555ff", new int[] {85, 85, 255}),
	/**
	 * Colorizes text in bright cyan. Rgb value is 85, 255, 255. Hexadecimal value is #55ffff.
	 */
	BRIGHT_CYAN("Bright_Cyan", "96", "#55ffff", new int[] {85, 255, 255}),
	/**
	 * Colorizes text in bright green. Rgb value is 85, 255, 85. Hexadecimal value is #55ff55.
	 */
	BRIGHT_GREEN("Bright_Green", "92", "#55ff55", new int[] {85, 255, 85}),
	/**
	 * Colorizes text in bright magenta. Rgb value is 255, 85, 255. Hexadecimal value is #ff55ff.
	 */
	BRIGHT_MAGENTA("Bright_Magenta", "95", "#ff55ff", new int[] {255, 85, 255}),
	/**
	 * Colorizes text in bright red. Rgb value is 255, 85, 85. Hexadecimal value is #ff5555.
	 */
	BRIGHT_RED("Bright_Red", "91", "#ff5555", new int[] {255, 85, 85}),
	/**
	 * Colorizes text in bright white. Rgb value is 255, 255, 255. Hexadecimal value is #ffffff.
	 */
	BRIGHT_WHITE("Bright_White", "97", "#ffffff", new int[] {255, 255, 255}),
	/**
	 * Colorizes text in bright yellow. Rgb value is 255, 255, 85. Hexadecimal value is #ffff55.
	 */
	BRIGHT_YELLOW("Bright_Yellow", "93", "#ffff55", new int[] {255, 255, 85}),
	/**
	 * Colorizes text in cyan. Rgb value is 0, 128, 128. Hexadecimal value is #008080.
	 */
	CYAN("Cyan", "36", "#008080", new int[] {0, 128, 128}),
	/**
	 * Colorizes text in green. Rgb value is 0, 128, 0. Hexadecimal value is #008000.
	 */
	GREEN("Green", "32", "#008000", new int[] {0, 128, 0}),
	/**
	 * Colorizes text in magenta. Rgb value is 128, 0, 128. Hexadecimal value is #800080.
	 */
	MAGENTA("Magenta", "35", "#800080", new int[] {128, 0, 128}),
	/**
	 * Colorizes text in red. Rgb value is 128, 0, 0. Hexadecimal value is #800000.
	 */
	RED("Red", "31", "#800000", new int[] {128, 0, 0}),
	/**
	 * Resets any colorization or formatting on text.
	 */
	RESET("Reset", "0", null, null),
	/**
	 * Colorizes text in white. Rgb value is 128, 128, 128. Hexadecimal value is #808080.
	 */
	WHITE("White", "37", "#808080", new int[] {128, 128, 128}),
	/**
	 * Colorizes text in yellow. Rgb value is 128, 128, 0. Hexadecimal value is #808000.
	 */
	YELLOW("Yellow", "33", "#808000", new int[] {128, 128, 0});

	
	private final String name;
	private final String colorCode;
	private final String hexCode;
	private final int[] rgb;
	
	Color4b(String name, String colorCode, String hexCode, int[] rgb) {
		this.name = name;
		this.colorCode = colorCode;
		this.hexCode = hexCode;
		this.rgb = rgb;
	}
	
	/**
	 * Returns the name of the color associated with a given {@link Color4b}.
	 * @return name as String.
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Returns the String representation of the colorCode associated with a given {@link Color4b}.
	 * @return colorCode as ANSI Escape Sequence String part.
	 */
	public String getColorCode() {
		return this.colorCode;
	}
	
	/**
	 * Returns the String representation of the colorCode associated with a given {@link Color4b} as Hexadecimal value.
	 * @return colorCode as Hex.
	 */
	public String getHexCode() {
		return this.hexCode;
	}
	
	/**
	 * Returns the RGB representation of the colorCode associated with a given {@link Color4b} as int[].
	 * @return colorCode as int[].
	 */
	public int[] getRGB() {
		return this.rgb;
	}
	
	/**
	 * Returns the String representation of the ANSI Escape value associated with a given {@link Color4b}.
	 * @return colorCode as full ANSI Escape Sequence String.
	 */
	@Override
	public String toString() {
		return "\u001b["+this.colorCode+"m";
	}
}
