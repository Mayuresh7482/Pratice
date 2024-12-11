
// Define the class SwapWithOrWithoutThirdNum
public class SwapWithOrWithoutThirdNum {
    // Define the main method
    public static void main(String[] args) {
        // Declare and initialize variables a, b and temp
        int a = 10, b = 20, temp;
        // Print the statement "With Third Variable"
        System.out.println(" With Third Variable ");
        // Print the values of a and b
        System.out.println(" a : " + a + " b : " + b);
        // Assign the value of a to temp
        temp = a;
        // Assign the value of b to a
        a = b;
        // Assign the value of temp to b
        b = temp;
        // Print the swapped values of a and b
        System.out.println(" a : " + a + " b : " + b);

        // Print the statement "Without Third Variable"
        System.out.println(" Without Third Variable ");
        // Print the current values of a and b
        System.out.println(" a : " + a + " b : " + b);

        // Add the value of b to a
        a = a + b;
        // Subtract the value of b from the new value of a
        b = a - b;
        // Subtract the value of b from the new value of a
        a = a - b;
        // Print the swapped values of a and b
        System.out.println(" a : " + a + " b : " + b);

    }
}