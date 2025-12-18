//Finding distance in yards and miles form feets

import java.util.Scanner;
class DistanceConversion
{
	public static void main(String[] args)
	{
		
		//taking user Input
		Scanner input = new Scanner(System.in);
		double distanceInFeet = input.nextDouble();
		
		//calculating distance in yards and miles
		double distanceInYards = distanceInFeet/3;
		double distanceInMiles = distanceInYards/1760;
		
		//printing distance in yards and miles
		System.out.println("The Distance in feet is "+distanceInFeet+" while in Yards is "+distanceInYards+" and inches is "+distanceInMiles);
	}
}