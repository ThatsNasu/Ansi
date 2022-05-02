package dev.thatsnasu.ansi;

import dev.thatsnasu.ansi.exceptions.MalformedHexadecimalException;
import dev.thatsnasu.ansi.exceptions.MalformedRGBException;

/**
 * Objects of Color will hold the rgb values, as well as providing methods for using and converting them.
 */
public class Color {
	private int red;
	private int green;
	private int blue;
	
	/**
	 * Creates a new Color Object and sets its color values.
	 * @param red value of this color
	 * @param green value of this color
	 * @param blue value of this color
	 */
	public Color(int red, int green, int blue) {
		if(red > 255 || red < 0) throw new MalformedRGBException("Red can only range from 0-255, "+red+" given.");
		if(green > 255 || green < 0) throw new MalformedRGBException("Green can only range from 0-255, "+green+" given.");
		if(blue > 255 || blue < 0) throw new MalformedRGBException("Blue can only range from 0-255, "+blue+" given.");
		this.red = red;
		this.green = green;
		this.blue = blue;
	}
	
	/**
	 * Creates a new Color Object and sets its color values
	 * @param hexcode of this color
	 */
	public Color(String hexcode) {
		if(hexcode == null) throw new IllegalArgumentException("Hexadecial value expected, null given");
		if(hexcode.contains("#")) hexcode = hexcode.replace("#", "");
		if(!hexcode.matches("[0-9a-fA-F]+$") || (hexcode.length() != 6 && hexcode.length() != 3)) throw new MalformedHexadecimalException("Hexadecimal values can only hold values from 0-9, a-f and A-F, with a length of 6 characters, \""+hexcode+"\" given");
		if(hexcode.length() == 3) hexcode = hexcode.replaceAll(".", "$0$0");
		long l = Long.parseLong(hexcode, 16);
		this.red = (int) (l/(256*256));
		this.green = (int) (l-(256*256*this.red))/256;
		this.blue = (int) l-(256*256*this.red)-(256*this.green);
	}
	
	/**
	 * Returns the String representation of the colorCode associated with this {@link Color} Object.
	 * @return colorCode as ANSI Escape Sequence String part.
	 */
	public String getColorCode() {
		return this.red+";"+this.green+";"+this.blue;
	}
	
	/**
	 * Returns the String representation of the colorCode associated with this {@link Color} Object as Hexadecimal value.
	 * @return colorCode as Hex.
	 */
	public String getHex() {
		return String.format("#%02x%02x%02x", this.red, this.green, this.blue);
	}
	
	/**
	 * Returns the String representation of the colorCode associated with this {@link Color} Object as three digit Hexadecimal value.
	 * @return colorCode as three digit Hex.
	 */
	public String getHex3() {
		String hex6 = this.getHex();
		return "#"+hex6.charAt(1)+hex6.charAt(3)+hex6.charAt(5);
	}
	
	/**
	 * Returns the red value of this color.
	 * @return red value
	 */
	public int getRed() {
		return this.red;
	}
	
	/**
	 * Returns the blue value of this color as part of a hexadecimal String.
	 * @return red value
	 */
	public String getRedAsHex() {
		return String.format("%02x", this.red);
	}
	
	/**
	 * Returns the blue value of this color as part of a hexadecimal three digit String.
	 * @return red value
	 */
	public String getRedAsHex3() {
		return ""+getRedAsHex().charAt(0);
	}
	
	/**
	 * Returns the green value of this color.
	 * @return green value
	 */
	public int getGreen() {
		return this.green;
	}
	
	/**
	 * Returns the blue value of this color as part of a hexadecimal String.
	 * @return green value
	 */
	public String getGreenAsHex() {
		return String.format("%02x", this.green);
	}
	
	/**
	 * Returns the blue value of this color as part of a hexadecimal three digit String.
	 * @return green value
	 */
	public String getGreenAsHex3() {
		return ""+getGreenAsHex().charAt(0);
	}
	
	/**
	 * Returns the blue value of this color.
	 * @return blue value
	 */
	public int getBlue() {
		return this.blue;
	}
	
	/**
	 * Returns the blue value of this color as part of a hexadecimal String.
	 * @return blue value
	 */
	public String getBlueAsHex() {
		return String.format("%02x", this.blue);
	}
	
	/**
	 * Returns the blue value of this color as part of a hexadecimal three digit String.
	 * @return blue value
	 */
	public String getBlueAsHex3() {
		return ""+getBlueAsHex().charAt(0);
	}
	
	/**
	 * Returns the rgb values of this color as int[]. Index 0 will be red, 1 will be green and 2 will be blue.
	 * @return rbg values as int[]
	 */
	public int[] getRGB() {
		return new int[] {this.red, this.green, this.blue};
	}
	
	/**
	 * Returns the String representation of the ANSI Escape value associated with this {@link Color} Object.
	 * @return colorCode as full ANSI Escape Sequence String.
	 */
	@Override
	public String toString() {
		return "\u001b[38;2;"+this.getColorCode()+"m";
	}
}
