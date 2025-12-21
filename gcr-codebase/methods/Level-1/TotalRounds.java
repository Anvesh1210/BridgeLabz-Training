//calculating Maximum handshakes of students using methods
import java.util.Scanner;
public class TotalRounds{

	//method for calculating rounds for 5 km run
	public double calculateTotalRoundsfor5KM(int side1, int side2, int side3){
		int perimeter = side1+side2+side3;
		double rounds = 5000/perimeter;
		double totalRounds = Math.ceil(rounds);
		return totalRounds;
	}
	
	
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		//taking three sides of triangle
		System.out.print("Enter side1: ");
		int side1 = input.nextInt();
		
		System.out.print("Enter side2: ");
		int side2 = input.nextInt();
		
		System.out.print("Enter side3: ");
		int side3 = input.nextInt();
		
		
		TotalRounds tr = new TotalRounds();
		double totalRounds = tr.calculateTotalRoundsfor5KM(side1,side2,side3);
		
		//printing the Maximum Handshakes of students
		System.out.println("Total rounds to cover 5 Km : "+totalRounds);
		
		//closing the scanner
		input.close();
	}
}
