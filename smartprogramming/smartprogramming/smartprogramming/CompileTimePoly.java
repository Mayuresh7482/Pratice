package smartprogramming.smartprogramming;

public class CompileTimePoly {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        CompileTimePoly test = new CompileTimePoly();

        System.out.println("Sum of 2 and 3: " + test.add(2, 3));
        System.out.println("Sum of 1, 2 and 3: " + test.add(1, 2, 3));
        System.out.println("Sum of 2.5 and 3.5: " + test.add(2.5, 3.5));
    }
}