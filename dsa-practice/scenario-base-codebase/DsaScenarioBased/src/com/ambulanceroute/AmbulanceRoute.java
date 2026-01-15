package com.ambulanceroute;

//class to represent Ambulance Route
public class AmbulanceRoute {
	private HospitalUnit head;

	// method to add unit to circular list
	public void addUnit(String name, boolean available) {
		HospitalUnit newUnit = new HospitalUnit(name, available);

		if (head == null) {
			head = newUnit;
			newUnit.next = head;
			return;
		}

		HospitalUnit temp = head;
		while (temp.next != head) {
			temp = temp.next;
		}

		temp.next = newUnit;
		newUnit.next = head;
	}

	// method to find nearest available unit
	public void findAvailableUnit() {
		if (head == null) {
			System.out.println("No hospital units available.");
			return;
		}

		HospitalUnit current = head;
		do {
			if (current.available) {
				System.out.println("Redirect patient to: " + current.unitName);
				return;
			}
			current = current.next;
		} while (current != head);

		System.out.println("No units currently available.");
	}

	// method to remove unit under maintenance
	public void removeUnit(String name) {
		if (head == null) {
			System.out.println("No units to remove.");
			return;
		}

		HospitalUnit current = head;
		HospitalUnit previous = null;

		do {
			if (current.unitName.equals(name)) {

				// Single node case
				if (current == head && current.next == head) {
					head = null;
				}
				// Removing head
				else if (current == head) {
					HospitalUnit last = head;
					while (last.next != head) {
						last = last.next;
					}
					head = head.next;
					last.next = head;
				}
				// Removing middle or last
				else {
					previous.next = current.next;
				}

				System.out.println("Unit removed (maintenance): " + name);
				return;
			}

			previous = current;
			current = current.next;

		} while (current != head);

		System.out.println("Unit not found.");
	}

	// method to display circular route
	public void displayRoute() {
		if (head == null) {
			System.out.println("Route is empty.");
			return;
		}

		HospitalUnit temp = head;
		System.out.print("Hospital Route: ");
		do {
			System.out.print(temp.unitName + " -> ");
			temp = temp.next;
		} while (temp != head);
		System.out.println("(Back to Emergency)");
	}
}
