public class InplaceRotateMatrix {
    public static void InplaceRotateMatrixAnticlockwise(int[][] arr, int n) {
        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Step 2: Reverse each column to get the 90 degrees anticlockwise rotation
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = arr[j][i];
                arr[j][i] = arr[n - 1 - j][i];
                arr[n - 1 - j][i] = temp;
            }
        }
    }

    // Function to print the matrix
    public static void printMatrix(int[][] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int n = matrix.length;

        System.out.println("Original Matrix:");
        printMatrix(matrix, n);

        InplaceRotateMatrixAnticlockwise(matrix, n);

        System.out.println("Matrix after 90 degrees anticlockwise rotation:");
        printMatrix(matrix, n);
    }
}
