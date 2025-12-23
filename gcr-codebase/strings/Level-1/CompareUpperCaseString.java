//converting strings into uppercase staring using charAt() and buildin method and comparing both strings 
import java.util.Scanner;
public class CompareUpperCaseString{
	
	//method to convert string into uppercase using charAt()
	public static String convertUpperCase(String s){
		String result="";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)>=97 && s.charAt(i)<=122){
				result+=(char)(s.charAt(i)-32);
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
		
		//calling build in method and user define method to get uppercase string
		String result1 = convertUpperCase(s);
		String result2 = s.toUpperCase();
		
		//comparing the results using the method compareStrings()
		boolean flag = compareStrings(result1,result2);
		if(flag){
			System.out.println("Both uppercase Strings are same and it is : " + result1);
		}else{
			System.out.println("Both results are not same");
			System.out.println("The uppercase string using charAt(): "+result1);
			System.out.println("The uppercase string using toUpperCase(): "+result2);
		}
		
		//closing the scanner
		input.close();
	}
}