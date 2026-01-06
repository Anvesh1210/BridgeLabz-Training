package com.fittrackapplication;

public class StrengthWorkout extends Workout {

    public StrengthWorkout(int duration) {
        super("Strength", duration);
    }

    //strength training burns fewer calories than cardio
    @Override
    public void calculateCalories(double weight) {
        caloriesBurned = duration * 5 * (weight / 70);
    }
}

