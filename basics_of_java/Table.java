
import java.util.Scanner;

// Define a class named Table
class Table {
    // Define the main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input for Table : ");
        int number = scanner.nextInt();
        
        
        // Start a for loop that runs from 1 to 10
        for (int i = 1; i <= 10; i++) {
            // Print the multiplication table of 2
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        scanner.close();
    }
}