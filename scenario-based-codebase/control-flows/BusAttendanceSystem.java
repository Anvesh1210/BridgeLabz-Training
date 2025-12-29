//School Bus Attendance System
import java.util.Scanner;
public class BusAttendanceSystem{
	public static void main(String []args){
		//creating Scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to Smart Bus Attendance System");
		System.out.println("-----------------------------------------");
		String []namesOfStudent = {"Raj", "Rahul" , "Priya" , "Ashu", "Raghav", "Anjli", "Suhani" , "Sahit" , "Sakshi" ,"Simran"};
		boolean [] status = new boolean[10];
		int i=0;
		int present=0;
		System.out.println();
		for(String name : namesOfStudent){
			System.out.print("Today "+name+" is present or not(Yes/No): ");
			String flag = input.next();
			if(flag.equalsIgnoreCase("yes")){
				status[i]= true;
				present++;
			}else{
				status[i]= false;
			}
			i++;
		}
		System.out.println("\n---------Today's Attendance Chart---------");
		System.out.println("\n\tName\t\tStatus");
		System.out.println("------------------------------------------");
		
		for(int j=0;j<10;j++){
			System.out.println("\t"+namesOfStudent[j]+" \t\t "+(status[j]?"Presnt":"Abesnt"));
		}
		System.out.println("------------------------------------------");
		System.out.println("Total number of presnt Student: "+present);
		System.out.println("Total number of Absent Student: "+(10-present));
		
		//closing the Scanner
		input.close();
	}
}