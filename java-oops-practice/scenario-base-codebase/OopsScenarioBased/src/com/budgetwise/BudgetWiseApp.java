package com.budgetwise;

import java.time.*;
import java.util.*;

//main class for execution
public class BudgetWiseApp {

	// method for main execution
	public static void main(String[] args) {

		Map<String, Double> categories = new HashMap<>();
		categories.put("Food", 5000.0);
		categories.put("Travel", 3000.0);
		categories.put("Shopping", 4000.0);

		Budget monthly = new MonthlyBudget(30000, 15000, categories);

		monthly.addTransaction(new Transaction(2000, "expense", LocalDate.now(), "Food"));
		monthly.addTransaction(new Transaction(6000, "expense", LocalDate.now(), "Shopping"));
		monthly.addTransaction(new Transaction(3000, "expense", LocalDate.now(), "Travel"));

		monthly.generateReport();

		System.out.println("Overspend detected: " + monthly.detectOverspend());

		Budget yearly = new AnnualBudget(400000, 200000, categories);

		yearly.addTransaction(new Transaction(50000, "expense", LocalDate.now(), "Food"));
		yearly.addTransaction(new Transaction(120000, "expense", LocalDate.now(), "Travel"));

		yearly.generateReport();

		System.out.println("Overspend detected: " + yearly.detectOverspend());
	}
}
