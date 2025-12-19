//Cheking the given year is Leap year or not using Single if
import java.util.Scanner;
public class LeapYearUsingSingleIf{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		//Taking a year from user
		System.out.print("Enter a Year: ");
		int year = input.nextInt();
		
		//checking the year is leap or not and printing it
		if(year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))){
			System.out.println("Year is a Leap Year");
		}else{
			System.out.println("Not a Leap Year");
		}
		
		//closing the Scanner
		input.close();
	}
}
		