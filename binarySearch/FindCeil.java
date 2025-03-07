package binarySearch;

public class FindCeil {
    public static void main(String[] args) {
        int arr[] = { 4, 4, 8, 8, 8, 15, 16, 23, 23, 42 };
        int target = 17;
        int ans = findCeil(arr, target);
        System.out.println(ans);
    }

    public static int findCeil(int arr[], int target) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                ans = arr[mid];
                end = mid - 1;
            }
        }
        return ans;
    }
}
