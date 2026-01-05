package com.linkedlist.doublylinkedlist.undoredotexteditor;

public class TextEditor {
	private TextNode head;
    private TextNode tail;
    private TextNode current;
    private int size = 0;
    private final int LIMIT = 10;

    //method to add new text state
    public void addState(String text) {

        TextNode n = new TextNode(text);

        if (head == null) {
            head = tail = current = n;
            size++;
            return;
        }

        // Remove redo history
        if (current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
        }

        tail.next = n;
        n.prev = tail;
        tail = n;
        current = n;
        size++;

        if (size > LIMIT)
            removeOldest();
    }

    //method to undo operation
    public void undo() {
        if (current != null && current.prev != null)
            current = current.prev;
        else
            System.out.println("Nothing to undo");
    }

    //method to redo operation
    public void redo() {
        if (current != null && current.next != null)
            current = current.next;
        else
            System.out.println("Nothing to redo");
    }

    //method to display current text
    public void displayCurrent() {
        if (current != null)
            System.out.println("Current Text: " + current.text);
        else
            System.out.println("Editor empty");
    }

    //method to remove oldest state
    private void removeOldest() {
        if (head != null) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
}
