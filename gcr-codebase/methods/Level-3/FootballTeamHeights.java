//finding shortest, tallest and mean height if players
import java.util.Scanner;
public class FootballTeamHeights {

    // function to find sum of heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    // function for finding mean height
    public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    // function to find shortest height
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) {
                min = h;
            }
        }
        return min;
    }

    // function fot finding tallest height
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }

    
    public static void main(String[] args) {
		//creating scanner object
        Scanner sc = new Scanner(System.in);
		
        int[] heights = new int[11];

        // Take input from user
        System.out.println("Enter heights of 11 football players :");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            heights[i] = sc.nextInt();
        }

        System.out.println("Player Heights:");
        for (int h : heights) {
            System.out.print(h + " ");
        }

        System.out.println("Shortest Height: " + findShortest(heights) + " cm");
        System.out.println("Tallest Height: " + findTallest(heights) + " cm");
        System.out.println("Mean Height: " + findMean(heights) + " cm");

		//closing scanner
        sc.close();
    }
}
