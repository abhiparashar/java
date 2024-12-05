package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//Definition for a binary tree node.
public class ReverseLevelOrderTraversal {
    int val;
    ReverseLevelOrderTraversal left;
    ReverseLevelOrderTraversal right;

    ReverseLevelOrderTraversal() {
    }

    ReverseLevelOrderTraversal(int val) {
        this.val = val;
    }

    ReverseLevelOrderTraversal(int val, ReverseLevelOrderTraversal left, ReverseLevelOrderTraversal right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public List<List<Integer>> levelOrderBottom(ReverseLevelOrderTraversal root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null)
            return ans;
        Queue<ReverseLevelOrderTraversal> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int n = q.size();
            List<Integer> ls = new ArrayList<>();
            while (n > 0) {
                ReverseLevelOrderTraversal temp = q.remove();
                ls.add(temp.val);
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
                n--;
            }
            ans.add(ls);
        }
        Collections.reverse(ans);
        return ans;
    }
}