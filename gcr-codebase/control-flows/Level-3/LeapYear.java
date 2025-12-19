//Cheking the given year is Leap year or not
import java.util.Scanner;
public class LeapYear{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		//Input a year from user
		System.out.print("Enter a Year: ");
		int year = input.nextInt();
		
		//checking the year is leap or not and printing it
		if(year >= 1582){
			if(year%400==0){
				System.out.println("Given Year is a Leap Year");
			}else if(year%100==0){
				System.out.println("Not a Leap Year");
			}else if(year%4==0){
				System.out.println("Given Year is a Leap Year");
			}else {
                System.out.println("Year is not a Leap Year");
            }
			
		}else{
			System.out.println("Not a Leap Year");
		}
		
		//closing the Scanner
		input.close();
	}
}
		