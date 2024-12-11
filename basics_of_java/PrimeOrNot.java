// Importing the Scanner class from java.util package
import java.util.Scanner;

// Declaring the class PrimeOrNot
public class PrimeOrNot {
    // Main method which is the entry point of the program
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // Prompting the user to enter a number
        System.out.println("Enter the number for Checking Prime or Not -> ");
        // Reading the number entered by the user
        int number = sc.nextInt();
        // Initializing a variable temp to 0
        int temp = 0;
        // Looping from 2 to one less than the number entered by the user
        for (int i = 2; i <= number - 1; i++) {
            // Checking if the number is divisible by i
            if (number % i == 0) {
                // If it is divisible, incrementing the temp variable by 1
                temp = temp + 1;
            }
        }
        // If temp is greater than 0, the number is not prime
        if (temp > 0) {
            // Printing that the number is not prime
            System.out.println("Not prime number -> " + number);
        } else {
            // If temp is 0, the number is prime
            System.out.println("Is a Prime Number -> " + number);
        }
        // Closing the Scanner object
        sc.close();
    }
}