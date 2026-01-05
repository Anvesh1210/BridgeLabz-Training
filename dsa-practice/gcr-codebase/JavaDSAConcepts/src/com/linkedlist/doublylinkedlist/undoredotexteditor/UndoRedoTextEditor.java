package com.linkedlist.doublylinkedlist.undoredotexteditor;

import java.util.Scanner;

public class UndoRedoTextEditor {
	public static void main(String[] args) {
		//creating Scanner object
        Scanner sc = new Scanner(System.in);
        TextEditor editor = new TextEditor();
        int ch;

        do {
        	//asking user which operation he/she wants to perform
            System.out.println("\n1.Add Text \n2.Undo \n3.Redo \n4.Show Text 0.Exit");
            ch = sc.nextInt();
            sc.nextLine();

            //performing operation according to chosen operation
            switch (ch) {
                case 1:
                    System.out.print("Enter text: ");
                    editor.addState(sc.nextLine());
                    break;

                case 2:
                    editor.undo();
                    break;

                case 3:
                    editor.redo();
                    break;

                case 4:
                    editor.displayCurrent();
                    break;
            }

        } while (ch != 0);

        //closing the Scanner
        sc.close();
    }
}
