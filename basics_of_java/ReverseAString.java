import java.util.Scanner; // Import the Scanner class to read input from the user

public class ReverseAString { // Class definition for reversing a string

    public static void main(String[] args) { // Main method: entry point of the program
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to take input from the user

        System.out.print("Enter input -> "); // Print a prompt message asking for user input
        String name = scanner.nextLine(); // Read the entire line entered by the user and store it in `name`

        /*
         * // Alternative method using StringBuilder for efficient string reversal
         * String reversed = new StringBuilder(name).reverse().toString();
         */

        String reverse = ""; // Initialize an empty string to store the reversed string
        int length = name.length(); // Get the length of the input string

        // Loop through the string starting from the last character and moving towards
        // the first
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i); // Append the character at position `i` to the `reverse` string
        }

        System.out.println("Reverse String -> " + reverse); // Print the reversed string
        scanner.close(); // Close the scanner to release the resource
    }
}
