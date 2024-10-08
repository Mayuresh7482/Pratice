// Java program to find maximum subarray sum using Kadane's algorithm

public class Kadane_Algorithm {
    
    // Function to find the maximum subarray sum
    public static int maxSubArraySum(int[] arr, int n) {
        int sum = 0;
        int max = Integer.MIN_VALUE; // Handling cases where all elements are negative
        
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            
            // Update max if the current sum is greater than max
            if (sum > max) {
                max = sum;
            }
            
            // If sum becomes negative, reset it to 0 (start a new subarray)
            if (sum < 0) {
                sum = 0;
            }
        }
        
        return max;
    }
    
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; // Example array
        int n = arr.length; // Length of the array
        
        // Call the maxSubArraySum function and print the result
        System.out.println("Maximum subarray sum is: " + maxSubArraySum(arr, n));
    }
}
