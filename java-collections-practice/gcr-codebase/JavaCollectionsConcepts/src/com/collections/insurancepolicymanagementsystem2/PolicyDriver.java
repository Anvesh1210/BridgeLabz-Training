package com.collections.insurancepolicymanagementsystem2;

import java.time.LocalDate;

public class PolicyDriver {
	public static void main(String[] args) {
		
		//creating object of InsurancePolicyManager and adding policies in it
		InsurancePolicyManager manager = new InsurancePolicyManager();
		manager.addPolicy(new Policy("POL1001", "Anvesh", LocalDate.now().plusDays(20), 5000));
		manager.addPolicy(new Policy("POL1002", "Rahul", LocalDate.now().plusDays(45), 7000));
		manager.addPolicy(new Policy("POL1003", "Anvesh", LocalDate.now().minusDays(5), 4000));

		//performing operations
		System.out.println("Policy by Number:");
		System.out.println(manager.getPolicyByNumber("POL1001"));

		System.out.println("\nPolicies expiring in next 30 days:");
		manager.getPoliciesExpiringInNext30Days().forEach(System.out::println);

		System.out.println("\nPolicies for Anvesh:");
		manager.getPoliciesByPolicyHolder("Anvesh").forEach(System.out::println);

		System.out.println("\nRemoving expired policies...");
		manager.removeExpiredPolicies();

		System.out.println("\nPolicies in insertion order:");
		manager.displayPoliciesInInsertionOrder();
	}
}
