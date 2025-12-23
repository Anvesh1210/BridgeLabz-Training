//toggeling a String
import java.util.Scanner;
public class ToggleCase{

    //method to get toggle string
    public static String toggleCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                result = result + (char)(ch + 32);
            } else if (ch >= 'a' && ch <= 'z') {
                result = result + (char)(ch - 32);
            } else {
                result = result + ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
		//creating Scanner object
        Scanner sc = new Scanner(System.in);

		//taking a String from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

		//calling the method to get result
        String toggled = toggleCase(input);
		
		//printing the result
        System.out.println("Toggled case string: " + toggled);
		
		//closing the Scanner
        sc.close();
    }
}
