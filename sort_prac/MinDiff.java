package sort_prac;

import java.util.Arrays;

class Solution {
  public int minimumDifference(int[] nums, int k) {
    if (k == 1)
      return 0; // If k is 1, the minimum difference is 0.

    Arrays.sort(nums); // Sort the array to simplify finding subsets with minimal range.

    int minDiff = Integer.MAX_VALUE;

    // Iterate over windows of size k
    for (int i = 0; i <= nums.length - k; i++) {
      int diff = nums[i + k - 1] - nums[i]; // Difference between the max and min in this window
      minDiff = Math.min(minDiff, diff); // Update the minimum difference
    }

    return minDiff;
  }
}
