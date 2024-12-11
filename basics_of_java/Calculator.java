// Importing the Scanner class from java.util package
import java.util.Scanner;

// Defining a public class named Calculator
public class Calculator {
    // The main method which is the entry point of the program
    public static void main(String[] args) {
        // Declaration of a String variable to hold user's choice to continue or not
        String YesecondNumber;
        // A do-while loop to repeat the operations until the user decides to stop
        do {
            // Creating a new Scanner object to read user input
            Scanner sc = new Scanner(System.in);

            // Prompting the user to enter the first number
            System.out.println("Enter the First number: ");
            // Reading the first number from the user
            int firstNumber = sc.nextInt();

            // Prompting the user to enter the second number
            System.out.println("Enter the Second number: ");
            // Reading the second number from the user
            int secondNumber = sc.nextInt();

            // Consuming the newline character left by the nextInt() method
            sc.nextLine();

            // Asking the user to choose an operation
            System.out.println("Which operation should be done on number (+, -, /, *): ");
            // Reading the operation from the user
            String str = sc.nextLine();

            // Initializing a variable to hold the result of the operation
            int result = 0;

            // Using a switch statement to perform the operation chosen by the user
            switch (str) {
                // Case for addition
                case "+":
                    // Performing the addition
                    result = firstNumber + secondNumber;
                    // Displaying the result
                    System.out.println("After adding: " + result);
                    break;
                // Case for subtraction
                case "-":
                    // Performing the subtraction
                    result = firstNumber - secondNumber;
                    // Displaying the result
                    System.out.println("After Subtracting: " + result);
                    break;
                // Case for division
                case "/":
                    // Checking if the second number is not zero to avoid division by zero
                    if (secondNumber != 0) {
                        // Performing the division
                        result = firstNumber / secondNumber;
                        // Displaying the result
                        System.out.println("After Dividing: " + result);
                    } else {
                        // Displaying an error message if the second number is zero
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;
                // Case for multiplication
                case "*":
                    // Performing the multiplication
                    result = firstNumber * secondNumber;
                    // Displaying the result
                    System.out.println("After Multiplying: " + result);
                    break;
                // Default case for invalid operations
                default:
                    // Displaying an error message
                    System.out.println("Invalid operation");
                    break;
            }
            // Asking the user if they want to continue
            System.out.println(" Do you want to continue press y for Yes and n for No : ");

            // Reading the user's choice
            YesecondNumber = sc.next();
        // Repeating the loop if the user chose to continue
        } while (YesecondNumber.equals("y") || YesecondNumber.equals("Y"));
        // Close the scanner to prevent resource leakage
    }
}