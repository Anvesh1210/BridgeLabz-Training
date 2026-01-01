import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class RealTimeDigitalWatch {
    public static void main(String[] args) {
        // Define the format for the time (Hour:Minute:Second)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("⏱️ Digital Watch Running... (Press Ctrl+C to stop)");

        try {
            // Infinite loop to keep the watch running
            while (true) {
                // 1. Get current system time
                LocalTime now = LocalTime.now();
                
                // 2. Format the time to String
                String timeString = now.format(formatter);

                // 3. Print with carriage return (\r) to overwrite the previous line
                // This creates the "updating" visual effect in the console
                System.out.print("\rCurrent Time: " + timeString);

                // 4. Pause the program for 1000 milliseconds (1 second)
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("\nWatch interrupted! Stopping simulation.");
        }
    }
}