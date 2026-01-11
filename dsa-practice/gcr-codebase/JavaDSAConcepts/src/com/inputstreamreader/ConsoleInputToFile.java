package com.inputstreamreader;

//InputStreamReader Problem 2: Read User Input and Write to File

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

public class ConsoleInputToFile {

 public static void main(String[] args) {

     // file path where input will be stored
     String filePath = "src/com/filereader/userInput.txt";

     System.out.println("Enter text (type 'exit' to stop):");

     // try-with-resources for automatic resource closing
     try (
         InputStreamReader isr = new InputStreamReader(System.in);
         BufferedReader br = new BufferedReader(isr);
         FileWriter fw = new FileWriter(filePath, true) // append mode
     ) {

         String input;

         // read input until user types "exit"
         while (true) {
             input = br.readLine();

             if (input.equalsIgnoreCase("exit")) {
                 break;
             }

             // write input to file
             fw.write(input);
             fw.write(System.lineSeparator());
         }

         System.out.println("Input successfully written to file.");

     } catch (IOException e) {
         System.out.println("Error: " + e.getMessage());
     }
 }
}

