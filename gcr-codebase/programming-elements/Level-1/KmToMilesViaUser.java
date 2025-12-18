//Finding conversion of Km to Miles
import java.util.Scanner;
public class KmToMilesViaUser
{
	public static void main(String [] args)
	{
		//Taking User Input
		Scanner input = new Scanner(System.in);
		double km = input.nextDouble();

		//Calculating Km to Miles
		double miles = km/1.6;

		//Displaying Details
		System.out.println("The total miles is "+miles+" mile for the given "+km+" km");
	}
}
