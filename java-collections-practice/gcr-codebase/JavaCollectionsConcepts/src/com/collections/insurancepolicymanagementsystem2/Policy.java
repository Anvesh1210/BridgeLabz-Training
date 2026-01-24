package com.collections.insurancepolicymanagementsystem2;

import java.time.LocalDate;

//class to represent a policy
public class Policy {

	//policy attributes
	private String policyNumber;
	private String policyHolderName;
	private LocalDate expiryDate;
	private double premiumAmount;

	//constructor to initialize policy
	public Policy(String policyNumber, String policyHolderName, LocalDate expiryDate, double premiumAmount) {
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		this.expiryDate = expiryDate;
		this.premiumAmount = premiumAmount;
	}

	//getter methods for policy
	public String getPolicyNumber() {
		return policyNumber;
	}

	public String getPolicyHolderName() {
		return policyHolderName;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public double getPremiumAmount() {
		return premiumAmount;
	}

	//overriding toString method to display policy
	@Override
	public String toString() {
		return "Policy{" + "policyNumber='" + policyNumber + '\'' + ", policyHolderName='" + policyHolderName + '\''
				+ ", expiryDate=" + expiryDate + ", premiumAmount=" + premiumAmount + '}';
	}
}
