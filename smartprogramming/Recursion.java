import java.util.Scanner; // Importing the Scanner class for user input

public class Recursion { // Defining the class

    public static void main(String[] args) { // Main method: entry point of the program
        Scanner sc = new Scanner(System.in); // Creating a Scanner object for input
        System.out.println("Enter the number for factorial: "); // Prompting the user for input
        int no = sc.nextInt(); // Reading the user input and storing it in the variable `no`

        int result = CalFact(no); // Calling the static method to calculate factorial
        System.out.println("Factorial for " + no + " is " + result + " by recursion method "); // Printing the factorial
                                                                                               // result

        int result2 = CalFact_iteractive(no); // Calling the static method to calculate factorial
        System.out.println("Factorial for " + no + " is " + result2 + " by iteractive method "); // Printing the
                                                                                                 // factorial result
    }

    static int CalFact(int n) { // Static method to calculate factorial using recursion
        if (n <= 1) { // Base case: if n is less than or equal to 1
            return 1; // Return 1 as the factorial of 1 or 0 is 1
        }
        return n * CalFact(n - 1); // Recursive call and returning the result
    }

    static int CalFact_iteractive(int n) { // Static method to calculate factorial using recursion
        if (n <= 1) { // Base case: if n is less than or equal to 1
            return 1; // Return 1 as the factorial of 1 or 0 is 1
        } else {
            int product = 1;
            for (int i = 1; i <= n; i++) {
                product *= i;
            }
            return product;
        }

    }
}
