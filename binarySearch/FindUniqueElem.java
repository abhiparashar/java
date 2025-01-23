package binarySearch;

public class FindUniqueElem {
    public static void main(String[] args) {
        int arr[] = { 4, 4, 1, 1, 9, 9, 11, 11, 20, 7, 7, 3, 3, 5, 5 };
        int ans = findUniqueNum(arr);
        System.out.println(ans);
    }

    public static int findUniqueNum(int arr[]) {
        int ans = -1;
        int start = 2;
        int n = arr.length;
        int end = n - 3;
        if (arr[0] != arr[1]) {
            return arr[0];
        }
        if (arr[n - 1] != arr[n - 2]) {
            return arr[n - 1];
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                return arr[mid];
            }
            if (arr[mid] == arr[mid - 1]) {
                mid--;
            }
            if (mid % 2 == 0) {
                start = mid + 2;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
