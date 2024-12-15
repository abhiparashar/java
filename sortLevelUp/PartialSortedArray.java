package sortLevelUp;

public class PartialSortedArray {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 10, 14, 20, 4 };
        sortPartialArray(arr);
    }

    public static void sortPartialArray(int[] arr) {
        int n = arr.length;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
