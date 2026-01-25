package com.sorting.fitnesstracker;

//class to use Fitness Tracker
public class FitnessTrackerDriver {
    public static void main(String[] args) {
    	//creating Fitness Tracker
        FitnessTracker manager = new FitnessTracker();
        manager.addUser(new User("Anvesh", 9500));
        manager.addUser(new User("Riya", 12000));
        manager.addUser(new User("Kunal", 8700));
        manager.addUser(new User("Meera", 10300));
        manager.addUser(new User("Soham", 11000));
        //displying user
        System.out.println("Daily Step Count Before Ranking:");
        manager.displayLeaderboard();
        manager.bubbleSort();
        System.out.println("\nDaily Step Count Ranking (After Sorting):");
        manager.displayLeaderboard();
    }
}
