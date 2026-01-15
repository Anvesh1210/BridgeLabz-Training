package com.texteditor;

import java.util.Stack;

public class TextEditor {
	private Stack<String> texts;
	private Stack<String> undo;
	private StringBuffer sb=null;

	//constructor to initialize text editor
	public TextEditor() {
		texts = new Stack<>();
		undo = new Stack<>();
		sb=new StringBuffer();
	}
	
	//method to add text in stack
	public void addText(String s) {
		texts.push(s);
		sb.append(s);
		System.out.println("Text added successfully");
		
	}
	
	//method to remove recent text from stack
	public void removeText() {
		if(texts.isEmpty())
			System.out.println("Editor is already empty");
		else {
			int length=texts.pop().length();
			sb.delete(sb.length()-length, sb.length());
			System.out.println("Text Removed Successfully");
		}
	}
	
	//method to format the stack
	public void format() {
		texts.clear();
		undo.clear();
		sb.delete(0, sb.length());
		System.out.println("Text Formatted removed evertything");
	}
	
	//method to do undo operation
	public void undo() {
		if(texts.isEmpty()) {
			System.out.println("Nothing to undo!!!");
		}else {
			String undoString=texts.pop();
			int len =undoString.length();
			undo.push(undoString);
			sb.delete(sb.length()-len, sb.length());
			System.out.println("Undo operation success");
		}
	}
	
	//method to do re do operation
	public void redo() {
		if(undo.isEmpty()) {
			System.out.println("Nothing to redo");
		}else {
			String redoString = undo.pop();
			sb.append(redoString);
			texts.push(redoString);
			System.out.println("Redo operation success");
		}
	}
	
	public void displayText() {
		System.out.println(sb.toString());
	}
}
