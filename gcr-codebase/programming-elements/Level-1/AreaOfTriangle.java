//Writing code to finding Area of Triangle
import java.util.Scanner;

public class AreaOfTriangle{
	public static void main(String []args){

		//Taking input from the user
		Scanner input = new Scanner(System.in);
		double base = input.nextDouble();
		double height = input.nextDouble();

		//Calculating Area of Triangle in Centimeters, inches and foot
		double areaInCM = (1/2.0)*base*height;

		double baseInInches = base/2.54;
		double heightInInches = height/2.54;
		double areaInInches = (1/2.0)*baseInInches*heightInInches;

		double baseInFoot = baseInInches/12;
		double heightInFoot = heightInInches/12;
		double areaInFoot = (1/2.0)*baseInFoot*heightInFoot;

		//Displaying Area of Triangle
		System.out.println("Your Area in cm is "+areaInCM+" while in feet is "+areaInInches+" and inches is "+areaInFoot);

	}
}
