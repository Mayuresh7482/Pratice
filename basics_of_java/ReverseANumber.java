// Importing the Scanner class from java.util package
import java.util.Scanner;

// Declaring the class ReverseANumber
public class ReverseANumber {
    // Main method where the program starts
    public static void main(String[] args) {
        // Creating an instance of Scanner class to take user input
        Scanner sc = new Scanner(System.in);
        // Prompting the user to enter a number
        System.out.print("Enter the number for Reverse -> ");
        // Storing the user input in the variable 'number'
        int number = sc.nextInt();
        // Declaring the variables 'remainder' and 'result'
        int remainder, result = 0;
        // Loop to reverse the number
        while (number != 0) {
            // Getting the last digit of the number
            remainder = number % 10;
            // Adding the last digit to the reversed number
            result = result * 10 + remainder;
            // Removing the last digit from the number
            number = number / 10;
        }

        // Printing the reversed number
        System.out.println("Reverse the number -> " + result);
    }
}