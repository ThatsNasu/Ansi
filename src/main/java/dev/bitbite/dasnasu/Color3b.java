package dev.bitbite.dasnasu;

/**
 * Predefined Colors to be used wherever you want. These ColorCodes follow the 3Bit scheme and only work in environments that support ANSI Escaping.
 */
public enum Color3b {
	BLACK("Black", "30", "#000000", new int[] {0, 0, 0}),
	BLUE("Blue", "34", "000080", new int[] {0, 0, 128}),
	CYAN("Cyan", "36", "008080", new int[] {0, 128, 128}),
	GREEN("Green", "32", "008000", new int[] {0, 128, 0}),
	MAGENTA("Magenta", "35", "800080", new int[] {128, 0, 128}),
	RED("Red", "31", "800000", new int[] {128, 0, 0}),
	RESET("Reset", "0", null, null),
	WHITE("White", "37", "808080", new int[] {128, 128, 128}),
	YELLOW("Yellow", "33", "808000", new int[] {128, 128, 0});

	
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
	
	@Override
	public String toString() {
		return "\u001b["+this.colorCode+"m";
	}
}
