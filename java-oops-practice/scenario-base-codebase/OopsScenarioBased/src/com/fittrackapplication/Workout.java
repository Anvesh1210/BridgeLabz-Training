package com.fittrackapplication;

public abstract class Workout implements ITrackable {

	//workout attributes
    protected String type;
    protected int duration;  
    protected double caloriesBurned;

    //internal workout logs
    private String[] workoutLogs = new String[5];

    //workout constructor to initialize type and duration
    public Workout(String type, int duration) {
        this.type = type;
        this.duration = duration;
    }

    //calculate calories method
    public abstract void calculateCalories(double weight);

    //getter method to get calories burned
    public double getCaloriesBurned() {
        return caloriesBurned;
    }

    //method to start workout
    @Override
    public void startWorkout() {
        System.out.println(type + " workout started");
    }

    //method to end workout
    @Override
    public void stopWorkout() {
        System.out.println(type + " workout stopped");
    }
}

