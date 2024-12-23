package easy;

import java.util.Arrays;

class majorityElement {
  public static void main(String[] args) {
    int[] nums = { 2, 2, 1, 1, 1, 2, 2, 4, 4, 3, 3 };
    int ans = getMaxNums(nums);
    System.out.println(ans);
  }

  public static int getMaxNums(int[] nums) {
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + " ");
    }
    int n = nums.length;
    int ans = nums[n / 2];
    return ans;
  }
}