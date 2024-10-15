
import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for Checking Prime or Not -> ");
        int number = sc.nextInt();
        int temp = 0;
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                temp = temp + 1;
            }
        }
        if (temp > 0) {
            System.out.println("Not prime number -> " + number);
        } else {
            System.out.println("Is a Prime Number -> " + number);
        }
        sc.close();
    }
}
