import java.util.Scanner;

public class FibonacciUsingRecursionMoreOptimise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int number = scanner.nextInt();

        System.out.println("Fibonacci Series:");
        for (int i = 0; i < number; i++) {
            System.out.print(fibonacci(i) + " "); // Print each Fibonacci term
        }

        scanner.close();
    }

    // Recursive method to calculate the nth Fibonacci number
    static int fibonacci(int n) {
        if (n == 0) {
            return 0; // Base case: 0th Fibonacci number is 0
        } else if (n == 1) {
            return 1; // Base case: 1st Fibonacci number is 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive step
    }
}

