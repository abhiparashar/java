package bst;

import java.util.ArrayList;

//Definition for a binary tree node.
public class TwoSum {
    int val;
    TwoSum left;
    TwoSum right;

    TwoSum() {
    }

    TwoSum(int val) {
        this.val = val;
    }

    TwoSum(int val, TwoSum left, TwoSum right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public boolean findTarget(TwoSum root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        inOrderTraversal(root, list);
        int start = 0;
        int end = list.size() - 1;
        while (start < end) {
            int sum = list.get(start) + list.get(end);
            if (sum == k) {
                return true;
            }
            if (sum < k) {
                start++;
            } else {
                end--;
            }
        }
        return false;
    }

    public void inOrderTraversal(TwoSum root, ArrayList<Integer> list) {
        if (root == null)
            return;
        inOrderTraversal(root.left, list);
        list.add(root.val);
        inOrderTraversal(root.right, list);
    }
}