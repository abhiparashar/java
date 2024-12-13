package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class GoodIntegers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();
        System.out.println(countGoodIntegers(arr));
    }

    public static int countGoodIntegers(int[] arr) {
        int count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i) {
                count++;
            }
        }
        return count;
    }
}
