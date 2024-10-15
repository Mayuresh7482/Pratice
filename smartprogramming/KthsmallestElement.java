public class KthsmallestElement {
    
    // Method to find the kth smallest element
    public static void smallest(int arr[], int k) {
        // Sorting the array in ascending order using selection sort
        for (int idx = 0; idx < arr.length - 1; idx++) {
            for (int j = idx + 1; j < arr.length; j++) {
                if (arr[idx] > arr[j]) {
                    // Swap elements
                    int temp = arr[idx];
                    arr[idx] = arr[j];
                    arr[j] = temp;
                }
            }
            // If the loop has reached the kth element
            if (idx == k - 1) {
                System.out.println("Smallest element at k = " + k + " is : " + arr[idx]);
                break;
            }
        }
    }

    // Method to find the kth largest element
    public static void largest(int arr[], int k) {
        // Sorting the array in descending order using selection sort
        for (int idx = 0; idx < arr.length - 1; idx++) {
            for (int j = idx + 1; j < arr.length; j++) {
                if (arr[idx] < arr[j]) {
                    // Swap elements
                    int temp = arr[idx];
                    arr[idx] = arr[j];
                    arr[j] = temp;
                }
            }
            // If the loop has reached the kth element
            if (idx == k - 1) {
                System.out.println("Largest element at k = " + k + " is : " + arr[idx]);
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 8, 12, 7, 6, 2, 4 }; // Array input
        int k = 4; // k-th element to find

        // Find and print the k-th smallest element
        smallest(arr, k);

        // Reset the array for finding the k-th largest element
        int[] arr2 = { 25, 18, 12, 27, 16, 42, 14 };
        
        // Find and print the k-th largest element
        largest(arr2, k);
    }
}
