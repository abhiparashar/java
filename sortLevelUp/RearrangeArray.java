package sortLevelUp;

public class RearrangeArray {
    public static void main(String[] args) {
        int[] arr = { 10, 3, 8, 15, 6, 12, 2, 18, 7, 15, 14 };
        int p1 = arr[1];
        int p2 = arr.length - 1;
        while (p1 <= p2) {
            if (arr[0] >= arr[p1]) {
                p1++;
            } else if (arr[p2] > arr[0]) {
                p2--;
            } else {
                int temp = arr[p2];
                arr[p2] = arr[p1];
                arr[p1] = temp;
                p1++;
                p2--;
            }
        }
        if (arr[0] > arr[p2]) {
            int temp = arr[p2];
            arr[p2] = arr[0];
            arr[0] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
