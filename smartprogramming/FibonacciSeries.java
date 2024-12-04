import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt(); // Number of terms in the Fibonacci series

        // Print the Fibonacci series
        printFibonacci(terms);

        scanner.close(); // Close the scanner resource
    }

    // Optimized method to generate and print Fibonacci series
    static void printFibonacci(int terms) {
        int a = 0, b = 1; // Initial two numbers of the series

        // Handle edge cases
        if (terms <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= terms; i++) {
            System.out.print(" -> " + a); // Print the current term
            int next = a + b; // Calculate the next term
            a = b; // Update a to the current term
            b = next; // Update b to the next term
        }
    }
}
