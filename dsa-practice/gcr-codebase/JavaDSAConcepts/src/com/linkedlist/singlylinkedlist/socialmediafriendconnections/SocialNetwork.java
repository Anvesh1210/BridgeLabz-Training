package com.linkedlist.singlylinkedlist.socialmediafriendconnections;

public class SocialNetwork {
	private UserNode head;

    //method to add new user
    public void addUser(int id, String name, int age) {
        UserNode u = new UserNode(id, name, age);
        u.next = head;
        head = u;
    }

    //method to add friend connection (both users)
    public void addFriend(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);

        if (u1 == null || u2 == null) return;

        u1.friends = addFriendNode(u1.friends, id2);
        u2.friends = addFriendNode(u2.friends, id1);
    }

    private FriendNode addFriendNode(FriendNode head, int id) {
        FriendNode f = new FriendNode(id);
        f.next = head;
        return f;
    }

    //method to remove friend connection
    public void removeFriend(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);

        if (u1 == null || u2 == null) return;

        u1.friends = removeFriendNode(u1.friends, id2);
        u2.friends = removeFriendNode(u2.friends, id1);
    }

    private FriendNode removeFriendNode(FriendNode head, int id) {
        if (head == null) return null;

        if (head.friendId == id)
            return head.next;

        FriendNode t = head;
        while (t.next != null && t.next.friendId != id)
            t = t.next;

        if (t.next != null)
            t.next = t.next.next;

        return head;
    }

    //method to find mutual friends
    public void mutualFriends(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);

        if (u1 == null || u2 == null) return;

        FriendNode f1 = u1.friends;
        System.out.print("Mutual Friends: ");

        while (f1 != null) {
            if (isFriend(u2.friends, f1.friendId))
                System.out.print(f1.friendId + " ");
            f1 = f1.next;
        }
        System.out.println();
    }

    private boolean isFriend(FriendNode head, int id) {
        while (head != null) {
            if (head.friendId == id)
                return true;
            head = head.next;
        }
        return false;
    }

    //method to display friends of a user
    public void displayFriends(int id) {
        UserNode u = findUserById(id);
        if (u == null) return;

        System.out.print("Friends of " + u.name + ": ");
        FriendNode f = u.friends;
        while (f != null) {
            System.out.print(f.friendId + " ");
            f = f.next;
        }
        System.out.println();
    }

    //method to search user by ID
    public void searchById(int id) {
        UserNode u = findUserById(id);
        if (u != null)
            displayUser(u);
        else
            System.out.println("User not found");
    }

    //method to search user by name
    public void searchByName(String name) {
        UserNode t = head;
        while (t != null) {
            if (t.name.equalsIgnoreCase(name))
                displayUser(t);
            t = t.next;
        }
    }

    //method to count friends for each user
    public void countFriends() {
        UserNode t = head;
        while (t != null) {
            int count = 0;
            FriendNode f = t.friends;
            while (f != null) {
                count++;
                f = f.next;
            }
            System.out.println(t.name + " has " + count + " friends");
            t = t.next;
        }
    }

    private UserNode findUserById(int id) {
        UserNode t = head;
        while (t != null) {
            if (t.userId == id)
                return t;
            t = t.next;
        }
        return null;
    }

    private void displayUser(UserNode u) {
        System.out.println(
            "ID: " + u.userId +
            ", Name: " + u.name +
            ", Age: " + u.age
        );
    }
}
