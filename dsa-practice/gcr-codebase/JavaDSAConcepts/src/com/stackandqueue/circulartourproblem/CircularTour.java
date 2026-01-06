package com.stackandqueue.circulartourproblem;

public class CircularTour {
	private int[] petrol;
    private int[] distance;
    //taking petrol Array and distance array in constructor
    public CircularTour(int[] petrol, int[] distance) {
        this.petrol = petrol;
        this.distance = distance;
    }

    //method to find starting pump
    public int findStartingPump() {
        int start = 0;
        int surplus = 0;
        int deficit = 0;

        for (int i = 0; i < petrol.length; i++) {
            surplus += petrol[i] - distance[i];

            if (surplus < 0) {
                deficit += surplus;
                surplus = 0;
                start = i + 1;
            }
        }

        return (surplus + deficit >= 0) ? start : -1;
    }
}
