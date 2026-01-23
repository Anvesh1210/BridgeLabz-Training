package com.sorting.cropmonitor;

public class CropMonitorDriver {
	public static void main(String[] args) {

		// class attributes (unordered sensor data)
		SensorData[] sensorData = { new SensorData(1705402105L, 28.5), new SensorData(1705402001L, 27.2),
				new SensorData(1705402150L, 29.1), new SensorData(1705401900L, 26.8),
				new SensorData(1705402050L, 27.9) };

		System.out.println("Sensor Data Before Sorting:");
		displayData(sensorData);

		// method for sorting sensor data
		SensorDataSorter.quickSort(sensorData);

		System.out.println("\nSensor Data After Sorting (By Timestamp):");
		displayData(sensorData);
	}

	// method for displaying sensor data
	public static void displayData(SensorData[] data) {
		for (SensorData s : data) {
			s.display();
		}
	}
}
