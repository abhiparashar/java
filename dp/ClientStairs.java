package dp;

import java.util.Arrays;

class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return climbStairsHelper(dp, n);
    }

    public int climbStairsHelper(int[] dp, int n) {
        if (n == 1 || n == 2)
            return n;
        if (dp[n] != -1) {
            return dp[n];
        }
        int x = climbStairsHelper(dp, n - 1);
        int y = climbStairsHelper(dp, n - 2);
        dp[n] = x + y;
        return dp[n];
    }
}