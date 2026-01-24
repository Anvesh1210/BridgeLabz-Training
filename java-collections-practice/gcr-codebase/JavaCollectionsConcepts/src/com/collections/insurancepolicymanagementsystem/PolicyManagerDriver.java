package com.collections.insurancepolicymanagementsystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PolicyManagerDriver {
	public static void main(String[] args) {

		//creating policy Manager
		PolicyManager manager = new PolicyManager();

		//creating policy objects and store them into a list
		List<Policy> policyList = new ArrayList<>();
		Policy p1 = new Policy(101, "Anvesh", LocalDate.now().plusDays(10), "Health", 5000);
		Policy p2 = new Policy(102, "Rahul", LocalDate.now().plusDays(40), "Car", 7000);
		Policy p3 = new Policy(103, "Sneha", LocalDate.now().plusDays(20), "Health", 6000);
		Policy p4 = new Policy(101, "Anvesh Duplicate", LocalDate.now().plusDays(10), "Health", 5000);
		policyList.add(p1);
		policyList.add(p2);
		policyList.add(p3);
		policyList.add(p4);

		// Add to PolicyManager
		for (Policy policy : policyList) {
			manager.addPolicy(policy);
		}

		System.out.println("\n--- All Unique Policies ---");
		manager.displayAllUniquePolicy();

		System.out.println("\n--- Policies Expiring Within 30 Days ---");
		manager.displayExpiringSoon();

		System.out.println("\n--- Health Coverage Policies ---");
		manager.displaySpecificCoverageTypePolicies("Health");

		System.out.println("\n--- Duplicate Policies ---");
		manager.displayDuplicatePolicies(policyList);

		// Performance comparison
		Policy samplePolicy = new Policy(200, "Test User", LocalDate.now().plusDays(60), "Life", 9000);

		manager.comparePerformance(samplePolicy);
	}
}
