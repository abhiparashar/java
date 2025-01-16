package bst;

//Definition for a binary tree node.
public class KthSmallestInBST {
    int val;
    KthSmallestInBST left;
    KthSmallestInBST right;

    KthSmallestInBST() {
    }

    KthSmallestInBST(int val) {
        this.val = val;
    }

    KthSmallestInBST(int val, KthSmallestInBST left, KthSmallestInBST right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public int kthSmallest(KthSmallestInBST root, int k) {
        KthSmallestInBST current = root;
        int count = 0;
        while (current != null) {
            if (current.left == null) {
                count++;
                if (count == k) {
                    return current.val;
                }
                current = current.right;
            } else {
                KthSmallestInBST predecessor = current.left;
                while (predecessor.right != null && predecessor.right != current) {
                    predecessor = predecessor.right;
                }
                if (predecessor.right == null) {
                    predecessor.right = current;
                    current = current.left;
                } else {
                    predecessor.right = null;
                    count++;
                    if (count == k) {
                        return current.val;
                    }
                    current = current.right;
                }
            }
        }
        return -1;
    }
}