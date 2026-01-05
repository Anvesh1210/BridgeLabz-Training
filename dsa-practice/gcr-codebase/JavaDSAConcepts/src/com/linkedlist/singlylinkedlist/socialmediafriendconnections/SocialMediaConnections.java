package com.linkedlist.singlylinkedlist.socialmediafriendconnections;

import java.util.Scanner;

public class SocialMediaConnections {
	public static void main(String[] args) {
		
		//creating Scanner object
        Scanner sc = new Scanner(System.in);
        SocialNetwork sn = new SocialNetwork();
        int ch;

        do {
            System.out.println("\n1.Add User \n2.Add Friend \n3.Remove Friend");
            System.out.println("4.Mutual Friends \n5.Display Friends");
            System.out.println("6.Search ID \n7.Search Name");
            System.out.println("8.Count Friends \n0.Exit");

            ch = sc.nextInt();
            sc.nextLine();
            
            //doing operations according to choosen option
            switch (ch) {

                case 1:
                    sn.addUser(sc.nextInt(), sc.next(), sc.nextInt());
                    break;

                case 2:
                    sn.addFriend(sc.nextInt(), sc.nextInt());
                    break;

                case 3:
                    sn.removeFriend(sc.nextInt(), sc.nextInt());
                    break;

                case 4:
                    sn.mutualFriends(sc.nextInt(), sc.nextInt());
                    break;

                case 5:
                    sn.displayFriends(sc.nextInt());
                    break;

                case 6:
                    sn.searchById(sc.nextInt());
                    break;

                case 7:
                    sn.searchByName(sc.nextLine());
                    break;

                case 8:
                    sn.countFriends();
                    break;
            }

        } while (ch != 0);

        //closing Scanner object
        sc.close();
    }   
}
