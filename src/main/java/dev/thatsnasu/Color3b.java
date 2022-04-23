package dev.thatsnasu;

/**
 * Predefined 3bit Colors.
 * These ColorCodes follow the 3Bit scheme and only work in environments that support ANSI Escaping.
 */
public enum Color3b {
	/**
	 * Colorizes text in black. Rgb value is 0, 0, 0. Hexadecimal value is #000000.
	 */
	BLACK("Black", "30", "#000000", new int[] {0, 0, 0}),
	/**
	 * Colorizes text in blue. Rgb value is 0, 0, 128. Hexadecimal value is #000080.
	 */
	BLUE("Blue", "34", "#000080", new int[] {0, 0, 128}),
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
	
	Color3b(String name, String colorCode, String hexCode, int[] rgb) {
		this.name = name;
		this.colorCode = colorCode;
		this.hexCode = hexCode;
		this.rgb = rgb;
	}
	
	/**
	 * Returns the name of the color associated with a given {@link Color3b}.
	 * @return name as String.
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Returns the String representation of the colorCode associated with a given {@link Color3b}.
	 * @return colorCode as ANSI Escape Sequence String part.
	 */
	public String getColorCode() {
		return this.colorCode;
	}
	
	/**
	 * Returns the String representation of the colorCode associated with a given {@link Color3b} as Hexadecimal value.
	 * @return colorCode as Hex.
	 */
	public String getHexCode() {
		return this.hexCode;
	}
	
	/**
	 * Returns the RGB representation of the colorCode associated with a given {@link Color3b} as int[].
	 * @return colorCode as int[].
	 */
	public int[] getRGB() {
		return this.rgb;
	}
	
	/**
	 * Returns the String representation of the ANSI Escape value associated with a given {@link Color3b}.
	 * @return colorCode as full ANSI Escape Sequence String.
	 */
	@Override
	public String toString() {
		return "\u001b["+this.colorCode+"m";
	}
}
