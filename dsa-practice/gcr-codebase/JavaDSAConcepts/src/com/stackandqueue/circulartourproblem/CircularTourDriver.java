package com.stackandqueue.circulartourproblem;

//class to use CircularTour class
public class CircularTourDriver {
	public static void main(String[] args) {
        int[] petrol = {6, 3, 7};
        int[] distance = {4, 6, 3};

        //creating CircularTour object
        CircularTour tour = new CircularTour(petrol, distance);
        int startIndex = tour.findStartingPump();

        //printing results
        if (startIndex == -1) {
            System.out.println("No possible circular tour");
        } else {
            System.out.println("Start tour at petrol pump index: " + startIndex);
        }
    }
}
