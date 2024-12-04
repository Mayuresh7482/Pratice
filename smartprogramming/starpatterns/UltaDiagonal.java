import java.util.Scanner;

public class UltaDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            // Print spaces before the *
            for (int j = 1; j <= number - i; j++) {
                System.out.print(" ");
            }
            // Print the asterisk
            System.out.println("*");
        }
        scanner.close();
    }
}
