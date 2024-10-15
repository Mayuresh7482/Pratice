import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input -> ");
        String name = scanner.nextLine();
        String reverse = "";
        int length = name.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
        }

        /*  // Using StringBuilder for efficient string reversal
        String reversed = new StringBuilder(name).reverse().toString(); */
        System.out.println("Reverse String -> " + reverse);
        scanner.close();
    }
}
