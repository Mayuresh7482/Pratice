public class FindDuplicateBruteforcemethod {
    public static void main(String[] args) {
        int[] arr = { 12, 25, 3, 6, 1, 2, 3 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] == arr[j]) && (i != j)) {
                    System.out.print(arr[j] + " ");
                }
            }
        }
    }
}
 //  not used because of time Complexicity