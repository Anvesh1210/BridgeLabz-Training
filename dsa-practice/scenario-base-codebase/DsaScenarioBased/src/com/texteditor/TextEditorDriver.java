package com.texteditor;

public class TextEditorDriver {
	public static void main(String[] args) {
		//making TextEditor object
		TextEditor textEditor = new TextEditor();
		textEditor.addText("Hello");
		textEditor.addText(" We");
		textEditor.addText(" are");
		textEditor.addText(" learning");
		textEditor.addText(" Java");
		textEditor.addText(" Language.");
		textEditor.displayText();
		textEditor.removeText();
		textEditor.displayText();
		textEditor.undo();
		textEditor.displayText();
		textEditor.redo();
		textEditor.displayText();
		textEditor.removeText();
		textEditor.displayText();
		textEditor.format();
		
	}
}
