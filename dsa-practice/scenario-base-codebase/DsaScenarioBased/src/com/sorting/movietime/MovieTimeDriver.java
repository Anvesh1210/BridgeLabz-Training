package com.sorting.movietime;

public class MovieTimeDriver {

    public static void main(String[] args) {
    	//creating movie  manager
        MovieTime manager = new MovieTime();
        manager.addShow(new MovieShow("Inception", 1800));
        manager.addShow(new MovieShow("Interstellar", 1500));
        manager.addShow(new MovieShow("Avengers", 2000));
        manager.addShow(new MovieShow("Parasite", 1630));
        manager.addShow(new MovieShow("The Dark Knight", 1400));
        System.out.println("Sorted Movie Show Listings:");
        manager.displayShows();
    }
}
