package com.parceltracker;

//class implementing singly linked list for parcel tracking
public class ParcelChain {

	// attributes for ParcelChain
	private Stage head;

	// constructor for initializing chain
	public ParcelChain() {
		head = null;
	}

	// method for adding stage at end
	public void addStage(String stageName) {
		Stage newStage = new Stage(stageName);
		if (head == null) {
			head = newStage;
			return;
		}
		Stage temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newStage;
	}

	// method for inserting checkpoint after a stage
	public void insertAfter(String existing, String checkpoint) {
		Stage temp = head;
		while (temp != null && !temp.name.equals(existing)) {
			temp = temp.next;
		}
		if (temp == null) {
			System.out.println("Stage not found. Parcel might be lost.");
			return;
		}
		Stage newStage = new Stage(checkpoint);
		newStage.next = temp.next;
		temp.next = newStage;
	}

	// method for forward tracking of parcel
	public void trackParcel() {
		if (head == null) {
			System.out.println("Parcel has no tracking stages.");
			return;
		}
		Stage temp = head;
		while (temp != null) {
			System.out.print(temp.name);
			if (temp.next != null)
				System.out.print(" -> ");
			temp = temp.next;
		}

		System.out.println();
	}

	// method for handling lost parcel detection
	public void detectLoss() {
		if (head == null) {
			System.out.println("Parcel lost. No stages available.");
		}
	}
}
