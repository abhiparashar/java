package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class OrderOfRemovel {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(orderOfRemoval(arr));
        scn.close();
    }

    public static int orderOfRemoval(int[] arr) {
        int ans = 0;
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i] * (n - i);
            ans = ans + temp;
        }
        return ans;
    }
}
