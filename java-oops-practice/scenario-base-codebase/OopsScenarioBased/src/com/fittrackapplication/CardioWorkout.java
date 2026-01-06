package com.fittrackapplication;

public class CardioWorkout extends Workout {

    public CardioWorkout(int duration) {
        super("Cardio", duration);
    }

    // Cardio burns more calories per minute
    @Override
    public void calculateCalories(double weight) {
        caloriesBurned = duration * 8 * (weight / 70);
    }
}

