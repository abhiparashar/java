package sortLevelUp;

public class MergeTwoSortedSubArrays {
    public static void main(String[] args) {
        int[] arr = { 4, 8, -1, 2, 6, 9, 11, 3, 4, 7, 13, 0 };
        int s = 2;
        int m = 6;
        int e = 9;
        mergeTwoSortedArrays(arr, s, m, e);
    }

    public static void mergeTwoSortedArrays(int[] arr, int s, int m, int e) {
        int[] arr1 = new int[e - s + 1];
        int p1 = s;
        int p2 = m + 1;
        int p3 = 0;
        while (p1 <= m && p2 <= e) {
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
        while (p2 <= e) {
            arr1[p3] = arr[p2];
            p2++;
            p3++;
        }
        for (int i = 0; i < arr1.length; i++) {
            arr[s] = arr1[i];
            s++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}