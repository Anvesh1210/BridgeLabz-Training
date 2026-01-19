package com.birdsanctuary;

import java.util.*;

//main class for CLI interaction
public class BirdSanctuaryApp {

	// method for main execution
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		SanctuaryManager manager = new SanctuaryManager();

		while (true) {

			System.out.println("\nWelcome to EcoWing Bird Sanctuary");
			System.out.println("1. Add Bird");
			System.out.println("2. Display All Birds");
			System.out.println("3. Display Flying Birds");
			System.out.println("4. Display Swimming Birds");
			System.out.println("5. Display Both");
			System.out.println("6. Delete Bird");
			System.out.println("7. Sanctuary Report");
			System.out.println("8. Exit");

			int ch = sc.nextInt();
			sc.nextLine();

			switch (ch) {

			case 1:
				System.out.println("Enter Bird Type (Eagle/Duck/Penguin/Kiwi)");
				String type = sc.nextLine();
				System.out.println("Enter Name");
				String name = sc.nextLine();
				System.out.println("Enter ID");
				String id = sc.nextLine();

				if (type.equalsIgnoreCase("Eagle"))
					manager.addBird(new Eagle(name, id));
				else if (type.equalsIgnoreCase("Duck"))
					manager.addBird(new Duck(name, id));
				else if (type.equalsIgnoreCase("Penguin"))
					manager.addBird(new Penguin(name, id));
				else
					manager.addBird(new Kiwi(name, id));
				break;

			case 2:
				manager.displayAll();
				break;

			case 3:
				manager.showFlyable();
				break;

			case 4:
				manager.showSwimmable();
				break;

			case 5:
				manager.showBoth();
				break;

			case 6:
				System.out.println("Enter ID to delete");
				manager.removeBird(sc.nextLine());
				break;

			case 7:
				manager.report();
				break;

			case 8:
				System.exit(0);
			}
		}
	}
}
