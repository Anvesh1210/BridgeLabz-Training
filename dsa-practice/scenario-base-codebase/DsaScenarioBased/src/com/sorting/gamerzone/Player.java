package com.sorting.gamerzone;

//class to represent a player
public class Player {
	// player attributes
	private String playerName;
	private int score;

	// constructor to initialize player details
	public Player(String playerName, int score) {
		this.playerName = playerName;
		this.score = score;
	}

	// getter and setter for player
	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	// method for displaying player details
	public void display() {
		System.out.println("\nPlayer: " + playerName);
		System.out.println("Score: " + score);
	}
}
