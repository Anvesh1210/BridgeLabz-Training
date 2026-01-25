package com.sorting.gamerzone;

public class GamerZoneDriver {
	public static void main(String[] args) {
		// creating Game zone manager
		GamerZoneManager manager = new GamerZoneManager();
		// adding players
		manager.addPlayer(new Player("Anvesh", 980));
		manager.addPlayer(new Player("Riya", 1120));
		manager.addPlayer(new Player("Kunal", 870));
		manager.addPlayer(new Player("Meera", 1040));
		manager.addPlayer(new Player("Soham", 990));
		System.out.println("Leaderboard Before Sorting:");
		manager.displayLeaderboard();
		manager.quickSort();
		System.out.println("\nLeaderboard After Sorting (High to Low Score):");
		manager.displayLeaderboard();
	}
}
