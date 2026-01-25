package com.sorting.medwarehouse;

public class MedWarehouseDriver {

	public static void main(String[] args) {

		// class attributes (branch-wise sorted expiry data combined)
		Medicine[] medicines = { new Medicine("Paracetmol", 30), new Medicine("Amoxicillin", 10),
				new Medicine("Ibuprofen", 45), new Medicine("Cough Syrup", 5), new Medicine("Vitamin C", 20),
				new Medicine("Antacid", 10) };

		//creating MedWareHouse
		MedWarehouseManager manager = new MedWarehouseManager();
		System.out.println("Medicines Before Sorting:");
		manager.displayMedicines(medicines);
		manager.mergeSort(medicines);
		System.out.println("\nMedicines Sorted by Expiry (Nearest First):");
		manager.displayMedicines(medicines);
	}
}
