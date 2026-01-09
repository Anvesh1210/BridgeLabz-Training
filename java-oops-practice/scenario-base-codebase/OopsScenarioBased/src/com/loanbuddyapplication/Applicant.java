package com.loanbuddyapplication;

public class Applicant {
	//Applicant fields
	protected String name;
	private double income;
	private double loanAmount;
	
	private int craditScore;
	
	//constructor to initialize applicant fields
	public Applicant(String name, int craditScore, double income, double loanAmount) {
		this.name = name;
		this.craditScore = craditScore;
		this.income = income;
		this.loanAmount = loanAmount;
	}
	
	//displaying Applicant details
	public void displayDetails() {
		System.out.println("Applicant Details: ");
		System.out.println("Name: "+name);
		System.out.println("Income: "+income);
		System.out.println("Loan Amount "+loanAmount);
		System.out.println("Cardit Score "+craditScore);
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getCraditScore() {
		return craditScore;
	}

	public void setCraditScore(int craditScore) {
		this.craditScore = craditScore;
	}

	public boolean hasGoodcradit(int minCradit) {
		if(minCradit<=craditScore) {
			return true;
		}
		return false;
	}
}
