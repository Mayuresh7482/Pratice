import java.util.Scanner;

public class Diagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            // Print (i - 1) spaces before the asterisk
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // Print the asterisk after spaces
            System.out.println("*");
        }
        
        scanner.close();
    }
}
