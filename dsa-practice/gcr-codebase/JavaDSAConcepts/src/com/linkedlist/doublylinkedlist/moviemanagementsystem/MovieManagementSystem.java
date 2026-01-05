package com.linkedlist.doublylinkedlist.moviemanagementsystem;

import java.util.Scanner;

public class MovieManagementSystem {
	public static void main(String[] args) {
		//creating Scanner object
        Scanner sc = new Scanner(System.in);
        MovieDoublyLinkedList list = new MovieDoublyLinkedList();
        int choice;

        do {
        	//taking user what operation he/she wants to perform
            System.out.println("\n1.Add Begin ");
            System.out.println("2.Add End ");
            System.out.println("3.Add Pos");
            System.out.println("4.Remove  ");
            System.out.println("5.Search Director ");
            System.out.println("6.Search Rating");
            System.out.println("7.Display Forward ");
            System.out.println("8.Display Reverse");
            System.out.println("9.Update Rating ");
            System.out.println("0.Exit");

            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            //calling method according to chosen option
            switch (choice) {

                case 1:
                case 2:
                case 3:
                    System.out.print("Title: ");
                    String t = sc.nextLine();
                    System.out.print("Director: ");
                    String d = sc.nextLine();
                    System.out.print("Year: ");
                    int y = sc.nextInt();
                    System.out.print("Rating: ");
                    double r = sc.nextDouble();

                    if (choice == 1)
                        list.addAtBeginning(t, d, y, r);
                    else if (choice == 2)
                        list.addAtEnd(t, d, y, r);
                    else {
                        System.out.print("Position: ");
                        int p = sc.nextInt();
                        list.addAtPosition(p, t, d, y, r);
                    }
                    break;

                case 4:
                    System.out.print("Title to remove: ");
                    list.removeByTitle(sc.nextLine());
                    break;

                case 5:
                    System.out.print("Director: ");
                    list.searchByDirector(sc.nextLine());
                    break;

                case 6:
                    System.out.print("Rating: ");
                    list.searchByRating(sc.nextDouble());
                    break;

                case 7:
                    list.displayForward();
                    break;

                case 8:
                    list.displayReverse();
                    break;

                case 9:
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("New Rating: ");
                    double nr = sc.nextDouble();
                    list.updateRating(title, nr);
                    break;
            }

        } while (choice != 0);

        //closing Scanner object
        sc.close();
    }
}
