import java.util.Scanner;

public class ScannerUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter your Name : ");
        String name = sc.next();
        System.out.print(" Enter your Age : ");
        int age = sc.nextInt();
        System.out.print(" Enter the Gender : ");
        char gender = sc.next().charAt(0);
        System.out.print(" Enter your Phone number : ");
        long phoneNo = sc.nextLong();
        System.out.println("-------------------------------");
        System.out.println(" Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Gender : " + gender);
        System.out.println("Phone number  : " + phoneNo);

    }
}
