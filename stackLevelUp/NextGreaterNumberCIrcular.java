package stackLevelUp;

//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.io.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter ot = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String inputLine[] = br.readLine().trim().split(" ");
            long[] arr = new long[n];
            for (int i = 0; i < n; i++)
                arr[i] = Long.parseLong(inputLine[i]);
            Solution ob = new Solution();
            long[] res = ob.nextLargerElement(arr, n);
            for (int i = 0; i < n; i++)
                ot.print(res[i] + " ");
            ot.println();
        }
        ot.close();
    }
}

// } Driver Code Ends

// User Function Template for JAVA

class Solution {
    public long[] nextLargerElement(long[] arr, int n) {
        Stack<Integer> st = new Stack<>();
        long[] ans = new long[n];
        for (int i = 0; i < 2 * n; i++) {
            while (st.size() > 0 && arr[i % n] > arr[st.peek()]) {
                int idx = st.pop();
                ans[idx] = arr[i % n];
            }
            if (i < n) { // Only push indices in the first pass
                st.push(i);
            }
        }
        while (st.size() > 0) {
            int idx = st.pop();
            ans[idx] = -1;
        }
        return ans;
    }
}