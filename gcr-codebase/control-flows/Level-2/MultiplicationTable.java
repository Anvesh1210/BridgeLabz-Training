//finding the multiplication table of a number from 6 to 9
import java.util.Scanner;
public class MultiplicationTable{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		//Taking a number from the user
		System.out.print("Enter a number: ");
		int number=input.nextInt();
		
		//printing their table using loop
		for(int i=6; i<=9;i++){
			System.out.println(number+"*"+i+"="+number*i);
		}
		
		//closing the scanner
		input.close();
	}
}