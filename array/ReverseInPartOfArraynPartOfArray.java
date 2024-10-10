import java.util.Scanner;

public class ReverseInPartOfArraynPartOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int start = scn.nextInt();
        int end = scn.nextInt();
        reverseInPart(arr, start, end);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        scn.close();
    }

    static void reverseInPart(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
