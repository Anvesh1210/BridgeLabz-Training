package com.collections.insurancepolicymanagementsystem;

import java.time.LocalDate;
import java.util.Objects;

public class Policy implements Comparable<Policy> {
	private int policyNumber;
	private String policyholderName;
	private LocalDate expiryDate;
	private String coverageType;
	private double premiumAmount;

	public Policy(int policyNumber, String policyholderName, LocalDate expiryDate, String coverageType,
			double premiumAmount) {
		super();
		this.policyNumber = policyNumber;
		this.policyholderName = policyholderName;
		this.expiryDate = expiryDate;
		this.coverageType = coverageType;
		this.premiumAmount = premiumAmount;
	}

	public int getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getPolicyholderName() {
		return policyholderName;
	}

	public void setPolicyholderName(String policyholderName) {
		this.policyholderName = policyholderName;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getCoverageType() {
		return coverageType;
	}

	public void setCoverageType(String coverageType) {
		this.coverageType = coverageType;
	}

	public double getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	@Override
	public String toString() {
		return "Policy [policyNumber=" + policyNumber + ", policyholderName=" + policyholderName + ", expiryDate="
				+ expiryDate + ", coverageType=" + coverageType + ", premiumAmount=" + premiumAmount + "]";
	}

	@Override
	public int compareTo(Policy o) {
		return (int)(o.expiryDate.toEpochDay() - this.expiryDate.toEpochDay());
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(this == obj) return true;
		if(!(obj instanceof Policy)) return false;
		Policy policy = (Policy) obj;
		return this.policyNumber == policy.getPolicyNumber();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(policyNumber);
	}
	
}
