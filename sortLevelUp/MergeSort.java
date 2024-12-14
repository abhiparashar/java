package sortLevelUp;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 8, 2, 3, 10, 6, 17, 12, 18, 15 };
        int l = 0;
        int r = arr.length - 1;
        mergeSort(arr, l, r);
        // Print the final sorted array
        for (int i : arr) {
            System.out.print(i + ",");
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left == right)
            return;
        int m = left + (right - left) / 2;
        mergeSort(arr, left, m);
        mergeSort(arr, m + 1, right);
        merge(arr, left, m, right);
    }

    public static void merge(int[] arr, int l, int m, int r) {
        int[] arr1 = new int[r - l + 1];
        int p1 = l;
        int p2 = m + 1;
        int p3 = 0;
        while (p1 <= m && p2 <= r) {
            if (arr[p1] < arr[p2]) {
                arr1[p3] = arr[p1];
                p1++;
                p3++;
            } else {
                arr1[p3] = arr[p2];
                p2++;
                p3++;
            }
        }
        while (p1 <= m) {
            arr1[p3] = arr[p1];
            p1++;
            p3++;
        }
        while (p2 <= r) {
            arr1[p3] = arr[p2];
            p2++;
            p3++;
        }
        // Copy the merged elements back into the original array
        for (int i = 0; i < arr1.length; i++) {
            arr[l] = arr1[i];
            l++;
        }
    }
}
