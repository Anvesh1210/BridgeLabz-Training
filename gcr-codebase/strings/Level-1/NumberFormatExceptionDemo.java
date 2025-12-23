//demo of NumberFormatException
import java.util.Scanner;
public class NumberFormatExceptionDemo {

    // Method to generate NumberFormatException 
    static void generateException(String text) {
        int num = Integer.parseInt(text);
        System.out.println("Number: " + num);
    }

    // Method to handle NumberFormatException using try-catch
    static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Number: " + num);
        }
        catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e);
        }
        catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
		//creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Take user input as String
        System.out.print("Enter a value: ");
        String text = sc.nextLine();

        // First call: generate exception
        try {
            generateException(text);
        } catch (Exception e) {
            System.out.println("Exception generated. Program continues...");
        }

        // Second call: handle the exception properly
        handleException(text);

		//closing Scanner object
        sc.close();
    }
}
