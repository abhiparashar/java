package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseeKElems {
    public static void main(String[] args) {
        int k = 4;
        Queue<Integer> q = new LinkedList<>();
        int[] arr = { 3, 10, 2, 12, 19, 6, 8, 10, 14 };
        for (int i = 0; i < arr.length; i++) {
            q.add(arr[i]);
        }
        Queue<Integer> ans = reverseElems(q, k);
        for (Integer elem : ans) {
            System.out.print(elem + ",");
        }
    }

    public static Queue<Integer> reverseElems(Queue<Integer> q, int k) {
        int n = q.size();
        Stack<Integer> st = new Stack<>();
        // Check if k is valid
        if (q == null || k <= 0 || k > q.size()) {
            return q;
        }
        // insert in stack
        for (int i = 0; i < k; i++) {
            st.push(q.remove());
        }
        // put them in queue
        for (int i = 0; i < k; i++) {
            q.add(st.pop());
        }
        // Reorder the lemes
        for (int i = 0; i < n - k; i++) {
            int temp = q.remove();
            q.add(temp);
        }

        return q;
    }
}
