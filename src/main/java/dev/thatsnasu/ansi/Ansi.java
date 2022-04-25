package dev.thatsnasu.ansi;

import java.util.ArrayList;

/**
 * Objects created of this class will hold information about Colors and Formats.
 * It also provides methods for manipulation and reusing them.
 */
public class Ansi {
	private Color3b color3b;
	private Color4b color4b;
	private Color8b color8b;
	private Color color;
	private ArrayList<Format> formats;
	
	/**
	 * Creates an empty Ansi Object, which will hold Color values as well as formatting options after adding them.
	 */
	public Ansi() {
		this.formats = new ArrayList<Format>();
	}
	
	/**
	 * Creates a new Ansi Object, which will hold provided Color values as well as formatting options.
	 * @param color3b of the Ansi Object
	 * @param formats of the Ansi Object
	 */
	public Ansi(Color3b color3b, Format... formats) {
		this.formats = new ArrayList<Format>();
		this.color3b = color3b;
		this.addFormats(formats);
	}
	
	/**
	 * Creates a new Ansi Object, which will hold provided Color values as well as formatting options.
	 * @param color4b of the Ansi Object
	 * @param formats of the Ansi Object
	 */
	public Ansi(Color4b color4b, Format... formats) {
		this.formats = new ArrayList<Format>();
		this.color4b = color4b;
		this.addFormats(formats);
	}
	
	/**
	 * Creates a new Ansi Object, which will hold provided Color values as well as formatting options.
	 * @param color8b of the Ansi Object
	 * @param formats of the Ansi Object
	 */
	public Ansi(Color8b color8b, Format... formats) {
		this.formats = new ArrayList<Format>();
		this.color8b = color8b;
		this.addFormats(formats);
	}
	
	/**
	 * Creates a new Ansi Object, which will hold provided Color values as well as formatting options.
	 * @param color of the Ansi Object
	 * @param formats of the Ansi Object
	 */
	public Ansi(Color color, Format... formats) {
		this.formats = new ArrayList<Format>();
		this.color = color;
		this.addFormats(formats);
	}
	
	/**
	 * Returns the corresponding ANSI Escape Sequence for a given {@link Color3b} and optional {@link Format}s.
	 * @param color3b of the resulting ANSI Escape String.
	 * @param formats of the resulting ANSI Escape String, can be left empty.
	 * @return the String representation of the ANSI Escape String.
	 */
	public static String getAnsiEscape(Color3b color3b, Format... formats) {
		String escape = "\u001b["+color3b.getColorCode();
		for(Format format : formats) {
			escape +=";"+format.getFormatCode();
		}
		return escape+"m";
	}
	
	/**
	 * Returns the corresponding ANSI Escape Sequence for a given {@link Color4b} and optional {@link Format}s.
	 * @param color4b of the resulting ANSI Escape String.
	 * @param formats of the resulting ANSI Escape String, can be left empty.
	 * @return the String representation of the ANSI Escape String.
	 */
	public static String getAnsiEscape(Color4b color4b, Format... formats) {
		String escape = "\u001b["+color4b.getColorCode();
		for(Format format : formats) {
			escape +=";"+format.getFormatCode();
		}
		return escape+"m";
	}
	
	/**
	 * Returns the corresponding ANSI Escape Sequence for a given {@link Color8b} and optional {@link Format}s.
	 * @param color8b of the resulting ANSI Escape String.
	 * @param formats of the resulting ANSI Escape String, can be left empty.
	 * @return the String representation of the ANSI Escape String.
	 */
	public static String getAnsiEscape(Color8b color8b, Format... formats) {
		String escape = "\u001b[38;5;"+color8b.getColorCode();
		for(Format format : formats) {
			escape +=";"+format.getFormatCode();
		}
		return escape+"m";
	}
	
