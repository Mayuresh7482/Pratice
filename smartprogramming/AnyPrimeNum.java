import java.util.Scanner;

public class AnyPrimeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            int temp = 0;
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    temp = temp + 1;
                }
            }
            if (temp == 0) {
                System.out.print(i + " ");
            } 
            // else {
            //     temp = 0;
            // }
        }
        scanner.close();
    }
}
