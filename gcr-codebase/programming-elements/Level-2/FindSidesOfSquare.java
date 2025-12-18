//Find side of square from perimeter
import java.util.Scanner;
public class FindSidesOfSquare
{
	public static void main(String [] args)
	{
	
	//taking input form user
	Scanner input =  new Scanner(System.in);
	double perimeter = input.nextDouble();
	
	//Calculating side
	double side = perimeter/4;

	//Displaying sides
	System.out.println("The length of the side is "+side+" whose perimeter is "+perimeter);
	}
}
