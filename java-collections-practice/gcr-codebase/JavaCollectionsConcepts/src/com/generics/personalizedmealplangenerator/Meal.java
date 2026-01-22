package com.generics.personalizedmealplangenerator;

//class to represent Meal
public class Meal<T extends MealPlan> {

	//meal attributes
	private T mealPlan;

	//constructor to initialize meal
	public Meal(T mealPlan) {
		this.mealPlan = mealPlan;
	}

	//getter method for meal plan
	public T getMealPlan() {
		return mealPlan;
	}
}
