package binarySearch;

public class FirstAndLastOccurance {
    public static void main(String[] args) {
        int arr[] = { 5, 7, 7, 8, 8, 10 };
        int res[] = new int[2];
        int first = findFirstAndLastElem(arr, 8, true);
        int last = findFirstAndLastElem(arr, 8, false);
        res[0] = first;
        res[1] = last;
        System.out.println("First occurance is:" + res[0]);
        System.out.println("Last occurance is:" + res[1]);
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
