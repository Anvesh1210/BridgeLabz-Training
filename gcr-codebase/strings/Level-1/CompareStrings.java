//comparing two strings using charAt() and equals()methods
import java.util.Scanner;
public class CompareStrings{
	
	//method to compare strings using charAt()
	public static boolean compareUsingCharAt(String one, String two){
		for(int i=0;i<one.length();i++){
			if(i==two.length()){
				return false;
			}
			if(one.charAt(i)!=two.charAt(i)){
				return false;
			}
		}
		return true;
	}
	
	//method to compare strings using equals
	public static boolean compareUsingEquals(String one, String two){
		return one.equals(two);
	}
	
	public static void main(String [] args){
		//creating Scanner object
		Scanner input = new Scanner(System.in);
		
		//Taking two strings from the user
		System.out.println("Enter two strings: ");
		String one = input.next();
		String two = input.next();
		
		boolean result1 = compareUsingCharAt(one,two);
		boolean result2 = compareUsingEquals(one,two);
		
		//displaying the results
		if(result1 == result2){
			System.out.println("Both results are same and it is : " +( result1?"String is Equal ":"String is not Equal"));
		}else{
			System.out.println("Both results are not same");
			System.out.println("The result when comparing with charAt(): "+( result1?"Yes":"No"));
			System.out.println("The result when comparing with equals(): "+( result2?"Yes":"No"));
		}
		
		
		
		//closing the scanner
		input.close();
	}
}