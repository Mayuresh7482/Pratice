import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        // Prompt the user for input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        int number = scanner.nextInt();  // Get the number from the user
        
        // Calculate the number of digits (length) in the number
        int length = getLength(number);
        
        // Check if the number is an Armstrong number
        if (isArmstrong(number, length)) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }

        scanner.close();  // Close the scanner to free resources
    }

    // Method to calculate the length (number of digits) of a number
    private static int getLength(int number) {
        int length = 0;
        while (number != 0) {
            length++;
            number /= 10;
        }
        return length;
    }

    // Method to check if a number is an Armstrong number
    private static boolean isArmstrong(int number, int length) {
        int temp = number;
        int sum = 0;

        // Calculate the Armstrong sum manually without using Math.pow
        while (temp != 0) {
            int digit = temp % 10;
            int digitPower = 1;  // Initialize to 1 for multiplication

            // Multiply the digit by itself 'length' times
            for (int i = 1; i <= length; i++) {
                digitPower *= digit;
            }

            sum += digitPower;  // Add the digit's power to the sum
            temp /= 10;  // Remove the last digit
        }

        // Return whether the sum equals the original number
        return sum == number;
    }
}
