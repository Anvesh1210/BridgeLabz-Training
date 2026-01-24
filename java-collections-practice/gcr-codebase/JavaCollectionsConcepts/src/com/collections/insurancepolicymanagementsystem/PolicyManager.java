package com.collections.insurancepolicymanagementsystem;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PolicyManager {
	Set<Policy> hashSet;
	Set<Policy> linkedHashSet;
	Set<Policy> treeSet;

	public PolicyManager() {
		hashSet = new HashSet<Policy>();
		linkedHashSet = new LinkedHashSet<Policy>();
		treeSet = new TreeSet<Policy>();
	}

	public void addPolicy(Policy policy) {
		hashSet.add(policy);
		linkedHashSet.add(policy);
		treeSet.add(policy);
	}

	public void displayAllUniquePolicy() {
		for (Policy policy : hashSet) {
			System.out.println(policy);
		}
	}

	public void displayExpiringSoon() {
		for (Policy policy : hashSet) {
			if (LocalDate.now().plusDays(30).compareTo(policy.getExpiryDate()) >= 0) {
				System.out.println(policy);
			}
		}
	}

	public void displaySpecificCoverageTypePolicies(String covergaeType) {
		for (Policy policy : hashSet) {
			if (policy.getCoverageType().equals(covergaeType)) {
				System.out.println(policy);
			}
		}
	}

	public void displayDuplicatePolicies(List<Policy> policies) {
	    Set<Integer> seen = new HashSet<>();
	    Set<Integer> duplicates = new HashSet<>();

	    for (Policy policy : policies) {
	        if (!seen.add(policy.getPolicyNumber())) {
	            duplicates.add(policy.getPolicyNumber());
	        }
	    }

	    for (Policy policy : policies) {
	        if (duplicates.contains(policy.getPolicyNumber())) {
	            System.out.println(policy);
	        }
	    }
	}


	public void comparePerformance(Policy samplePolicy) {
		System.out.println("\n--- Performance Comparison ---");

		measureTime("HashSet Add", () -> hashSet.add(samplePolicy));
		measureTime("LinkedHashSet Add", () -> linkedHashSet.add(samplePolicy));
		measureTime("TreeSet Add", () -> treeSet.add(samplePolicy));

		measureTime("HashSet Search", () -> hashSet.contains(samplePolicy));
		measureTime("LinkedHashSet Search", () -> linkedHashSet.contains(samplePolicy));
		measureTime("TreeSet Search", () -> treeSet.contains(samplePolicy));

		measureTime("HashSet Remove", () -> hashSet.remove(samplePolicy));
		measureTime("LinkedHashSet Remove", () -> linkedHashSet.remove(samplePolicy));
		measureTime("TreeSet Remove", () -> treeSet.remove(samplePolicy));
	}

	private void measureTime(String operation, Runnable task) {
		long start = System.nanoTime();
		task.run();
		long end = System.nanoTime();
		System.out.println(operation + " : " + (end - start) + " ns");
	}
}
