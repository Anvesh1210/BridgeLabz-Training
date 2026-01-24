package com.collections.insurancepolicymanagementsystem2;

import java.time.LocalDate;
import java.util.*;

//InsurancePolicyManager to manager operations on policy
public class InsurancePolicyManager {
	private Map<String, Policy> policyMap = new HashMap<>();
	private Map<String, Policy> insertionOrderMap = new LinkedHashMap<>();
	private TreeMap<LocalDate, List<Policy>> expiryDateMap = new TreeMap<>();

	// method to add a policy
	public void addPolicy(Policy policy) {
		policyMap.put(policy.getPolicyNumber(), policy);
		insertionOrderMap.put(policy.getPolicyNumber(), policy);
		expiryDateMap.computeIfAbsent(policy.getExpiryDate(), k -> new ArrayList<>()).add(policy);
	}

	// method to get policy by policy number
	public Policy getPolicyByNumber(String policyNumber) {
		return policyMap.get(policyNumber);
	}

	// method to get all policies which is expire within 30 days
	public List<Policy> getPoliciesExpiringInNext30Days() {
		LocalDate today = LocalDate.now();
		LocalDate next30Days = today.plusDays(30);

		List<Policy> result = new ArrayList<>();

		expiryDateMap.subMap(today, true, next30Days, true).values().forEach(result::addAll);

		return result;
	}

	// method to get all policies by policy holder name
	public List<Policy> getPoliciesByPolicyHolder(String holderName) {
		List<Policy> result = new ArrayList<>();

		for (Policy policy : policyMap.values()) {
			if (policy.getPolicyHolderName().equalsIgnoreCase(holderName)) {
				result.add(policy);
			}
		}
		return result;
	}

	// method to remove expired policies
	public void removeExpiredPolicies() {
		LocalDate today = LocalDate.now();

		Iterator<Map.Entry<String, Policy>> iterator = policyMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Policy> entry = iterator.next();
			if (entry.getValue().getExpiryDate().isBefore(today)) {

				Policy policy = entry.getValue();

				iterator.remove(); // remove from HashMap
				insertionOrderMap.remove(policy.getPolicyNumber());

				List<Policy> list = expiryDateMap.get(policy.getExpiryDate());
				list.remove(policy);
				if (list.isEmpty()) {
					expiryDateMap.remove(policy.getExpiryDate());
				}
			}
		}
	}

	// method to display policies in insertion order
	public void displayPoliciesInInsertionOrder() {
		insertionOrderMap.values().forEach(System.out::println);
	}
}
