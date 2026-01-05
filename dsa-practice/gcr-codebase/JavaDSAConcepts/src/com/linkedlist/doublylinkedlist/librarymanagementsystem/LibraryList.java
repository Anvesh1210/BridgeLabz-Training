package com.linkedlist.doublylinkedlist.librarymanagementsystem;

public class LibraryList {
	 private BookNode head;
	    private BookNode tail;

	    //method to add at beginning
	    void addAtBeginning(int id, String title, String author, String genre, boolean available) {
	        BookNode n = new BookNode(id, title, author, genre, available);

	        if (head == null) {
	            head = tail = n;
	            return;
	        }

	        n.next = head;
	        head.prev = n;
	        head = n;
	    }

	    //method to add at end
	    void addAtEnd(int id, String title, String author, String genre, boolean available) {
	        BookNode n = new BookNode(id, title, author, genre, available);

	        if (tail == null) {
	            head = tail = n;
	            return;
	        }

	        tail.next = n;
	        n.prev = tail;
	        tail = n;
	    }

	    //method to add at position (1-based)
	    void addAtPosition(int pos, int id, String title, String author, String genre, boolean available) {

	        if (pos <= 0) return;

	        if (pos == 1) {
	            addAtBeginning(id, title, author, genre, available);
	            return;
	        }

	        BookNode t = head;
	        for (int i = 1; i < pos - 1 && t != null; i++)
	            t = t.next;

	        if (t == null || t == tail) {
	            addAtEnd(id, title, author, genre, available);
	            return;
	        }

	        BookNode n = new BookNode(id, title, author, genre, available);
	        n.next = t.next;
	        n.prev = t;
	        t.next.prev = n;
	        t.next = n;
	    }

	    //method to remove by Book ID
	    void removeById(int id) {

	        BookNode t = head;

	        while (t != null) {
	            if (t.bookId == id) {

	                if (t == head)
	                    head = head.next;

	                if (t == tail)
	                    tail = tail.prev;

	                if (t.prev != null)
	                    t.prev.next = t.next;

	                if (t.next != null)
	                    t.next.prev = t.prev;

	                return;
	            }
	            t = t.next;
	        }
	    }

	    //method to search by title
	    void searchByTitle(String title) {
	        BookNode t = head;
	        while (t != null) {
	            if (t.title.equalsIgnoreCase(title))
	                displayBook(t);
	            t = t.next;
	        }
	    }

	    //method to search by author
	    void searchByAuthor(String author) {
	        BookNode t = head;
	        while (t != null) {
	            if (t.author.equalsIgnoreCase(author))
	                displayBook(t);
	            t = t.next;
	        }
	    }

	    //method to update availability
	    void updateAvailability(int id, boolean status) {
	        BookNode t = head;
	        while (t != null) {
	            if (t.bookId == id) {
	                t.available = status;
	                return;
	            }
	            t = t.next;
	        }
	    }

	    //method to display forward
	    void displayForward() {
	        BookNode t = head;
	        while (t != null) {
	            displayBook(t);
	            t = t.next;
	        }
	    }

	    //method to display reverse
	    void displayReverse() {
	        BookNode t = tail;
	        while (t != null) {
	            displayBook(t);
	            t = t.prev;
	        }
	    }

	    //method to count books
	    int countBooks() {
	        int count = 0;
	        BookNode t = head;
	        while (t != null) {
	            count++;
	            t = t.next;
	        }
	        return count;
	    }

	    private void displayBook(BookNode b) {
	        System.out.println("ID: " + b.bookId +", Title: " + b.title +", Author: " + b.author +
	            ", Genre: " + b.genre +
	            ", Available: " + (b.available ? "Yes" : "No")
	        );
	    }
}
