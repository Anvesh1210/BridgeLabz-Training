//finding the bonus of employees based on their years of service
import java.util.Scanner;
public class FindBounous{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		//Taking a salary and Years of service from the user 
		System.out.print("Enter Salary: ");
		int salary = input.nextInt();
		System.out.print("Enter Year of Service: ");
		int yearOfService = input.nextInt();
		
		//Calculating the bonous based on year on service
		double bonous=0;
		if(yearOfService > 5){
			bonous = (salary*5.0)/100;
		}
		
		System.out.println("Bonous: "+bonous);
		
		input.close();
	}
}