public class ZaraBonus {
    // Method to generate salary and years of service
    static int[][] generateEmployeeData(int n) {
        int[][] data = new int[n][2]; 

        for (int i=0;i<n;i++) {
            data[i][0] = (int)(Math.random() * 90000) + 10000;
            data[i][1] = (int)(Math.random() * 10) + 1;
        }
        return data;
    }

    // Method to calculate new salary and bonus
    static double[][] calculateBonus(int[][] data) {
        double[][] result = new double[data.length][2]; 

        for (int i = 0; i < data.length; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            double bonus;
            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }
            result[i][0] = salary + bonus; 
            result[i][1] = bonus;         
        }
        return result;
    }

    // Method to calculate totals and display table
    static void displayReport(int[][] oldData, double[][] newData) {

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Emp\tOldSalary\tYears\tBonus\t\tNewSalary");
        System.out.println();

        for (int i = 0; i < oldData.length; i++) {

            totalOldSalary += oldData[i][0];
            totalNewSalary += newData[i][0];
            totalBonus += newData[i][1];

            System.out.println(
                    (i + 1) + "\t" +oldData[i][0] + "\t\t" +oldData[i][1] + "\t" +newData[i][1] + "\t" +newData[i][0]);
        }

        System.out.println();
        System.out.println("Total\t" +totalOldSalary + "\t\t\t" +totalBonus + "\t" +totalNewSalary);
    }

    public static void main(String[] args) {

        int employees = 10;
        int[][] employeeData = generateEmployeeData(employees);
        double[][] salaryDetails = calculateBonus(employeeData);
        displayReport(employeeData, salaryDetails);
    }
}
