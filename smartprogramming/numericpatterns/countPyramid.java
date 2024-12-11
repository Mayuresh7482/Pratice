package numericpatterns;

import java.util.Scanner;

public class countPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        int number = scanner.nextInt();
        System.out.println(" Numeric Pattern");

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int k = i-1; k >= 1; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
