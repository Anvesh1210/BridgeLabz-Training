//Count down for Rocket Launch using For
import java.util.Scanner;
public class RocketLauchUsingFor{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		//Taking counter number from the user
		System.out.print("Enter counter number: ");
		int counter = input.nextInt();
		
		//Starting the counter for rocket launch 		
		for(int i=counter;i>0;i--){
			System.out.println("counter: "+counter);
			counter--;
		}
		
		//closing the scanner
		input.close();
		
	}
}
		