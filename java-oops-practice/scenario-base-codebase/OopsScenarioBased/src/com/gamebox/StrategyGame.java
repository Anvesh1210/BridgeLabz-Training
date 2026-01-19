package com.gamebox;

//strategy game subclass
public class StrategyGame extends Game {

	// constructor for strategy game
	public StrategyGame(String title, double price) {
		super(title, "Strategy", price);
	}

	// method for downloading strategy game
	public void download() {
		System.out.println("Strategy Game " + title + " downloaded successfully");
	}

	// method for playing strategy demo
	public void playDemo() {
		System.out.println("Playing tactical strategy demo of " + title);
	}
}
