package com.generics.personalizedmealplangenerator;

//class to generate meal plan 
public class MealPlanGenerator {

	public static <T extends MealPlan> void generateMealPlan(T plan) {

		System.out.println("Generating Personalized Meal Plan...");
		System.out.println("Meal Type : " + plan.getMealType());
		System.out.println("Calories  : " + plan.getCalories());
		System.out.println("Status    : Meal Plan Validated");
		System.out.println();
	}
}
