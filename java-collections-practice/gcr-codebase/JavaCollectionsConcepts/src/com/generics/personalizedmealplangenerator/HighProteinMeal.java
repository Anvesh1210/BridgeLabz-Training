package com.generics.personalizedmealplangenerator;

//class to represent high protein meal
public class HighProteinMeal implements MealPlan {

	//getter methods for high protein meal
	@Override
	public String getMealType() {
		return "High Protein";
	}

	@Override
	public int getCalories() {
		return 800;
	}
}
