package com.browserbuddy;

//class to represent History Node
public class HistoryNode {
	String url;
	HistoryNode prev;
	HistoryNode next;

	//Constructor to initialize URL
	public HistoryNode(String url) {
		this.url = url;
		this.prev = null;
		this.next = null;
	}
}
