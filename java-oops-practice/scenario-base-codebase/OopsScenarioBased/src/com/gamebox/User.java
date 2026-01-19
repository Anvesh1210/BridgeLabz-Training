package com.gamebox;

import java.util.*;

//class for platform users
public class User {

	// attributes for User
	private String name;
	private List<Game> ownedGames;

	// constructor for user
	public User(String name) {
		this.name = name;
		ownedGames = new ArrayList<>();
	}

	// method for purchasing game
	public void buyGame(Game game, double discount) {
		double finalPrice = game.applyDiscount(discount);
		ownedGames.add(game);
		System.out.println(name + " purchased " + game.title + " for ₹" + finalPrice);
	}

	// method for listing owned games
	public void showLibrary() {
		System.out.println("Owned games by " + name);
		for (Game g : ownedGames) {
			System.out.println(g.title + " - " + g.genre);
		}
	}
}
