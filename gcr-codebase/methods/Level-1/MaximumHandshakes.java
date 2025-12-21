//calculating Maximum handshakes of students using methods
import java.util.Scanner;
public class MaximumHandshakes{

	//method for calculating Maximum Handshakes
	public int calculateMaximumHandshakes(int numberOfStudnet){
		int maximumHandshakes = (numberOfStudnet* (numberOfStudnet-1))/2;
		return maximumHandshakes;
	}
	
	
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		//taking number of students from user
		System.out.print("Enter Number of Students: ");
		int numberOfStudnet = input.nextInt();
		
		
		MaximumHandshakes ms = new MaximumHandshakes();
		int maximumHandshakes = ms.calculateMaximumHandshakes(numberOfStudnet);
		
		//printing the Maximum Handshakes of students
		System.out.println("Maximum Handshakes: "+maximumHandshakes);
		
		//closing the scanner
		input.close();
	}
}
