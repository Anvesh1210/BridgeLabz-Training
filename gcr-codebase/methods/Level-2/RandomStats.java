//program for avg, minimum and maximum for 4 digits random values
public class RandomStats{
    // Method to generate an array of 4-digit random numbers
    public int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            // Generates a random 4-digit number 
            numbers[i] = (int)(Math.random()*9000)+1000;
        }

        return numbers;
    }

    // Method to find average, minimum, and maximum
    public double[] findAverageMinMax(int[] numbers) {
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        for (int num : numbers){
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = (double) sum/numbers.length;
        return new double[] { average, min, max };
    }


    public static void main(String[] args) {
        RandomStats rs = new RandomStats();

        // Generate 5 random 4-digit numbers
        int[] randomNumbers = rs.generate4DigitRandomArray(5);

        System.out.println("Generated Numbers:");
        for (int num : randomNumbers) {
            System.out.println(num);
        }

        // Find average, min, and max
        double[] result = rs.findAverageMinMax(randomNumbers);

        System.out.println("Average: " + result[0]);
        System.out.println("Minimum: " + (int) result[1]);
        System.out.println("Maximum: " + (int) result[2]);
    }
}
