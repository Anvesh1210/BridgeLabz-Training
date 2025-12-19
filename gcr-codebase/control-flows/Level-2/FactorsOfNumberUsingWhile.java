//printing the Factores of a number
import java.util.Scanner;
public class FactorsOfNumberUsingWhile{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		//Taking a number from the user 
		System.out.print("Input a number: ");
		int number = input.nextInt();
		
		//finding all the factors and printing it
		if(number>0){
			System.out.println("Factors Of given Number is: ");
			int counter=1;
			while(counter<number){
				if(number%counter == 0){
					System.out.println(counter);
				}
				counter++;
			}
		}else{
			System.out.println("Not A Positive Number");
		}
		
		//closing the Scanner
		input.close();
	}
}
		