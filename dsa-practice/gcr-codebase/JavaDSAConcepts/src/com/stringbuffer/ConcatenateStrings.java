package com.stringbuffer;

public class ConcatenateStrings {
	
	//method to concatenate array of strings
    public static String concatenateStrings(String[] arr) {
       //create StringBuffer object
       StringBuffer sb = new StringBuffer();
       //iterate through array and append each string
       for (int i = 0; i < arr.length; i++) {
           sb.append(arr[i]);
       }
       //convert to String and return
       return sb.toString();
    }

    public static void main(String[] args) {
        String[] input = {"Java", " ", "is", " ", "powerful"};
        // call the method
        String result = concatenateStrings(input);
        System.out.println("Concatenated String : " + result);
    }
}
