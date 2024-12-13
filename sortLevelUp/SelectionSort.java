package sortLevelUp;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 2, 8, 4, -1, 7, 10, 5, 6 };
        sortedArr(arr);
    }

    public static void sortedArr(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minElem = arr[i];
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < minElem) {
                    minElem = arr[j];
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
