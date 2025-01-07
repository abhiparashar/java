package bst;

//Definition for a binary tree node.
public class InsertIntoBST {
    int val;
    InsertIntoBST left;
    InsertIntoBST right;

    InsertIntoBST() {
    }

    InsertIntoBST(int val) {
        this.val = val;
    }

    InsertIntoBST(int val, InsertIntoBST left, InsertIntoBST right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public InsertIntoBST insertIntoBST(InsertIntoBST root, int val) {
        InsertIntoBST n = new InsertIntoBST(val);
        if (root == null)
            return n;

        InsertIntoBST current = root;
        while (true) {
            if (current.val > val) {
                if (current.left == null) {
                    current.left = n;
                    break;
                } else {
                    current = current.left;
                }
            } else {
                if (current.right == null) {
                    current.right = n;
                    break;
                } else {
                    current = current.right;
                }
            }
        }
        return root;
    }
}
