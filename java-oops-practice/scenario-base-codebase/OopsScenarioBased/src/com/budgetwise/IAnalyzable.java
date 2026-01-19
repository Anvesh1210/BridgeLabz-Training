package com.budgetwise;

//interface for financial analysis
public interface IAnalyzable {
	// method for generating budget report
	void generateReport();
	// method for detecting overspending
	boolean detectOverspend();
}
