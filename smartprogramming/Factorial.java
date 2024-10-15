import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Get the number for which factorial is needed
        System.out.println("Enter a number to calculate its factorial:");
        int no = sc.nextInt();

        // Initialization
        int fact = 1;

        // Output the factorial in reverse order (descending)
        System.out.println("\nFactorial Calculation in Reverse Order:");

        for (int i = no; i >= 1; i--) {
            fact = fact * i;
            System.out.print(fact + " ");
        }

        // Final output for clarity
        System.out.println("\n\nThe factorial of " + no + " is: " + fact);
    }
}
