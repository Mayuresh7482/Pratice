import java.util.Scanner;

public class HollowSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the square: ");
        int size = scanner.nextInt();

        for (int i = 1; i <= size; i++) { // Outer loop for rows
            for (int j = 1; j <= size; j++) { // Inner loop for columns
                // Print * for the boundary positions
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Print space for inner positions
                }
            }
            System.out.println(); // Move to the next line after each row
        }

        scanner.close();
    }
}
