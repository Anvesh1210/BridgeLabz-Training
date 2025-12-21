//check for given year is a leap year or not using function 
import java.util.Scanner;	
class LeapYear{

	//method to check given year is a leap year or not
	public static boolean checkLeapYear(int year){
		if(year >= 1582){
			if(year%400==0){
				return true;
			}else if(year%100==0){
				return false;
			}else if(year%4==0){
				return true;
			}else {
                return false;
            }
			
		}else{
			return false;
		}
	}
	
	public static void main(String[] args){
	
		//creating scanner object
		Scanner input = new Scanner(System.in);
		
		//taking a year from the user
		System.out.print("Enter a Year: ");
		int year = input.nextInt();
		
		//calling the function the check it is a leap year or not
		boolean leapYear = checkLeapYear(year);
		
		if(leapYear){
			System.out.println("Given year is a leap year");
		}else{
			System.out.println("Given year is not a leap year");
		}
		
		//closing the Scanner 
		input.close();
	}
}