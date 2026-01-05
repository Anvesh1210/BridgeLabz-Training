package com.linkedlist.singlylinkedlist.studentrecordmanagement;
import java.util.Scanner;

public class StudentRecordManagement {
	 public static void main(String[] args) {

		 //creating Scanner object
	     Scanner sc = new Scanner(System.in);
	     StudentLinkedList list = new StudentLinkedList();
	     int choice;
	     System.out.println("Welcome to student management system:");
	     do {
	         System.out.println("\n1.Add Begin \n2.Add End \n3.Add Pos");
	         System.out.println("4.Delete  \n5.Search  \n6.Update Grade");
	         System.out.println("7.Display  \n0.Exit");
	         System.out.print("Enter choice: ");
	         choice = sc.nextInt();
             switch (choice) {
            	
                case 1:
                case 2:
                case 3:
                	//taking user input
                    System.out.print("Roll: ");
                    int r = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String n = sc.nextLine();
                    System.out.print("Age: ");
                    int a = sc.nextInt();
                    System.out.print("Grade: ");
                    char g = sc.next().charAt(0);
                    if (choice == 1)
                        list.addAtBeginning(r, n, a, g);
                    else if (choice == 2)
                        list.addAtEnd(r, n, a, g);
                    else {
                        System.out.print("Position: ");
                        int p = sc.nextInt();
                        list.addAtPosition(p, r, n, a, g);
                    }
                    break;

                    //logic to delete student by roll number
               case 4:
                    System.out.print("Roll to delete: ");
                    list.deleteByRollNo(sc.nextInt());
                    break;
                    
                    //searching a student
                case 5:
                    System.out.print("Roll to search: ");
                    list.searchByRollNo(sc.nextInt());
                    break;
                    
                    //updating grade of student
                case 6:
                    System.out.print("Roll: ");
                    int roll = sc.nextInt();
                    System.out.print("New Grade: ");
                    char grade = sc.next().charAt(0);
                    list.updateGrade(roll, grade);
                    break;

                    //displaying student records
                case 7:
                    list.displayAll();
                    break;
            }
        } while (choice != 0);

       //closing the Scanner
        sc.close();
     }
}
