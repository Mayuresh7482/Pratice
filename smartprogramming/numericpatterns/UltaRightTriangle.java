package numericpatterns;

import java.util.Scanner;

public class UltaRightTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        int number = scanner.nextInt();
        System.out.println(" Numeric Pattern");

        for (int i = 1; i <= number; i++) {
        
            for (int j=number; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
