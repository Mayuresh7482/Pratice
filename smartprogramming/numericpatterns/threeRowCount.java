package numericpatterns;

import java.util.Scanner;

public class threeRowCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= 3; j++) {
                count++;
                System.out.print(count + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
