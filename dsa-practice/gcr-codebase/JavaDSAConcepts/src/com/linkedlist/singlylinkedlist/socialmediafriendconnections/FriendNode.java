package com.linkedlist.singlylinkedlist.socialmediafriendconnections;

//class to represent a friend node
public class FriendNode {
	int friendId;
    FriendNode next;

    //constructor to initialize a friend node
    FriendNode(int friendId) {
        this.friendId = friendId;
        this.next = null;
    }
}
