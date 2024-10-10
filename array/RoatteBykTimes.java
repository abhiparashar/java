import java.util.Scanner;

public class RoatteBykTimes {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int start = 0;
        int end = arr.length - 1;
        int k = scn.nextInt();
        k = k % n;
        // step-1
        reverseArr(arr, start, end);
        // step-2
        reverseArr(arr, 0, k - 1);
        // step-3
        reverseArr(arr, k, n - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        scn.close();
    }

    public static void reverseArr(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}