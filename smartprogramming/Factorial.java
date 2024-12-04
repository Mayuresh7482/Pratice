// Importing the Scanner class from java.util package
import java.util.Scanner;

// Defining a public class named Factorial
public class Factorial {
    // The main method which is the entry point of any Java program
    public static void main(String[] args) {
        // Creating a new Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Printing a message to the user to enter a number for which factorial is needed
        System.out.println("Enter a number to calculate its factorial:");
        // Reading the number entered by the user
        int no = sc.nextInt();

        // Initializing a variable 'fact' to 1 which will be used to calculate the factorial
        int fact = 1;

        // Printing a message to indicate the start of factorial calculation in reverse order
        System.out.println("\nFactorial Calculation in Reverse Order:");

        // A for loop that starts from the number entered by the user and goes down to 1
        for (int i = no; i >= 1; i--) {
            // Printing the current value of 'fact'
            System.out.print(fact + " ");
            // Multiplying the current value of 'fact' with 'i' and storing the result back in 'fact'
            fact = fact * i;
        }

        // Printing the final output i.e., the factorial of the number entered by the user
        System.out.println("\n\nThe factorial of " + no + " is: " + fact);
    }
}