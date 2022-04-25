package dev.thatsnasu.ansi;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dev.thatsnasu.ansi.exceptions.MalformedHexadecimalException;
import dev.thatsnasu.ansi.exceptions.MalformedRGBException;

public class ExceptionCheck {
	
	@Test
	@DisplayName("Expected MalformedRGBException")
	void rgbColorMissformat() {
		assertThrows(MalformedRGBException.class, () -> new Color(0, 0, -1));
		assertThrows(MalformedRGBException.class, () -> new Color(0, -1, 0));
		assertThrows(MalformedRGBException.class, () -> new Color(0, -1, -1));
		assertThrows(MalformedRGBException.class, () -> new Color(-1, 0, 0));
		assertThrows(MalformedRGBException.class, () -> new Color(-1, 0, -1));
		assertThrows(MalformedRGBException.class, () -> new Color(-1, -1, 0));
		assertThrows(MalformedRGBException.class, () -> new Color(-1, -1, -1));

		assertThrows(MalformedRGBException.class, () -> new Color(0, 0, 256));
		assertThrows(MalformedRGBException.class, () -> new Color(0, 256, 0));
		assertThrows(MalformedRGBException.class, () -> new Color(0, 256, 256));
		assertThrows(MalformedRGBException.class, () -> new Color(256, 0, 0));
		assertThrows(MalformedRGBException.class, () -> new Color(256, 0, 256));
		assertThrows(MalformedRGBException.class, () -> new Color(256, 256, 0));
		assertThrows(MalformedRGBException.class, () -> new Color(256, 256, 256));
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
}
