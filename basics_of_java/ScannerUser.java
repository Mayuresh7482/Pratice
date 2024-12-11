// Importing the Scanner class from java.util package
import java.util.Scanner;

// Declaring the class ScannerUser
public class ScannerUser {
    // The main method where the program starts execution
    public static void main(String[] args) {
        // Creating a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        
        // Asking the user to enter their name
        System.out.print(" Enter your Name : ");
        // Reading the user's name
        String name = sc.next();
        
        // Asking the user to enter their age
        System.out.print(" Enter your Age : ");
        // Reading the user's age
        int age = sc.nextInt();
        
        // Asking the user to enter their gender
        System.out.print(" Enter the Gender : ");
        // Reading the user's gender
        String gender = sc.next();
        
        // Asking the user to enter their phone number
        System.out.print(" Enter your Phone number : ");
        // Reading the user's phone number
        long phoneNo = sc.nextLong();
        
        // Printing a line for separation
        System.out.println("-------------------------------");
        
        // Displaying the user's name
        System.out.println(" Name : " + name);
        // Displaying the user's age
        System.out.println("Age : " + age);
        // Displaying the user's gender
        System.out.println("Gender : " + gender);
        // Displaying the user's phone number
        System.out.println("Phone number  : " + phoneNo);
    }
}