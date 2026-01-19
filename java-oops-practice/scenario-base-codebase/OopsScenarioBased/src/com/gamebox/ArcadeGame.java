package com.gamebox;

//arcade game subclass
public class ArcadeGame extends Game {

	// constructor for arcade game
	public ArcadeGame(String title, double price) {
		super(title, "Arcade", price);
	}

	// method for downloading arcade game
	public void download() {
		System.out.println("Arcade Game " + title + " downloaded successfully");
	}

	// method for playing arcade demo
	public void playDemo() {
		System.out.println("Playing fast-paced arcade demo of " + title);
	}
}
