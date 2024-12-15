package sortLevelUp;

import java.io.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++)
                arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().inversionCount(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends

// User function Template for Java

class Solution {
    // Function to count inversions in the array.
    static int count;

    int inversionCount(int arr[]) {
        count = 0;
        int s = 0;
        int e = arr.length - 1;
        mergeSort(arr, s, e);
        return count;
    }

    public static void mergeSort(int[] arr, int s, int e) {
        if (s == e)
            return;
        int m = s + (e - s) / 2;
        mergeSort(arr, s, m);
        mergeSort(arr, m + 1, e);
        merge(arr, s, e, m);
    }

    public static void merge(int[] arr, int start, int end, int mid) {
        int[] temp = new int[end - start + 1];
        int p1 = start;
        int p2 = mid + 1;
        int p3 = 0;
        while (p1 <= mid && p2 <= end) {
            if (arr[p1] <= arr[p2]) {
                temp[p3] = arr[p1];
                p3++;
                p1++;
            } else {
                count = count + mid - p1 + 1;
                temp[p3] = arr[p2];
                p3++;
                p2++;
            }
        }
        while (p1 <= mid) {
            temp[p3] = arr[p1];
            p3++;
            p1++;
        }
        while (p2 <= end) {
            temp[p3] = arr[p2];
            p3++;
            p2++;
        }
        for (int i = 0; i < temp.length; i++) {
            arr[start] = temp[i];
            start++;
        }
    }
}