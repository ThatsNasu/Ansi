package dev.thatsnasu.ansi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dev.thatsnasu.ansi.exceptions.MalformedHexadecimalException;
import dev.thatsnasu.ansi.exceptions.MalformedRGBException;

public class ColorCheck {
	
	@Test
	@DisplayName("Expected MalformedRGBException")
	void rgbColorMissformat() {
		assertThrows(MalformedRGBException.class, () -> new Color(0, 0, -1));
		assertThrows(MalformedRGBException.class, () -> new Color(0, -1, 0));
		assertThrows(MalformedRGBException.class, () -> new Color(-1, 0, 0));

		assertThrows(MalformedRGBException.class, () -> new Color(0, 0, 256));
		assertThrows(MalformedRGBException.class, () -> new Color(0, 256, 0));
		assertThrows(MalformedRGBException.class, () -> new Color(256, 0, 0));
	}
	
	@Test
	@DisplayName("Expected MalformedHexadecimalException")
	void hexColorMissformat() {
		assertThrows(MalformedHexadecimalException.class, () -> new Color("1234567"));
		assertThrows(MalformedHexadecimalException.class, () -> new Color("#1234567"));
		assertThrows(MalformedHexadecimalException.class, () -> new Color("abcdefg"));
		assertThrows(MalformedHexadecimalException.class, () -> new Color("#abcdefg"));
		assertThrows(MalformedHexadecimalException.class, () -> new Color("12345"));
		assertThrows(MalformedHexadecimalException.class, () -> new Color("#12345"));
		assertThrows(MalformedHexadecimalException.class, () -> new Color("abcde"));
		assertThrows(MalformedHexadecimalException.class, () -> new Color("#abcde"));
		assertThrows(MalformedHexadecimalException.class, () -> new Color("12345g"));
		assertThrows(MalformedHexadecimalException.class, () -> new Color("#12345g"));
		assertThrows(MalformedHexadecimalException.class, () -> new Color("g12345"));
		assertThrows(MalformedHexadecimalException.class, () -> new Color("#g12345"));
		assertThrows(MalformedHexadecimalException.class, () -> new Color("123g45"));
		assertThrows(MalformedHexadecimalException.class, () -> new Color("#123g45"));
	}
	
	@Test
	@DisplayName("Expected IllegalArgumentException")
	void illegalArgument() {
		assertThrows(IllegalArgumentException.class, () -> new Color(null));
	}
	
	@Test
	@DisplayName("Storing and retrieving")
	void storeAndRetrieve() {
		Color color = new Color(123, 234, 45);
		
		assertEquals(123, color.getRed(), "Red missmatch while getting stored value");
		assertEquals(234, color.getGreen(), "Green missmatch while getting stored value");
		assertEquals(45, color.getBlue(), "Blue missmatch while getting stored value");
		
		assertEquals(123, color.getRGB()[0], "Red missmatch while getting stored value as array");
		assertEquals(234, color.getRGB()[1], "Green missmatch while getting stored value as array");
		assertEquals(45, color.getRGB()[2], "Blue missmatch while getting stored value as array");
		
		assertEquals("7b", color.getRedAsHex(), "Red missmatch while getting stored value as hexadecimal");
		assertEquals("ea", color.getGreenAsHex(), "Green missmatch while getting stored value as hexadecimal");
		assertEquals("2d", color.getBlueAsHex(), "Blue missmatch while getting stored value as hexadecimal");
		
		assertEquals("#7bea2d", color.getHex(), "Hexadecimal missmatch while getting stored value");
		
		color = new Color("#afbecd");
		
		assertEquals("af", color.getRedAsHex(), "Red missmatch while getting stored value");
		assertEquals("be", color.getGreenAsHex(), "Green missmatch while getting stored value");
		assertEquals("cd", color.getBlueAsHex(), "Blue missmatch while getting sotred value");
		
		assertEquals("#afbecd", color.getHex(), "Hexadecimal missmactch while getting stroed value");
		
		assertEquals(175, color.getRed(), "Red missmatch while getting stored value");
		assertEquals(190, color.getGreen(), "Green missmatch while getting stored value");
		assertEquals(205, color.getBlue(), "Blue missmatch while getting stored value");
		
		assertEquals(175, color.getRGB()[0], "Red missmatch while getting stored value as array");
		assertEquals(190, color.getRGB()[1], "Green missmatch while getting stored value as array");
		assertEquals(205, color.getRGB()[2], "Blue missmatch while getting stored value as array");
	}
}
