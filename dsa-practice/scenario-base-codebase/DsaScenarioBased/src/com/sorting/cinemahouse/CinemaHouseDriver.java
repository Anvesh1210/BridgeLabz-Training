package com.sorting.cinemahouse;

//Driver class to cinema house
public class CinemaHouseDriver {
	public static void main(String[] args) {
		//creating cinemaHouse and movies objects
		CinemaHouse cinemaHouse = new CinemaHouse();
		Movie movie1 = new Movie("Inception", 148);
		Movie movie2 = new Movie("Avengers: Endgame", 181);
		Movie movie3 = new Movie("Interstellar", 169);
		Movie movie4 = new Movie("The Dark Knight", 152);
		Movie movie5 = new Movie("Parasite", 132);
		
		cinemaHouse.add(movie1);
		cinemaHouse.add(movie2);
		cinemaHouse.add(movie3);
		cinemaHouse.add(movie4);
		cinemaHouse.add(movie5);
		
		cinemaHouse.sortMovies();
		
		//displaying all the movies
		cinemaHouse.showAllMovies();
	}
}
