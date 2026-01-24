package com.collections.votingsystem;

public class VotingSystemDriver {
	public static void main(String[] args) {
		VotingSystem votingSystem = new VotingSystem();
		Candidate c1 = new Candidate("Alice");
		Candidate c2 = new Candidate("Bob");
		Candidate c3 = new Candidate("Charlie");
		votingSystem.castVote(c1);
		votingSystem.castVote(c2);
		votingSystem.castVote(c1);
		votingSystem.castVote(c3);
		votingSystem.castVote(c2);
		System.out.println();
		votingSystem.displayVotesInInsertionOrder();
		System.out.println();
		votingSystem.displayVotesInSortedOrder();
	}
}
