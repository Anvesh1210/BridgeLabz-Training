//finding no of choclates each student get and remaning choclates
import java.util.Scanner;
public class ChoclatesAndChildrens{

	//method for calculating Remainder And Quotient
	public static int[] findChoclates(int noOfChoclates, int noOfChildren){
		int [] result=new int[2];
		
		//finding choclate each person get
		result[0] = noOfChoclates/noOfChildren;
		
		//finding remaning choclates
		result[1] = noOfChoclates%noOfChildren;
		
		return result;
	}
	
	
	public static void main(String []args){
	
		//creating Scanner object
		Scanner input = new Scanner(System.in);
		
		//taking no of choclates and no of choclates from user
		System.out.print("Enter no of choclate: ");
		int numberOfchocolates  = input.nextInt();
		
		System.out.print("Enter Number of children: ");
		int numberOfChildren = input.nextInt();
		
		
		
		
		//Calling findChoclates method
		int []result = findChoclates(numberOfchocolates, numberOfChildren);
		
		//printing the no of choclate each children and remaning choclates
		System.out.println("No of choclates each children get: "+result[0]);
		System.out.println("Remaining Choclates: "+result[1]);
		
		//closing the scanner
		input.close();
	}
}
