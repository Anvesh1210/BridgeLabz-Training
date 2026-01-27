package com.junit.advanced;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateFormatterTest {
	private DateFormatter formatter;

	@BeforeEach
	void setUp() {
		formatter = new DateFormatter();
	}

	// valid date test
	@Test
	@DisplayName("Valid Date Format Test")
	void testValidDate() {
		assertEquals("25-01-2026", formatter.formatDate("2026-01-25"));
	}

	// invalid date format
	@Test
	@DisplayName("Invalid Date Format Test")
	void testInvalidDate() {
		assertNull(formatter.formatDate("25-01-2026"));
	}

	// invalid date value
	@Test
	@DisplayName("Invalid Date Value Test")
	void testInvalidDateValue() {
		assertNull(formatter.formatDate("2026-13-40"));
	}

	// null input test
	@Test
	@DisplayName("Null Date Test")
	void testNullDate() {
		assertNull(formatter.formatDate(null));
	}
}
