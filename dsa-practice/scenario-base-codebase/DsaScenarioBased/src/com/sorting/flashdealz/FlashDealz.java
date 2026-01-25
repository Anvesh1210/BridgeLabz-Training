package com.sorting.flashdealz;

//class to represent Flash Deal
public class FlashDealz {

	// method to start quick sort
	public void quickSort(Product[] products) {
		sort(products, 0, products.length - 1);
	}

	// method to recursive quick sort logic
	private void sort(Product[] products, int low, int high) {
		if (low < high) {
			int pivotIndex = partition(products, low, high);
			sort(products, low, pivotIndex - 1);
			sort(products, pivotIndex + 1, high);
		}
	}

	// method for partitioning based on discount (descending order)
	private int partition(Product[] products, int low, int high) {
		double pivot = products[high].getDiscount();
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (products[j].getDiscount() > pivot) {
				i++;
				Product temp = products[i];
				products[i] = products[j];
				products[j] = temp;
			}
		}
		Product temp = products[i + 1];
		products[i + 1] = products[high];
		products[high] = temp;

		return i + 1;
	}

	// method for displaying products
	public void displayProducts(Product[] products) {
		for (Product p : products) {
			p.display();
		}
	}
}
