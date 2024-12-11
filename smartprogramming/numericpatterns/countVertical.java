package numericpatterns;

import java.util.Scanner;

public class countVertical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            int n = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(n + " ");
                n = n + 5 - j;
            }
            System.out.println();
        }
        scanner.close();
    }
}
