//Count down for Rocket Launch
import java.util.Scanner;
public class RocketLauch{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		//Taking counter number from the user
		System.out.print("Enter counter number: ");
		int counter = input.nextInt();
		
		//Starting the counter for rocket launch 		
		while(counter>0){
			System.out.println("Counter: "+counter);
			counter--;
		}
		
		//closing the scanner
		input.close();
		
	}
}
		