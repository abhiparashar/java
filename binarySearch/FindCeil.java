package binarySearch;

public class FindCeil {
    public static void main(String[] args) {
        int arr[] = { 4, 4, 8, 8, 8, 15, 16, 23, 23, 42 };
        int target = 17;
        int ceil = findCeilVal(arr, target);
        System.out.println("Ceiling: " + ceil);
    }

    public static int findCeilVal(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1; // Default value if no ceiling exists
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid]; // Exact match found
            } else if (arr[mid] > target) {
                ans = arr[mid]; // Update potential ceiling
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
