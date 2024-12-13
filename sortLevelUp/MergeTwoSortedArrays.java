package sortLevelUp;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = { 7, 10, 11, 14 };
        int[] arr2 = { 3, 8, 9 };
        mergeTwoSortedArrays(arr1, arr2);
    }

    public static void mergeTwoSortedArrays(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] arr3 = new int[n + m];
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        while (p1 < n && p2 < m) {
            if (arr1[p1] > arr2[p2]) {
                arr3[p3] = arr2[p2];
                p2++;
                p3++;
            } else {
                arr3[p3] = arr1[p1];
                p1++;
                p3++;
            }
        }
        while (p1 < n) {
            arr3[p3] = arr1[p1];
            p3++;
            p1++;
        }
        while (p2 < m) {
            arr3[p3] = arr2[p2];
            p3++;
            p2++;
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + ",");
        }
    }
}
