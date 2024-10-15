import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        // 0 1 153 370 371 407 1634
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        int number = scanner.nextInt();
        int t1 = number;
        int length = 0;
        while (t1 != 0) {
            length = length + 1;
            t1 = t1 / 10;
        }
        int t2 = number;
        int arm = 0;
        while (t2 != 0) {
            int multi = 1;
            int remainder = t2 % 10;
            for (int i = 1; i <= length; i++) {
                multi = multi * remainder;
            }
            arm = arm + multi;
            t2 = t2 / 10;
        }
        if (arm == number) {
            System.out.println(number + " is ArmStrong Number ");
        } else {
            System.out.println(number + " is Not a ArmStrong number ");
        }
        scanner.close();
    }
}
