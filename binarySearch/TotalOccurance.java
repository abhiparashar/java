package binarySearch;

public class TotalOccurance {
    public static void main(String[] args) {
        int arr[] = { 4, 4, 8, 8, 8, 15, 16, 23, 23, 42 };
        int first = findFirstAndLastElem(arr, 8, true);
        int last = findFirstAndLastElem(arr, 8, false);
        if (first == -1) {
            System.out.println("Total count is 0");
        } else {
            System.out.println("Total count is " + (last - first + 1));
        }
    }

    public static int findFirstAndLastElem(int arr[], int target, boolean isfirst) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                if (isfirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
