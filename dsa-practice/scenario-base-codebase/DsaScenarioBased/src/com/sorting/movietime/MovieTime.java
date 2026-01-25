package com.sorting.movietime;

import java.util.ArrayList;

public class MovieTime{
    private ArrayList<MovieShow> shows = new ArrayList<>();
    public void addShow(MovieShow show) {
        shows.add(show);
        insertionSort();
    }
    
    //method for insertion sort
    private void insertionSort() {
        for (int i = 1; i < shows.size(); i++) {
            MovieShow key = shows.get(i);
            int j = i - 1;
            while (j >= 0 && shows.get(j).getShowTime() > key.getShowTime()) {
                shows.set(j + 1, shows.get(j));
                j--;
            }
            shows.set(j + 1, key);
        }
    }

    //method for displaying show list
    public void displayShows() {
        for (MovieShow show : shows) {
            show.display();
        }
    }
}
