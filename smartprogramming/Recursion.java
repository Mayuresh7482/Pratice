
import java.util.Scanner;

public class Recursion {
    int fact = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for factorial ");
        int no = sc.nextInt(), result;
        Recursion f = new Recursion();
        result = f.CalFact(no);
        System.out.println("Factorial for "+no+" is "+result);
    }

    int CalFact(int n) {
        if (n >= 1) {
            fact = fact * n;
            CalFact(n - 1);
        }
        return fact;
    }
}
