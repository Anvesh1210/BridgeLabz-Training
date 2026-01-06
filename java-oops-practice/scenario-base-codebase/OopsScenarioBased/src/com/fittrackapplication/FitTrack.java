package com.fittrackapplication;

public class FitTrack {
	public static void main(String[] args) {
		//creating User profile
        UserProfile user = new UserProfile("Anvesh",21,72,"Weight Loss");

        System.out.println("============== Welcome to Fit Tracker application ================\n");
        //displaying user details
        user.displayProfile();

        //daily calorie target
        double dailyTarget = 500;

        //creating workout object
        Workout workout = new CardioWorkout(30); 

        //start workout
        workout.startWorkout();
        workout.calculateCalories(user.getWeight());
        //stop workout
        workout.stopWorkout();

        //calories burned
        double caloriesBurned = workout.getCaloriesBurned();

        //operator usage for progress
        double remainingCalories = dailyTarget - caloriesBurned;

        System.out.println("Calories Burned: " + caloriesBurned);
        System.out.println("Remaining Calories to Burn Today: " + remainingCalories);
    }
}
