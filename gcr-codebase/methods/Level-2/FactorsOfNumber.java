//Finding the factors of a number also sum of factors
//also sum of square of factors also product of factors
import java.util.Scanner;
public class FactorsOfNumber{

	//method for finding the factors of the given number
	public static int[] findFactors(int number){
		int temp = number;
		int count=0;
		
		for(int i=1;i<number;i++){
			if(number%i == 0){
				count++;
			}
		}
		int index=0;
		int []factors = new int[count];
		for(int i=1;i<number;i++){

			if(number%i == 0){
				factors[index] = i;
				index++;
			}
		}
		return factors;
		
	}
	
	//method for finding sum of all the factors
	public int sumOfFactors(int []factors){
		int sum=0;
		for(int i=0;i<factors.length ;i++){
			sum+=factors[i];
		}
		
		return sum;
	}
	
	//method for finding products of factors
	public int productOfFactors(int []factors){
		int product=1;
		for(int i=0;i<factors.length ;i++){
			product*=factors[i];
		}
		
		return product;
	}
	
	//method for finding sum of square of factors
	public int sumOfSquareOfFactors(int []factors){
		int sum=0;
		for(int i=0;i<factors.length ;i++){
			sum+=Math.pow(factors[i],2);
		}
		
		return sum;
	}
	
	public static void main(String []args){
	
		//creating Scanner object
		Scanner input = new Scanner(System.in);
		
		//Taking a number from the user
		System.out.print("Enter a Number: ");
		int number = input.nextInt();
		
		//calling findFactors for factor array
		int []factors = findFactors(number);
		
		//crating object of FactorsOfNumber 
		FactorsOfNumber factorsOfNumber = new FactorsOfNumber();
		
		//calling methos for sum of factors, sum of square of factors and product of factors
		int sum = factorsOfNumber.sumOfFactors(factors);
		int sumOfSquareOfFactors = factorsOfNumber.sumOfSquareOfFactors(factors);
		int product = factorsOfNumber.productOfFactors(factors);
		
		//printing the factors, sum of factors, sum of square of factors and product of factors
		
		System.out.println("The factors of given number is: ");
		for(int i=0; i<factors.length;i++){
			System.out.println(factors[i]);
		}
		
		System.out.println("The Sum of the factors is :"+sum);
		System.out.println("The Sum of square of the factors is :"+sumOfSquareOfFactors);
		System.out.println("The product of the factors is :"+product);
		
		//closing the scanner
		input.close();
	}
}
	