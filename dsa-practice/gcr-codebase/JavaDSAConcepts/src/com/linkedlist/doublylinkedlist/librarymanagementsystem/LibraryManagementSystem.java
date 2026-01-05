package com.linkedlist.doublylinkedlist.librarymanagementsystem;

import java.util.Scanner;

public class LibraryManagementSystem {
	public static void main(String[] args) {

		//creating Scanner object
        Scanner sc = new Scanner(System.in);
        LibraryList lib = new LibraryList();
        int ch;

        do {
            System.out.println("\n1.Add Begin \n2.Add End \n3.Add Pos");
            System.out.println("4.Remove \n5.Search Title \n6.Search Author");
            System.out.println("7.Update Availability");
            System.out.println("8.Display Forward \n9.Display Reverse");
            System.out.println("10.Count Books 0.Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
            	//performing operations according to choice
                case 1:
                case 2:
                case 3:
                	//taking details
                    System.out.print("Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Title: ");
                    String t = sc.nextLine();
                    System.out.print("Author: ");
                    String a = sc.nextLine();
                    System.out.print("Genre: ");
                    String g = sc.nextLine();
                    System.out.print("Available (true/false): ");
                    boolean av = sc.nextBoolean();

                    if (ch == 1) lib.addAtBeginning(id, t, a, g, av);
                    else if (ch == 2) lib.addAtEnd(id, t, a, g, av);
                    else {
                        System.out.print("Position: ");
                        lib.addAtPosition(sc.nextInt(), id, t, a, g, av);
                    }
                    break;

                case 4:
                    lib.removeById(sc.nextInt());
                    break;

                case 5:
                    lib.searchByTitle(sc.nextLine());
                    break;

                case 6:
                    lib.searchByAuthor(sc.nextLine());
                    break;

                case 7:
                    lib.updateAvailability(sc.nextInt(), sc.nextBoolean());
                    break;

                case 8:
                    lib.displayForward();
                    break;

                case 9:
                    lib.displayReverse();
                    break;

                case 10:
                    System.out.println("Total Books: " + lib.countBooks());
                    break;
            }

        } while (ch != 0);

        //closing Scanner object
        sc.close();
    }
}
