//reverse a String without using buildin function
import java.util.Scanner;
public class ReverseString {

    //method to take a string and return reversed string
    public static String reverseString(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        return reversed;
    }


    public static void main(String[] args) {
	
		//creating String object
        Scanner sc = new Scanner(System.in);

		//taking a string from user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        //calling method to get reversed string
        String result = reverseString(input);
		
		//priting the reversed string
        System.out.println("Reversed String: " + result);

		//closing the scanner object
        sc.close();
    }
}
