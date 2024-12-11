// Importing the Scanner class from java.util package
import java.util.Scanner;

// Declaring the public class AnyPrimeNum
public class AnyPrimeNum {
    // Main method which is the entry point of the program
    public static void main(String[] args) {
        // Creating a new Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        // Prompting the user to enter input
        System.out.print("Enter input: ");
        // Reading the integer input from the user
        int number = scanner.nextInt();
        // Starting a loop from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            // Initializing a temporary variable to 0
            int temp = 0;
            // Starting a loop from 2 to one less than the current number
            for (int j = 2; j <= i - 1; j++) {
                // Checking if the current number is divisible by the loop variable
                if (i % j == 0) {
                    // If it is divisible, increment the temporary variable by 1
                    temp = temp + 1;
                }
            }
            // If the temporary variable is still 0, it means the current number is a prime number
            if (temp == 0) {
                // Printing the prime number
                System.out.print(i + " ");
            } 
            // Closing the Scanner object
        }
        scanner.close();
    }
}