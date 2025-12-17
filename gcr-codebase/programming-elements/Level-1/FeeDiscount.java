//Finding Discount in Fees
public class FeeDiscount
{
	public static void main(String []args)
	{
		
		//Giving input Details
		double fee = 125000;
		int discountPercent = 10;

		//Calculating Discount in fees
		double discount = (fee*discountPercent)/100;

		//Displaying discount amount and Discounted Fees
		System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+(fee-discount));
		
	}
}
