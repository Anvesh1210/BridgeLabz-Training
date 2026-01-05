package com.linkedlist.singlylinkedlist.socialmediafriendconnections;

//class to represent a user node
public class UserNode {
	int userId;
    String name;
    int age;
    FriendNode friends;
    UserNode next;

    //constructor to initialize a user node
    UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friends = null;
        this.next = null;
    }
}
