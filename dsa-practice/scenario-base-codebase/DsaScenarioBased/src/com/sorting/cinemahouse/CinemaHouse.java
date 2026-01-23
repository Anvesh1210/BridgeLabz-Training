package com.sorting.cinemahouse;

import java.util.ArrayList;
import java.util.List;

//class to represent Cinema House
public class CinemaHouse {
	//movie list
	List<Movie> movieList;
	
	//constructor to initialize movie list
	public CinemaHouse() {
		this.movieList = new ArrayList<>();
	}
	
	//method to add a movie
	public void add(Movie movie) {
		movieList.add(movie);
	}
	
	//sorting logic to sort the movie
	public void sortMovies() {
		int size = movieList.size();
		for(int i=0 ; i<size-1;i++) {
			for(int j=0 ; j<size-i-1;j++) {
				if(movieList.get(j).getShowTime() < movieList.get(j+1).getShowTime()) {
					Movie temp = movieList.get(j);
					movieList.set(j, movieList.get(j+1));
					movieList.set(j+1, temp);
				}
			}
		}
	}
	
	//method to show all movies
	public void showAllMovies() {
		for(Movie movie :movieList) {
			System.out.println(movie);
		}
	}
}
