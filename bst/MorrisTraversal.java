package bst;

import java.util.ArrayList;

class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Node curr = root;
        while (curr != null) {
            if (curr.left == null) {
                ans.add(curr.data);
                curr = curr.right;
            } else {
                Node curr1 = curr.left;
                while (curr1.right != null && curr1.right != curr) {
                    curr1 = curr1.right;
                }
                if (curr1.right == null) {
                    curr1.right = curr;
                    curr = curr.left;
                } else {
                    curr1.right = null;
                    ans.add(curr.data);
                    curr = curr.right;
                }
            }
        }
        return ans;
    }
}