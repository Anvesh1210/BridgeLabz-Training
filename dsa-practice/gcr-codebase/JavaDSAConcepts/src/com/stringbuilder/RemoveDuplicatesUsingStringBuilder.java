package com.stringbuilder;
import java.util.HashSet;

public class RemoveDuplicatesUsingStringBuilder {
	//method to remove duplicate characters
    public static String removeDuplicates(String input) {

        //stringBuilder to build result
        StringBuilder sb = new StringBuilder();

        //HashSet to track seen characters
        HashSet<Character> seen = new HashSet<>();

        //iterate through each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            //if character not already seen
            if (!seen.contains(ch)){
                sb.append(ch);    
                seen.add(ch);
            }
        }
        //convert to String and return
        return sb.toString();
    }

    public static void main(String[] args) {

        String input = "programming";

        //call the method
        String result = removeDuplicates(input);

        System.out.println("Original String : " + input);
        System.out.println("After Removing Duplicates : " + result);
    }
}
