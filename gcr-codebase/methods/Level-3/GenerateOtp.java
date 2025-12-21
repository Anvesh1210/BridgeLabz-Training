import java.util.Arrays;

public class GenerateOtp{

    // Method to generate a 6-digit OTP using Math.random()
    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }

    // Method to check if all elements in the array are unique
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < 10; i++) {
            otpArray[i] = generateOTP();
        }

        // Display OTPs using a loop
        System.out.println("Generated OTPs:");
        for (int i = 0; i < otpArray.length; i++) {
            System.out.println("OTP " + (i + 1) + ": " + otpArray[i]);
        }

        // Check uniqueness
        if (areOTPsUnique(otpArray)) {
            System.out.println("All OTPs are unique!");
        } else {
            System.out.println("Some OTPs are repeated!");
        }
    }
}
