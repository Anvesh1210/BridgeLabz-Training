//Finding height in Centimeters feel and inches
import java.util.Scanner;

public class HeightCalculation{
	public static void main(String []args){

		//Taking input from the user
		Scanner input = new Scanner(System.in);
		double heightInCM = input.nextDouble();

		//Calculating height of Triangle in inches and foot
		double heightInInches = heightInCM/2.54;
		double heightInFoot = heightInInches/12;
		
		//Displaying height of Triangle
		System.out.println("Your Area in cm is "+heightInCM+" while in feet is "+heightInInches+" and inches is "+heightInFoot);

	}
}
