package com.sorting.artexpo;

//class to use Art Expo
public class ArtExpoDriver {
	public static void main(String[] args) {
		// class attributes
		Artist[] artists = { new Artist("Ravi", 1705401000L), new Artist("Anita", 1705400950L),
				new Artist("Kunal", 1705401100L), new Artist("Meera", 1705401050L), new Artist("Soham", 1705401020L) };

		System.out.println("Artists Before Sorting:");
		ArtExpo aExpo = new ArtExpo();
		aExpo.displayArtists(artists);

		// method for maintaining sorted order
		aExpo.insertionSort(artists);

		System.out.println("\nArtists After Sorting (By Registration Time):");
		aExpo.displayArtists(artists);
	}
}
