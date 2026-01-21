package com.sorting.zipzipmart;

//driver to use Zip Zip Mart
public class ZipZipMartDriver {
	public static void main(String[] args) {
		
		//creating transaction array
		Transaction[] sales = { new Transaction("2026-01-10", 5000), new Transaction("2026-01-08", 2000),
				new Transaction("2026-01-10", 1500), new Transaction("2026-01-09", 3000) };

		//calling mergeSort function
		ZipZipMart.mergeSort(sales, 0, sales.length - 1);
		
		//printing all the transaction
		System.out.println("Sorted Daily Sales Report:");
		for (Transaction t : sales) {
			System.out.println(t);
		}
	}
}
