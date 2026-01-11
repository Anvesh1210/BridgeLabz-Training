package com.stringbuilder;

//program to reverse a String Using StringBuilder
public class ReverseStringUsingStringBuilder {
	//method to reverse a string
    public static String reverseString(String input){
        //create StringBuilder object
        StringBuilder sb = new StringBuilder();
        //append the input string
        sb.append(input);
        //reverse the string
        sb.reverse();
        //convert back to String and return
        return sb.toString();
    }

    public static void main(String[] args){
        String input = "hello";
        //call the method
        String reversed = reverseString(input);

        System.out.println("Original String : " + input);
        System.out.println("Reversed String : " + reversed);
    }
}
