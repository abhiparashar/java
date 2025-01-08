package bst;

//Definition for a binary tree node.
public class RecoverBST {
    int val;
    RecoverBST left;
    RecoverBST right;

    RecoverBST() {
    }

    RecoverBST(int val) {
        this.val = val;
    }

    RecoverBST(int val, RecoverBST left, RecoverBST right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    RecoverBST first, second, prev;

    public void recoverTree(RecoverBST root) {
        first = second = prev = null;
        inorder(root);
        int t = first.val;
        first.val = second.val;
        second.val = t;
    }

    public void inorder(RecoverBST curr) {
        if (curr == null)
            return;
        inorder(curr.left);
        if (prev != null && prev.val > curr.val && first == null) {
            first = prev;
            second = curr;
        } else if (prev != null && curr.val < prev.val && first != null) {
            second = curr;
        }
        prev = curr;
        inorder(curr.right);
    }
}