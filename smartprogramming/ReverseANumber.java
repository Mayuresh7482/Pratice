
import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for Reverse -> ");
        int number = sc.nextInt();
        int remainder, result = 0;
        while (number != 0) {
            remainder = number % 10;
            result = result * 10 + remainder;
            number = number / 10;
        }

        System.out.println("Reverse the number -> " + result);
    }
}
