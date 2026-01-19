package com.budgetwise;

import java.util.*;

//base budget class
public abstract class Budget implements IAnalyzable {
	// attributes for Budget
	protected double income;
	protected double limit;
	protected Map<String, Double> categoryLimits;
	protected List<Transaction> transactions;

	// constructor for budget initialization
	public Budget(double income, double limit, Map<String, Double> categoryLimits) {
		this.income = income;
		this.limit = limit;
		this.categoryLimits = categoryLimits;
		this.transactions = new ArrayList<>();
	}

	// method for adding transaction safely
	public void addTransaction(Transaction t) {
		transactions.add(t);
	}

	// method for calculating total expenses
	protected double getTotalExpenses() {
		double total = 0;

		for (Transaction t : transactions) {
			if (t.getType().equalsIgnoreCase("expense")) {
				total += t.getAmount();
			}
		}
		return total;
	}

	// method for calculating net savings
	public double calculateSavings() {
		return income - getTotalExpenses();
	}

	// method for checking category overspend
	protected boolean isCategoryExceeded() {
		Map<String, Double> spent = new HashMap<>();

		for (Transaction t : transactions) {
			if (t.getType().equalsIgnoreCase("expense")) {
				spent.put(t.getCategory(), spent.getOrDefault(t.getCategory(), 0.0) + t.getAmount());
			}
		}

		for (String cat : spent.keySet()) {
			if (spent.get(cat) > categoryLimits.getOrDefault(cat, Double.MAX_VALUE)) {
				return true;
			}
		}
		return false;
	}
}
