public class LeapYear { // Define a class named LeapYear
    public static void main(String[] args) { // Main method that gets executed when the program runs
        int year = 2016; // Declare an integer variable year and initialize it with 2016
        if (year % 400 == 0 ||( year % 4 == 0 && year % 100 != 0)) { // Check if the year is a leap year by checking if it is divisible by 400 or divisible by 4 but not by 100
            System.out.println("Leap year " + year); // If the year is a leap year, print "Leap year" followed by the year
        } else { // If the year is not a leap year
            System.out.println(" Not a Leap Year " + year); // Print "Not a Leap Year" followed by the year
        }
    }
} // End of the LeapYear class