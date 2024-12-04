import java.util.Scanner;

public class LeftDown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = number; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
