//finding the bonus of employees based on their years of service
import java.util.Scanner;
public class FindBounous{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		//defining the arrys of salary, year of service, new salary, bonous amount
		double []salary= new double[10];
		double []yearOfService= new double[10];
		double []newSalary= new double[10];
		double []bonousAmount= new double[10];
		
		double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
		
		//Taking a salary and Years of service from the user 
		for(int i=0;i<salary.length;i++){
			System.out.println();
			System.out.println("For Employee: "+(i+1));
			System.out.print("Enter Salary: ");
			double sal = input.nextDouble();
			System.out.print("Enter Year of Service: ");
			double yos = input.nextDouble();
			
			if(sal<=0 || yos<0){
				System.out.println("Invalid Input ");
				i--;
				continue;
			}
			
			salary[i]=sal;
			yearOfService[i]=yos;
		}
		
		//Calculating the bonous based on year on service
		for (int i = 0; i < bonousAmount.length; i++) {
            if (yearOfService[i] > 5) {
                bonousAmount[i] = salary[i] * 0.05;
            } else {
                bonousAmount[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonousAmount[i];

            totalBonus += bonousAmount[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Output results
		System.out.println();
        System.out.println("Bonus Summary:");
        System.out.println("Total Old Salary   :" + totalOldSalary);
        System.out.println("Total Bonus Paid   :" + totalBonus);
        System.out.println("Total New Salary   :" + totalNewSalary);
		
		//closing the scanner
		input.close();
	}
}