package com.birdsanctuary;

import java.util.*;

//class managing sanctuary operations
public class SanctuaryManager {

	// attributes for SanctuaryManager
	private List<Bird> birds = new ArrayList<>();

	// method for adding bird
	public void addBird(Bird b) {
		birds.add(b);
	}

	// method for removing bird by id
	public void removeBird(String id) {
		birds.removeIf(b -> b.getId().equals(id));
	}

	// method for displaying all birds
	public void displayAll() {
		for (Bird b : birds) {
			System.out.println(b.getId() + " | " + b.getName() + " | " + b.getSpecies());
		}
	}

	// method for displaying flyable birds
	public void showFlyable() {
		for (Bird b : birds) {
			if (b instanceof Flyable) {
				System.out.println(b.getName());
			}
		}
	}

	// method for displaying swimmable birds
	public void showSwimmable() {
		for (Bird b : birds) {
			if (b instanceof Swimmable) {
				System.out.println(b.getName());
			}
		}
	}

	// method for displaying birds with both abilities
	public void showBoth() {
		for (Bird b : birds) {
			if (b instanceof Flyable && b instanceof Swimmable) {
				System.out.println(b.getName());
			}
		}
	}

	// method for sanctuary ability report
	public void report() {
		int fly = 0, swim = 0, both = 0, neither = 0;

		for (Bird b : birds) {
			boolean f = b instanceof Flyable;
			boolean s = b instanceof Swimmable;

			if (f && s)
				both++;
			else if (f)
				fly++;
			else if (s)
				swim++;
			else
				neither++;
		}

		System.out.println("Flyable: " + fly);
		System.out.println("Swimmable: " + swim);
		System.out.println("Both: " + both);
		System.out.println("Neither: " + neither);
	}
}
