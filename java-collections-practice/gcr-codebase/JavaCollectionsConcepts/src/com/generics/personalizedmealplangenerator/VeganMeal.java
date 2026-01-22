package com.generics.personalizedmealplangenerator;

//class to represent VeganMeal 
public class VeganMeal implements MealPlan {

	//getter methods
	@Override
	public String getMealType() {
		return "Vegan";
	}

	@Override
	public int getCalories() {
		return 500;
	}
}
