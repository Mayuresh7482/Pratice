import java.util.Scanner;

public class RecursionForNaturalNo {
    // Recursive method to print natural numbers from 1 to n
    static void printNaturalNumbers(int current, int n) {
        if (current > n) { // Base case: stop when current exceeds n
            return;
        }
        System.out.print(current + " "); // Print the current number
        printNaturalNumbers(current + 1, n); // Recursive call for the next number
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int number = scanner.nextInt(); // Read the limit for natural numbers
        System.out.println("Natural Numbers from 1 to " + number + ":");
        printNaturalNumbers(1, number); // Start printing from 1 to the entered number
        scanner.close(); // Close the scanner resource
    }
}
