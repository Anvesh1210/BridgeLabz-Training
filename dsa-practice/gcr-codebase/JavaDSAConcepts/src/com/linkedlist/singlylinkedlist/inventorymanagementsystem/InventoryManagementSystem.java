package com.linkedlist.singlylinkedlist.inventorymanagementsystem;

import java.util.Scanner;

public class InventoryManagementSystem {
	public static void main(String[] args) {

		//creating Scanner object
        Scanner sc = new Scanner(System.in);
        InventoryList inv = new InventoryList();
        int ch;

        do {
        	//asking user which operation he/she wants to perform
            System.out.println("\n1.Add Begin \n2.Add End \n3.Add Pos");
            System.out.println("4.Remove \n5.Update Qty \n6.Search ID");
            System.out.println("7.Search Name \n8.Total Value");
            System.out.println("9.Sort Name \n10.Sort Price 11.Display");
            System.out.println("0.Exit");
            
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            sc.nextLine();
            
            //performing operation according to choice selected
            switch (ch) {

                case 1:
                case 2:
                case 3:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String n = sc.nextLine();
                    System.out.print("Qty: ");
                    int q = sc.nextInt();
                    System.out.print("Price: ");
                    double p = sc.nextDouble();

                    if (ch == 1) inv.addAtBeginning(id, n, q, p);
                    else if (ch == 2) inv.addAtEnd(id, n, q, p);
                    else {
                        System.out.print("Position: ");
                        inv.addAtPosition(sc.nextInt(), id, n, q, p);
                    }
                    break;

                case 4:
                    inv.removeById(sc.nextInt());
                    break;

                case 5:
                    inv.updateQuantity(sc.nextInt(), sc.nextInt());
                    break;

                case 6:
                    inv.searchById(sc.nextInt());
                    break;

                case 7:
                    inv.searchByName(sc.nextLine());
                    break;

                case 8:
                    inv.totalInventoryValue();
                    break;

                case 9:
                    inv.sortByName(true);
                    break;

                case 10:
                    inv.sortByPrice(true);
                    break;

                case 11:
                    inv.displayAll();
                    break;
            }

        } while (ch != 0);

        //closing the Scanner
        sc.close();
    }
}