	/**
	 * Returns the corresponding ANSI Escape Sequence for a given {@link Color} and optional {@link Format}s.
	 * @param color of the resulting ANSI Escape String.
	 * @param formats of the resulting ANSI Escape String, can be left empty.
	 * @return the String representation of the ANSI Escape String.
	 */
	public static String getAnsiEscape(Color color, Format... formats) {
		String escape = "\u001b[38;2;"+color.getColorCode();
		for(Format format : formats) {
			escape +=";"+format.getFormatCode();
		}
		return escape+"m";
	}
	
	/**
	 * Returns the corresponding ANSI Escape Sequence for optional {@link Format}s.
	 * @param formats of the resulting ANSI Escape String, can be left empty.
	 * @return the String representation of the ANSI Escape String.
	 */
	public static String getAnsiEscape(Format... formats) {
		String escape = "\u001b[";
		for(int i = 0; i < formats.length; i++) {
			if(i > 0) escape += ";";
			escape += formats[i].getFormatCode();
		}
		return escape+"m";
	}
	
	/**
	 * Returns the corresponding ANSI Escape Sequence for the stored parameters in this Ansi object.
	 * @return the String representation of the ANSI Escape String.
	 */
	@Override
	public String toString() {
		String escape = "\u001b[";
		escape += (this.color3b != null) ? this.color3b.getColorCode() : "";
		escape += (this.color4b != null) ? this.color4b.getColorCode() : "";
		escape += (this.color8b != null) ? "38;5;"+this.color8b.getColorCode() : "";
		escape += (this.color != null) ? "38;2;"+this.color.getColorCode() : "";
		for(Format format : this.formats) {
			escape += ";"+format.getFormatCode();
		}
		return escape+"m";
	}
	
	/**
	 * Adds one or more {@link Format}s to the stored formatting options if it is / they are not already set.
	 * @param formats to be added
	 */
	public void addFormats(Format... formats) {
		for(Format format : formats) {
			if(!this.formats.contains(format)) this.formats.add(format);
		}
	}
	
	/**
	 * Removes one or more {@link Format}s from the stored formatting options if it exists / they exist.
	 * @param formats to be removed
	 */
	public void removeFormats(Format... formats) {
		for(Format format : formats) {
			if(this.formats.contains(format)) this.formats.remove(format);
		}
	}
	
	/**
	 * Removes all previously set {@link Format}s of this instance.
	 */
	public void removeAllFormats() {
		this.formats = new ArrayList<Format>();
	}
	
	/**
	 * Returns this instances stored {@link Color3b}.
	 * @return color3b of this instance
	 */
	public Color3b getColor3b() {
		return this.color3b;
	}
	
	/**
	 * Returns this instances stored {@link Color4b}.
	 * @return color4b of this instance
	 */
	public Color4b getColor4b() {
		return this.color4b;
	}
	
	/**
	 * Returns this instances stored {@link Color8b}.
	 * @return color8b of this instance
	 */
	public Color8b getColor8b() {
		return this.color8b;
	}

	/**
	 * Returns this instances stored {@link Color}.
	 * @return color of this instance
	 */
	public Color getColor() {
		return this.color;
	}
	
	/**
	 * Sets this instances {@link Color3b}.
	 * @param color3b to be set
	 */
	public void setColor3b(Color3b color3b) {
		this.color3b = color3b;
	}
	
	/**
	 * Sets this instances {@link Color4b}.
	 * @param color4b to be set
	 */
	public void setColor4b(Color4b color4b) {
		this.color4b = color4b;
	}
	
	/**
	 * Sets this instances {@link Color8b}.
	 * @param color8b to be set
	 */
	public void setColor8b(Color8b color8b) {
		this.color8b = color8b;
	}
	
	/**
	 * Sets this instances {@link Color}.
	 * @param color to be set
	 */
	public void setColor(Color color) {
		this.color = color;
	}
	
	/**
	 * Sets one or more {@link Format}s for this instance.
	 * @param formats to be set
	 */
	public void setFormats(Format... formats) {
		this.formats = new ArrayList<Format>();
		for(Format format : formats) {
			this.formats.add(format);
		}
	}
}
