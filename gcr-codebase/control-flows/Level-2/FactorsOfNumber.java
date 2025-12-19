//printing the Factores of a number
import java.util.Scanner;
public class FactorsOfNumber{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		//Taking a number from the user 
		System.out.print("Input a number: ");
		int number = input.nextInt();
		
		//checking number is fizz or buzz
		if(number>0){
			System.out.println("Factors Of given Number is: ");
			for(int i=1;i<number;i++){
				if(number%i == 0){
					System.out.println(i);
				}
			}
		}else{
			System.out.println("Not A Positive Number");
		}
		
		//closing the Scanner
		input.close();
	}
}
		