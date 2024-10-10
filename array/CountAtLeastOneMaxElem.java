import java.util.Scanner;

public class CountAtLeastOneMaxElem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int start = 0;
        int end = arr.length - 1;
        int count = 0;
        int maxVal = findMax(arr, start, end);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < maxVal) {
                count++;
            }
        }
        System.out.println(count);
        scn.close();
    }

    public static int findMax(int[] arr, int start, int end) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}