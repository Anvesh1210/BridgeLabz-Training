package com.streamapi.iotsensorreadings;

import java.util.Arrays;
import java.util.List;

public class IoTSensorReadings {
	public static void main(String[] args) {
		List<Integer> readings = Arrays.asList(45, 80, 30, 95, 60);
		int threshold = 60;
		readings.stream().filter(r -> r > threshold).forEach(r -> System.out.println("High Reading: " + r));
	}
}
