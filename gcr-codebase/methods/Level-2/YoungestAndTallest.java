//Checking the youngest and tallest amoung three friends
import java.util.Scanner;
public class YoungestAndTallest {
    
    // Method to find the youngest friend
    public static String findYoungest(int[] ages) {
        int youngestAge = ages[0];
        String youngestFriend = "Amar";
        //logic for checking the youngest friend
        if (ages[1] < youngestAge) {
            youngestAge = ages[1];
            youngestFriend = "Akbar";
        }
        if (ages[2] < youngestAge) {
            youngestAge = ages[2];
            youngestFriend = "Anthony";
        }
        return youngestFriend;
    }

    // Method to find the tallest friend
    public static String findTallest(int[] heights) {
        int tallestHeight = heights[0];
        String tallestFriend = "Amar";
        //logic for checking tallest friend
        if (heights[1] > tallestHeight) {
            tallestHeight = heights[1];
            tallestFriend = "Akbar";
        }
        if (heights[2] > tallestHeight) {
            tallestHeight = heights[2];
            tallestFriend = "Anthony";
        }
        return tallestFriend;
    }

    public static void main(String[] args) {
		//creating scanner object
        Scanner input = new Scanner(System.in);

        // Arrays to store the ages and heights of the three friends
        int[] ages = new int[3];
        int[] heights = new int[3];
        
        // Taking ages and heights of three friends as input
        System.out.print("Input age of Amar: ");
        ages[0] = input.nextInt();
        System.out.print("Input age of Akbar: ");
        ages[1] = input.nextInt();
        System.out.print("Input age of Anthony: ");
        ages[2] = input.nextInt();
        
        System.out.print("Input height of Amar: ");
        heights[0] = input.nextInt();
        System.out.print("Input height of Akbar: ");
        heights[1] = input.nextInt();
        System.out.print("Input height of Anthony: ");
        heights[2] = input.nextInt();
        
        // Calling the methods to find the youngest and tallest
        String youngest = findYoungest(ages);
        String tallest = findTallest(heights);
        
        // Displaying the results
        System.out.println(youngest + " is the youngest friend.");
        System.out.println(tallest + " is the tallest friend.");
        
        // Closing the Scanner
        input.close();
    }
}
