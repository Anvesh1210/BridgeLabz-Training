//checking a number is positive, Negative or zero
import java.util.Scanner;
public class NumberNature{

	//method for calculating rounds for 5 km run
	public int getNumberNature(int number){
		if(number<0){
			return -1;
		}else if(number>0){
			return 1;
		}else{
			return 0;
		}
	}
	
	
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		//taking a number form the user
		System.out.print("Enter a Number: ");
		int number = input.nextInt();
		
		NumberNature numberNature = new NumberNature();
		int num = numberNature.getNumberNature(number);

		// printing the nature of the number 
		if(num == -1){
			System.out.println("Negative");
		}else if(num == 1){
			System.out.println("Positive");
		}else{
			System.out.println("Zero");
		}
		
		//closing the scanner
		input.close();
	}
}
