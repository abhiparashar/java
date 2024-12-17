package sortLevelUp;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 18, 14, 6, 3, 11, 8, 23, 20, 31, 27 };
        int s = 0;
        int e = arr.length - 1;
        quicksort(arr, s, e);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quicksort(int[] arr, int s, int e) {
        if (s >= e)
            return;
        int p = rearrange(arr, s, e);
        quicksort(arr, s, p - 1);
        quicksort(arr, p + 1, e);
    }

    public static int rearrange(int[] arr, int start, int end) {
        int p1 = start + 1;
        int p2 = end;
        while (p1 <= p2) {
            if (arr[start] >= arr[p1]) {
                p1++;
            } else if (arr[p2] > arr[start]) {
                p2--;
            } else {
                int temp = arr[p2];
                arr[p2] = arr[p1];
                arr[p1] = temp;
            }
        }
        if (arr[p2] < arr[start]) {
            int temp = arr[p2];
            arr[p2] = arr[start];
            arr[start] = temp;
        }
        return p2;
    }
}
