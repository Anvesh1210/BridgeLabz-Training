package com.junit.advanced;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
	private TemperatureConverter converter;

	@BeforeEach
	void setUp() {
		converter = new TemperatureConverter();
	}

	// writing test cases
	// test Celsius to Fahrenheit
	@Test
	@DisplayName("Celsius to Fahrenheit Conversion")
	void testCelsiusToFahrenheit() {
		assertEquals(32.0, converter.celsiusToFahrenheit(0), 0.01);
		assertEquals(212.0, converter.celsiusToFahrenheit(100), 0.01);
	}

	// test Fahrenheit to Celsius
	@Test
	@DisplayName("Fahrenheit to Celsius Conversion")
	void testFahrenheitToCelsius() {
		assertEquals(0.0, converter.fahrenheitToCelsius(32), 0.01);
		assertEquals(100.0, converter.fahrenheitToCelsius(212), 0.01);
	}
}
