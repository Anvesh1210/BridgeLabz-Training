package com.junit.advanced;

public class TemperatureConverter {
	// method that converts celsius to fahrenheit
	public double celsiusToFahrenheit(double celsius) {
		return (celsius * 9 / 5) + 32;
	}

	// method that converts fahrenheit to celsius
	public double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}
}
