import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0, b = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        int c = scanner.nextInt();

        for (int i = 1; i <= c; i++) {
            int number = a + b;
            System.out.println(i + " -> " + number + " ");
            a = b;
            b = number;
        }
        scanner.close();
    }
}
