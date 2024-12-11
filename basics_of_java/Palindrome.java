
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number -> ");
        int number = sc.nextInt();
        int temp = number;
        int reverse = 0, remainder;
        while (temp != 0) {
            remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp = temp / 10;
        }
        if (number == reverse) {
            System.out.println(number + " is Palindrome number ");
        } else {
            System.out.println(number + " is not Palindrome ");
        }
        sc.close();
    }
}
