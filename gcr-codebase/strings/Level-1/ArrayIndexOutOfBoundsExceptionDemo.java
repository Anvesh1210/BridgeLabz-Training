//demo of ArrayIndexOutOfBoundsException 
import java.util.Scanner;
public class ArrayIndexOutOfBoundsExceptionDemo{

    // Method to generate ArrayIndexOutOfBoundsException 
    static void generateException(int[] arr) {
		System.out.println("Array Elements:");
        for(int i=0;i<=arr.length;i++){
			System.out.println(arr[i]);
		}
    }

    // Method to handle ArrayIndexOutOfBoundsException using try-catch
    static void handleException(int [] arr) {
        try {
            System.out.println("Array Elements:");
			for(int i=0;i<=arr.length;i++){
				System.out.println(arr[i]);
			}
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
        }
        catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
		//creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Take user input as String
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

		int []arr = new int[size];
		System.out.println("Eter array elements:");
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		
        //calling generateException()
        try {
            generateException(arr);
        } catch (Exception e) {
            System.out.println("Exception generated. Program continues...");
        }

        // Second call: handle the exception properly
        handleException(arr);

		//closing Scanner object
        sc.close();
    }
}
