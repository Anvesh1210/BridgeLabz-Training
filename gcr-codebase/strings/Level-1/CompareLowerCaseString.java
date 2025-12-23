//converting strings into lowercase staring using charAt() and buildin method and comparing both strings 
import java.util.Scanner;
public class CompareLowerCaseString{
	
	//method to convert string into lowercase using charAt()
	public static String convertLowerCase(String s){
		String result="";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)>=65 && s.charAt(i)<=90){
				result+=(char)(s.charAt(i)+32);
			}else{
				result+=(char)s.charAt(i);
			}
		}
		return result;
	}
	
	//method to compare strings using equals
	public static boolean compareStrings(String one, String two){
		
		if(one.length()!=two.length()){
			return false;
		}
		for(int i=0;i<one.length();i++){
			if(one.charAt(i)!=two.charAt(i)){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String [] args){
		//creating Scanner object
		Scanner input = new Scanner(System.in);
		
		//Taking a string from the user
		System.out.print("Enter a String: ");
		String s = input.nextLine();
		
		//calling build in method and user define method to get lowercase string
		String result1 = convertLowerCase(s);
		String result2 = s.toLowerCase();
		
		//comparing the results using the method compareStrings()
		boolean flag = compareStrings(result1,result2);
		if(flag){
			System.out.println("Both lowercase Strings are same and it is : " + result1);
		}else{
			System.out.println("Both results are not same");
			System.out.println("The lowercase string using charAt(): "+result1);
			System.out.println("The lowercase string using toUpperCase(): "+result2);
		}
		
		//closing the scanner
		input.close();
	}
}