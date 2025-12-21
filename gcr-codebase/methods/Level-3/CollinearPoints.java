//checking the points is collinear or not
import java.util.Scanner;
public class CollinearPoints {
    // Method using slope formula
    static boolean isCollinearUsingSlope(
            int x1, int y1, int x2, int y2, int x3, int y3) {
        // Avoid division, use cross multiplication
        return (y2 - y1) * (x3 - x1) == (y3 - y1) * (x2 - x1);
    }

    // Method using area of triangle formula
    static boolean isCollinearUsingArea(
            int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3)+x2 * (y3 - y1)+x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
		//creating scanner object
        Scanner sc = new Scanner(System.in);

        // Input points
        System.out.print("Enter x1 y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter x2 y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.print("Enter x3 y3: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        // Check using slope method
        if (isCollinearUsingSlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are collinear using slope formula.");
        } else {
            System.out.println("Points are NOT collinear using slope formula.");
        }

        // Check using area method
        if (isCollinearUsingArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are collinear using area formula.");
        } else {
            System.out.println("Points are NOT collinear using area formula.");
        }
		
		//closing scanner object
        sc.close();
    }
}
