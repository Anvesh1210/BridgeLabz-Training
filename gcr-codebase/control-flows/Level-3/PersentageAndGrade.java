//Calculating persentage of three subjets and giving grade
import java.util.Scanner;
public class PersentageAndGrade{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		//Taking marks of three subjects from the user
		System.out.print("Enter Physics marks: ");
		int physicsMark = input.nextInt();
		System.out.print("Enter Chemistry marks: ");
		int chemistryMark = input.nextInt();
		System.out.print("Enter Maths marks: ");
		int mathsMark = input.nextInt();
		
		//calculating the persentage 
		double persentage = (physicsMark+chemistryMark+mathsMark)/3.0;
		
		//printing the grade and remark using if else
		if(persentage>=80){
			System.out.println("Persentage is "+persentage);
			System.out.println("The grade is Level 4 and the remark for student is Above agency-normalized standeds");
		}else if(persentage>=70&& persentage<=79){
			System.out.println("Persentage is "+persentage);
			System.out.println("The grade is Level 3 and the remark for student is At agency-normalized standeds");
		}else if(persentage>=60&& persentage<=69){
			System.out.println("Persentage is "+persentage);
			System.out.println("The grade is Level 2 and the remark for student is below but approaching agency-normalized standeds");
		}else if(persentage>=50&& persentage<=59){
			System.out.println("Persentage is "+persentage);
			System.out.println("The grade is Leve l and the remark for student is well below agency-normalized standeds");
		}else if(persentage>=40&& persentage<=49){
			System.out.println("Persentage is "+persentage);
			System.out.println("The grade is Level 1- and the remark for student is too below agency-normalized standeds");
		}else if(persentage<=39){
			System.out.println("Persentage is "+persentage);
			System.out.println("remedial standeds");
		}
		
		//closing the Scanner
		input.close();
	}
}
		