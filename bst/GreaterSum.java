package bst;

//Definition for a binary tree node.
public class GreaterSum {
    int val;
    GreaterSum left;
    GreaterSum right;

    GreaterSum() {
    }

    GreaterSum(int val) {
        this.val = val;
    }

    GreaterSum(int val, GreaterSum left, GreaterSum right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    int greater = 0;

    public GreaterSum bstToGst(GreaterSum root) {
        helper(root);
        return root;
    }

    public void helper(GreaterSum root) {
        if (root == null)
            return;
        helper(root.right);
        greater = greater + root.val;
        root.val = greater;
        helper(root.left);
    }
}