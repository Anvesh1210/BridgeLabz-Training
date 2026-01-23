package com.sorting.cropmonitor;

public class SensorDataSorter {

	// method for starting quick sort
	public static void quickSort(SensorData[] data) {
		sort(data, 0, data.length - 1);
	}

	// method for recursive quick sort logic
	private static void sort(SensorData[] data, int low, int high) {
		if (low < high) {
			int pivotIndex = partition(data, low, high);
			sort(data, low, pivotIndex - 1);
			sort(data, pivotIndex + 1, high);
		}
	}

	// method for partitioning based on timestamp
	private static int partition(SensorData[] data, int low, int high) {
		long pivot = data[high].getTimestamp();
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (data[j].getTimestamp() < pivot) {
				i++;
				// swap logic
				SensorData temp = data[i];
				data[i] = data[j];
				data[j] = temp;
			}
		}

		// place pivot in correct position
		SensorData temp = data[i + 1];
		data[i + 1] = data[high];
		data[high] = temp;

		return i + 1;
	}
}
