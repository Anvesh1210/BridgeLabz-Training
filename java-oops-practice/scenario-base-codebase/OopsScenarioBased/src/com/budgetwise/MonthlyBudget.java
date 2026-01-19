package com.budgetwise;

import java.util.*;

//class for monthly budget
public class MonthlyBudget extends Budget {
	// constructor for monthly budget
	public MonthlyBudget(double income, double limit, Map<String, Double> categoryLimits) {
		super(income, limit, categoryLimits);
	}

	// method for generating monthly report
	public void generateReport() {
		System.out.println("Monthly Budget Report");
		System.out.println("Income: " + income);
		System.out.println("Expenses: " + getTotalExpenses());
		System.out.println("Savings: " + calculateSavings());
	}

	// method for detecting overspend monthly
	public boolean detectOverspend() {
		return getTotalExpenses() > limit || isCategoryExceeded();
	}
}
