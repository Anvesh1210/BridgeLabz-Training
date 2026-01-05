package com.linkedlist.doublylinkedlist.undoredotexteditor;

//class to represent a Text node
public class TextNode {
	//text attributes
	String text;
    TextNode prev, next;

    //constructor to initialize text attributes
    TextNode(String text) {
        this.text = text;
        this.prev = null;
        this.next = null;
    }
}
