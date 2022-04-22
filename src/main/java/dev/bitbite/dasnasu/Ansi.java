package dev.bitbite.dasnasu;

import java.util.ArrayList;

/**
 * Creates a new Ansi Object which will hold some information and provides methods to manipulate and reuse them.
 */
public class Ansi {
	private Color3b color3b;
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
		this.color3b = color3b;
		this.addFormats(formats);
	}
	
	/**
	 * Returns the corresponding ANSI Escape Sequence for a given {@link Color3b} and optional {@link Format}s.
	 * @param color3b of the resulting ANSI Escape String.
	 * @param formats of the resulting ANSI Escape String, can be left empty.
	 * @return the String representation of the ANSI Escape String.
	 */
	public String getAnsiEscape(Color3b color3b, Format... formats) {
		String escape = "\u001b["+color3b.getColorCode();
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
	public String getAnsiEscape(Format... formats) {
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
	public String getAnsiEscape() {
		String escape = "\u001b["+this.color3b.getColorCode();
		for(Format format : this.formats) {
			escape += ";"+format.getFormatCode();
		}
		return escape+"m";
	}
	
	/**
	 * Adds a {@link Format} to the stored formatting options if it is not already set.
	 * @param format to be added
	 */
	public void addFormat(Format format) {
		if(!this.formats.contains(format)) this.formats.add(format);
	}
	
	/**
	 * Adds one or more {@link Format}s to the stored formatting options if it is / they are not already set.
	 * @param formats to be added
	 */
	public void addFormats(Format... formats) {
		for(Format format : formats) {
			this.addFormat(format);
		}
	}
	
	/**
	 * Removes a {@link Format} from the stored formatting options if it exists.
	 * @param format to be removed
	 */
	public void removeFormat(Format format) {
		if(this.formats.contains(format)) this.formats.remove(format);
	}
	
	/**
	 * Removes one or more {@link Format}s from the stored formatting options if it exists / they exist.
	 * @param formats to be removed
	 */
	public void removeFormats(Format... formats) {
		for(Format format : formats) {
			this.removeFormat(format);
		}
	}
	
	/**
	 * Returns this instances stored {@link Color3b}.
	 * @return color3b of this instance
	 */
	public Color3b getColor3b() {
		return this.color3b;
	}
}
