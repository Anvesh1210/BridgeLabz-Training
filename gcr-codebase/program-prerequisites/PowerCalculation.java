import java.util.*;
class PowerCalculation{
	public static void main(String []args){
		Scanner kb=new Scanner(System.in);
		System.out.print("Enter Base: ");
		int base = kb.nextInt();
		System.out.print("Enter Exponent: ");
		int exponent = kb.nextInt();
		double power = Math.pow(base, exponent);
		System.out.println(power);
	}
}
	
		
