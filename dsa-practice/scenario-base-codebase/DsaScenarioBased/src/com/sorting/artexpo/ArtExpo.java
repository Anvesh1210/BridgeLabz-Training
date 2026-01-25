package com.sorting.artexpo;

//class to represent Art Expo
public class ArtExpo {
	// method for sorting artists
	public void insertionSort(Artist[] artists) {
		for (int i = 1; i < artists.length; i++) {
			Artist key = artists[i];
			int j = i - 1;
			while (j >= 0 && artists[j].getRegistrationTime() > key.getRegistrationTime()) {
				artists[j + 1] = artists[j];
				j--;
			}
			artists[j + 1] = key;
		}
	}

	// method to display artists
	public void displayArtists(Artist[] artists) {
		for (Artist a : artists) {
			a.display();
		}
	}
}
