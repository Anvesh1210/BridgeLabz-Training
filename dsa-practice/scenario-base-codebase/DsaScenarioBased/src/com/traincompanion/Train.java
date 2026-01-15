package com.traincompanion;

public class Train {

	private Compartment head;
	private Compartment tail;
	private Compartment userCompartment;

	public Train() {
		head = null;
		tail = null;
		userCompartment = null;
	}

	// Insert compartment at end
	public void addCompartment(Compartment compartment) {
		if (head == null) {
			head = tail = compartment;
		} else {
			tail.setNext(compartment);
			compartment.setPrev(tail);
			tail = compartment;
		}
		System.out.println(compartment.getCompartmentName()+" compartment Added to train");
	}

	// Remove compartment by number
	public void removeCompartment(int compartmentNo) {
		if (head == null) {
			System.out.println("Train has no compartments.");
			return;
		}

		Compartment temp = head;

		while (temp != null) {
			if (temp.getCompartmentNo() == compartmentNo) {

				if (temp == head) {
					head = head.getNext();
					if (head != null)
						head.setPrev(null);
				} else if (temp == tail) {
					tail = tail.getPrev();
					if (tail != null)
						tail.setNext(null);
				} else {
					temp.getPrev().setNext(temp.getNext());
					temp.getNext().setPrev(temp.getPrev());
				}

				System.out.println("Compartment " + compartmentNo + " removed.");
				return;
			}
			temp = temp.getNext();
		}

		System.out.println("Compartment not found.");
	}

	// Start walking from first compartment
	public void walkToCompartment() {
		if (head == null) {
			System.out.println("No compartments in train.");
			return;
		}

		userCompartment = head;
		displayCurrentAndAdjacent();
		System.out.println("-----------------------------------------------");
	}

	// Move forward
	public void goToNextCompartment() {
		if (userCompartment != null && userCompartment.getNext() != null) {
			userCompartment = userCompartment.getNext();
			displayCurrentAndAdjacent();
		} else {
			System.out.println("No next compartment available.");
		}
		System.out.println("-------------------------------------------------");
	}

	// Move backward
	public void goToPreviousCompartment() {
		if (userCompartment != null && userCompartment.getPrev() != null) {
			userCompartment = userCompartment.getPrev();
			displayCurrentAndAdjacent();
		} else {
			System.out.println("No previous compartment available.");
		}
		System.out.println("-------------------------------------------------");
	}

	// Display current + adjacent compartments
	private void displayCurrentAndAdjacent() {
		System.out.println("\nCurrent Compartment:");
		userCompartment.displayCompartment();

		System.out.println("\nNext Compartment:");
		if (userCompartment.getNext() != null)
			userCompartment.getNext().displayCompartment();
		else
			System.out.println("None");

		System.out.println("\nPrevious Compartment:");
		if (userCompartment.getPrev() != null)
			userCompartment.getPrev().displayCompartment();
		else
			System.out.println("None");
	}

	// Traverse forward
	public void traverseForward() {
		Compartment temp = head;
		System.out.println("\nTrain Forward Traversal:");
		while (temp != null) {
			temp.displayCompartment();
			System.out.println("------");
			temp = temp.getNext();
		}
	}

	// traverse backward
	public void traverseBackward() {
		Compartment temp = tail;
		System.out.println("\nTrain Backward Traversal:");
		while (temp != null) {
			temp.displayCompartment();
			System.out.println("------");
			temp = temp.getPrev();
		}
	}
}
