package com.linkedlist.doublylinkedlist.moviemanagementsystem;

//class to representing a movie node 
public class MovieNode {
	//movie attributes
	String title;
    String director;
    int year;
    double rating;
    MovieNode prev, next;

    //constructor to initialize movie attributes
    MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.prev = null;
        this.next = null;
    }
}
