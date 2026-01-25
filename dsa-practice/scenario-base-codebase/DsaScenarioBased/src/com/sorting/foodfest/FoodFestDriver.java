package com.sorting.foodfest;

public class FoodFestDriver {

	public static void main(String[] args) {

		// class attributes (zone-wise sorted footfall data merged)
		Stall[] stalls = { new Stall("Burger Hub", 120), new Stall("Pizza Corner", 180), new Stall("Taco Town", 150),
				new Stall("Pasta Point", 200), new Stall("Dessert Den", 180), new Stall("Chaat Bazaar", 100) };

		FoodFest manager = new FoodFest();

		System.out.println("Stall Footfall Before Sorting:");
		manager.displayStalls(stalls);

		// method for creating master footfall list
		manager.mergeSort(stalls);

		System.out.println("\nStall Footfall After Sorting:");
		manager.displayStalls(stalls);
	}
}
