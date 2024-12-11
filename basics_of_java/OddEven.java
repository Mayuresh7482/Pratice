import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        int number = scanner.nextInt();
        int sum = 0;

        if (number % 2 == 0) { // Even numbers
            for (int i = 0; i <= number; i += 2) {
                sum += i;
            }
            System.out.println("Sum of even numbers up to " + number + " is: " + sum);
        } else { // Odd numbers
            for (int i = 1; i <= number; i += 2) {
                sum += i;
            }
            System.out.println("Sum of odd numbers up to " + number + " is: " + sum);
        }

        scanner.close();
    }
}
