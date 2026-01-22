package com.generics.personalizedmealplangenerator;

//class to represent Ketomeal
public class KetoMeal implements MealPlan {

	//getter methods
	@Override
	public String getMealType() {
		return "Keto";
	}

	@Override
	public int getCalories() {
		return 700;
	}
}
