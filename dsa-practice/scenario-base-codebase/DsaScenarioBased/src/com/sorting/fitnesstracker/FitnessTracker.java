package com.sorting.fitnesstracker;

import java.util.ArrayList;

//class to represent Fitness Tracker
public class FitnessTracker {
	private ArrayList<User> users = new ArrayList<>();

	// method to add a user
	public void addUser(User user) {
		users.add(user);
	}

	// method for sorting users using bubble sort
	public void bubbleSort() {
		int n = users.size();

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (users.get(j).getSteps() < users.get(j + 1).getSteps()) {
					User temp = users.get(j);
					users.set(j, users.get(j + 1));
					users.set(j + 1, temp);
				}
			}
		}
	}

	// method for displaying leaderboard
	public void displayLeaderboard() {
		for (User u : users) {
			u.display();
		}
	}
}
