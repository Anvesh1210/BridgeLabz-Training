package com.generics.personalizedmealplangenerator;

//class to represent Vegetarian meal plan
public class VegetarianMeal implements MealPlan {

	//getter methods for meal plan 
	@Override
	public String getMealType() {
		return "Vegetarian";
	}

	@Override
	public int getCalories() {
		return 600;
	}
}
