package com.browserbuddy;

public class Tab {
	//pointer to current page
	private HistoryNode current; 

	//method to visit a new page
	public void visit(String url) {
		HistoryNode newNode = new HistoryNode(url);

		if (current != null) {
			current.next = newNode;
			newNode.prev = current;
		}

		current = newNode;
		System.out.println("Visited: " + url);
	}

	//method to go back
	public void back() {
		if (current != null && current.prev != null) {
			current = current.prev;
			System.out.println("Back to: " + current.url);
		} else {
			System.out.println("No previous page.");
		}
	}

	//method to go forward
	public void forward() {
		if (current != null && current.next != null) {
			current = current.next;
			System.out.println("Forward to: " + current.url);
		} else {
			System.out.println("No next page.");
		}
	}

	//getter method to get current page 
	public String getCurrentPage() {
		if (current == null) {
			return "Empty Tab";
		}
		return current.url;
	}
}
