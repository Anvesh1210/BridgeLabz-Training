//finding how many time a substring occures in a string
import java.util.Scanner;
public class SubstringOccurrences {

    //method to find substring occurance
    public static int countOccurrences(String text, String sub) {
        int count = 0;
        int index = 0;
        while ((index = text.indexOf(sub, index)) != -1) {
            count++;
            index = index + sub.length(); // move index forward
        }
        return count;
    }

    public static void main(String[] args) {
		//creating Scanner object
        Scanner sc = new Scanner(System.in);

		//taking a String and currosponding substring from the user
        System.out.print("Enter the main string: ");
        String text = sc.nextLine();

        System.out.print("Enter the substring to search: ");
        String sub = sc.nextLine();

		//calling the methos to find no of occurance
        int result = countOccurrences(text, sub);

		//printing the results
        System.out.println("Substring occurs " + result + " times.");

		//closing the Scanner
        sc.close();
    }
}
