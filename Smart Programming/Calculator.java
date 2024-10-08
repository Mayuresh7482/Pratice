import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        String YesNo;
        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the First number: ");
            int fno = sc.nextInt();

            System.out.println("Enter the Second number: ");
            int sno = sc.nextInt();

            // Consuming the newline left by nextInt()
            sc.nextLine();

            System.out.println("Which operation should be done on number (+, -, /, *): ");
            String str = sc.nextLine();

            int res = 0; // Declare res here for use in switch

            switch (str) {
                case "+":
                    res = fno + sno;
                    System.out.println("After adding: " + res);
                    break;
                case "-":
                    res = fno - sno;
                    System.out.println("After Subtracting: " + res);
                    break;
                case "/":
                    if (sno != 0) { // Checking for division by zero
                        res = fno / sno;
                        System.out.println("After Dividing: " + res);
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;
                case "*":
                    res = fno * sno;
                    System.out.println("After Multiplying: " + res);
                    break;
                default:
                    System.out.println("Invalid operation");
                    break;
            }
            System.out.println(" Do you want to continue press y for Yes and n for No : ");

            YesNo = sc.next();
        } while (YesNo.equals("y") || YesNo.equals("Y"));
        // Close the scanner to prevent resource leakage
    }
}
