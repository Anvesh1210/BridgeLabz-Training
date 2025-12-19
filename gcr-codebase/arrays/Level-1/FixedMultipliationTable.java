//Multipliation of a Table from 6 to 9
import java.util.Scanner;
public class FixedMultipliationTable{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		// Taking a number form user
		System.out.println("Enter a number:");
		int number = input.nextInt();
		int []table = new int[4];
		
		//calculating the multiplications
		for(int i=0;i<table.length;i++){
			table[i] = number*(i+6);
		}
		
		//printing the table of the given number
		for(int i=1;i<table.length+1;i++){
			System.out.println(number+"*"+(i+5)+" = "+table[i-1]);
		}
		
		
		//Closing the Scanner 
		input.close();
	}
}
			