package com.interfaces.temperaturealertsystem;

import java.util.function.Predicate;

public class TemperatureAlertDriver {
	public static void main(String[] args) {
		Predicate<Double> isHighTemp = temp -> temp > 40;

		double temperature = 45;

		if (isHighTemp.test(temperature)) {
			System.out.println("Temperature Alert!");
		}
	}
}
