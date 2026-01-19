package com.budgetwise;

import java.util.*;

//class for annual budget
public class AnnualBudget extends Budget {
	// constructor for annual budget
	public AnnualBudget(double income, double limit, Map<String, Double> categoryLimits) {
		super(income, limit, categoryLimits);
	}

	// method for generating annual report
	public void generateReport() {
		System.out.println("Annual Budget Summary");
		System.out.println("Yearly Income: " + income);
		System.out.println("Yearly Expenses: " + getTotalExpenses());
		System.out.println("Yearly Savings: " + calculateSavings());
	}

	// method for detecting overspend annually
	public boolean detectOverspend() {
		return getTotalExpenses() > limit || isCategoryExceeded();
	}
}
