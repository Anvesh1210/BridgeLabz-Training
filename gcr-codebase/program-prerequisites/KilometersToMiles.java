import java.util.*;
class KilometersToMiles{
	public static void main(String []args){
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter Kilometers: ");
		double km = kb.nextInt();
		double miles = km * 0.621371;
		System.out.println("Miles: "+miles);
	}
}