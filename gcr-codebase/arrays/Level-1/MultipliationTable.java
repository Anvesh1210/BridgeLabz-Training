//Multipliation of a Table
import java.util.Scanner;
public class MultipliationTable{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		// Taking a number form user
		System.out.println("Enter a number:");
		int number = input.nextInt();
		int []table = new int[10];
		for(int i=0;i<number;i++){
			table[i] = number*(i+1);
		}
		
		//printing the table of the given number
		for(int i=1;i<table.length+1;i++){
			System.out.println(number+"*"+i+" = "+table[i-1]);
		}
		
		
		//Closing the Scanner 
		input.close();
	}
}
			