//Writing code for Input 
import java.util.Scanner;
public class FeeDiscountViaUser
{
	public static void main(String []args)
	{
		Scanner input = new Scanner(System.in);

		//Taking user input
		double fee = input.nextDouble();
		double discountPercent = input.nextDouble();

		//Calculating discountd Amount
		double discount = (fee*discountPercent)/100;

		//Displaying Discountd Amount and final discounted fee
		System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+(fee-discount));
	}
}
