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
		double areaInsquareInches = (1/2.0)*baseInInches*heightInInches;

		//Displaying Area of Triangle
		System.out.println("Your Area in squre inches is "+areaInsquareInches+" and square cm is "+areaInCM);

	}
}
