
import java.util.Arrays;
import java.util.List;

public class SwitchCase {

    // Function to calculate the area based on the choice
    public static double switchCase(int choice, List<Double> params) {
        double area = 0.0;

        switch (choice) {
            case 1:
                // Calculate area of the circle, params.get(0) contains the radius R
                double R = params.get(0);
                area = Math.PI * R * R; // Area of the circle
                break;

            case 2:
                // Calculate area of the rectangle, params.get(0) contains length L and
                // params.get(1) contains breadth B
                double L = params.get(0);
                double B = params.get(1);
                area = L * B; // Area of the rectangle
                break;

            default:
                System.out.println("Invalid choice");
        }

        return area;
    }

    public static void main(String[] args) {
        // Test case 1: Area of a circle
        int choice1 = 1;
        List<Double> circleList = Arrays.asList(5.0); // Radius R = 5

        // Call the switchCase method and print the result
        System.out.println("Area of Given Radius is " + switchCase(choice1, circleList));

        // Test case 2: Area of a rectangle
        int choice2 = 2;
        List<Double> rectangleList = Arrays.asList(5.0, 10.0); // Length L = 5, Breadth B = 10

        // Call the switchCase method and print the result
        System.out.println("Area of Given Length and Breadth is " + switchCase(choice2, rectangleList));
    }
}
