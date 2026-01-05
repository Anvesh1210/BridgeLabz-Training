package com.linkedlist.circularlinkedlist.taskscheduler;

import java.util.Scanner;
public class CircularTaskScheduler {
	 public static void main(String[] args) {
		 
		 //creating Scanner object
		 Scanner sc = new Scanner(System.in);
	     TaskScheduler scheduler = new TaskScheduler();
	     int choice;
	     
	     System.out.println("Welcome to Task Scheduler!!!");
	     do {
	     	//Asking user which operation he/she wants to perform
	        System.out.println("\n1.Add Begin");
	        System.out.println("2.Add End");
	        System.out.println("3.Remove");
	        System.out.println("4.Search");
	        System.out.println("5.Display");
	        System.out.println("6.Execute Tasks");
	        System.out.println("0.Exit");

	        choice = sc.nextInt();

	        //doing operations according to chosen option
	        switch (choice) {
               case 1:
               case 2:
            	   System.out.print("Task ID: ");
	               int id = sc.nextInt();
	               sc.nextLine();
	               System.out.print("Task Name: ");
	               String name = sc.nextLine();
	               System.out.print("Priority: ");
	               int p = sc.nextInt();

	               if (choice == 1)
	                    scheduler.addAtBeginning(id, name, p);
	               else
	                    scheduler.addAtEnd(id, name, p);
	               		break;

	            case 3:
	            	System.out.print("Task ID to remove: ");
	            	scheduler.removeById(sc.nextInt());
	                break;

	            case 4:
	                System.out.print("Task ID to search: ");
	                scheduler.searchById(sc.nextInt());
	                break;

	            case 5:
	                scheduler.displayAll();
	                break;

	            case 6:
	                System.out.print("Enter number of cycles: ");
	                scheduler.executeTasks(sc.nextInt());
	                break;
	       }

        } while (choice != 0);

        //closing Scanner object;
        sc.close();
      }
}
