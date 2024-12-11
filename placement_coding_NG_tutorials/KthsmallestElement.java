
public class KthsmallestElement {
    
    // Function to partition the array on the basis of pivot element
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Picking the last element as the pivot
        int i = low - 1;  // Index of the smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Function to find the kth smallest element
    public static int kthSmallest(int[] arr, int low, int high, int k) {
        if (k > 0 && k <= high - low + 1) {
            // Partition the array around a pivot
            int index = partition(arr, low, high);

            // If the pivot is in the kth position
            if (index - low == k - 1)
                return arr[index];

            // If the pivot is on the left of the kth element, recurse on the left subarray
            if (index - low > k - 1)
                return kthSmallest(arr, low, index - 1, k);

            // Otherwise, recurse on the right subarray
            return kthSmallest(arr, index + 1, high, k - index + low - 1);
        }

        return Integer.MAX_VALUE;  // If k is out of bounds
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 19};
        int n = arr.length;
        int k = 2;  // Looking for the 2nd smallest element

        System.out.println("Kth smallest element is " + kthSmallest(arr, 0, n - 1, k));
    }
}
