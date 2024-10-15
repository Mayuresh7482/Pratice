import java.util.Scanner;

public class FibonacciUsingRecursion {
    public static void main(String[] args) {
        FibonacciUsingRecursion fur = new FibonacciUsingRecursion();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        int number = scanner.nextInt();

        fur.printFib(number);
        scanner.close();
    }

    int a = 0, b = 1, c;

    void printFib(int n) {
        if (n >= 1) {
            c = a + b;
            System.out.println(" -> " + c + " ");
            a = b;
            b = c;
            printFib(n - 1);
        }
    }
}
