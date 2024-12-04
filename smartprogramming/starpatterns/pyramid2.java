import java.util.Scanner;

public class pyramid2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = number; j >= 1; j--) {
                if (j > i) {
                    System.out.print(" ");
                } else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
