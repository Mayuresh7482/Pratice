import java.util.Scanner;

public class UltaTriangle2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = number+
            5; k > (i*2); k--) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        scanner.close();
    }
}
