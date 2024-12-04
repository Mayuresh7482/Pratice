import java.util.Scanner;

public class UltaTriangle3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        int number = scanner.nextInt();
        for (int i = number; i >= 1; i--) {
            for (int j = number; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < (i * 2); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
        scanner.close();
    }
}
