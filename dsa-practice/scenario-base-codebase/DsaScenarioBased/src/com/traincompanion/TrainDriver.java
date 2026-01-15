package com.traincompanion;

public class TrainDriver {
	public static void main(String[] args) {
		Compartment c1 = new Compartment(1, "pantry");
		Compartment c2 = new Compartment(2, "WiFi");
		Compartment c3 = new Compartment(3, "First AC");
		Compartment c4 = new Compartment(4, "Second AC");
		Compartment c5 = new Compartment(5, "Third AC ");
		Compartment c6 = new Compartment(6, "Sleeper ");
		Compartment c7 = new Compartment(6, "General ");
		
		//creating train
		Train train = new Train();
		train.addCompartment(c1);
		train.addCompartment(c2);
		train.addCompartment(c3);
		train.addCompartment(c4);
		train.addCompartment(c5);
		train.addCompartment(c6);
		train.addCompartment(c7);
		
		train.walkToCompartment();
		train.goToNextCompartment();
		train.goToNextCompartment();
		train.goToNextCompartment();
		train.goToPreviousCompartment();
		
	}
}
