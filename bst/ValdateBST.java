package bst;

//Definition for a binary tree node.
public class ValdateBST {
    int val;
    ValdateBST left;
    ValdateBST right;

    ValdateBST() {
    }

    ValdateBST(int val) {
        this.val = val;
    }

    ValdateBST(int val, ValdateBST left, ValdateBST right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public boolean isValidBST(ValdateBST root) {
        return isBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static boolean isBST(ValdateBST root, long min, long max) {
        if (root == null)
            return true;
        long rval = root.val;
        if (rval < min || rval > max)
            return false;
        boolean l = isBST(root.left, min, rval - 1);
        boolean r = isBST(root.right, rval + 1, max);
        if (l == false || r == false)
            return false;
        return true;
    }
}