package com.sorting.movietime;

//class to represent Movie Show
public class MovieShow {
    //Movie show attributes
    private String movieName;
    private int showTime; //time in minutes (e.g., 1430 = 2:30 PM)

    //constructor for initializing movie show 
    public MovieShow(String movieName, int showTime) {
        this.movieName = movieName;
        this.showTime = showTime;
    }

    //method for displaying movie show 
    public void display() {
        System.out.println("Movie: " + movieName + ", Show Time: " + showTime);
    }
    
    //method for getting show time
    public int getShowTime() {
        return showTime;
    }

 
}
