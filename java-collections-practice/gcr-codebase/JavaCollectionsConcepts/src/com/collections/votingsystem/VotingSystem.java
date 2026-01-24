package com.collections.votingsystem;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class VotingSystem {

	private Map<Candidate, Integer> voteMap = new HashMap<>();
	private Map<Candidate, Integer> voteOrderMap = new LinkedHashMap<>();

	// Cast vote
	public void castVote(Candidate candidate) {
		voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
		voteOrderMap.put(candidate, voteOrderMap.getOrDefault(candidate, 0) + 1);
	}

	// Display votes in insertion order
	public void displayVotesInInsertionOrder() {
		System.out.println("Votes in insertion order:");
		for (Map.Entry<Candidate, Integer> entry : voteOrderMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}

	// Display votes in sorted order using TreeMap
	public void displayVotesInSortedOrder() {
		TreeMap<String, Integer> sortedVotes = new TreeMap<>();
		for (Map.Entry<Candidate, Integer> entry : voteMap.entrySet()) {
			sortedVotes.put(entry.getKey().getName(), entry.getValue());
		}
		System.out.println("Votes in sorted order:");
		for (Map.Entry<String, Integer> entry : sortedVotes.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}
}
