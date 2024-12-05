package tree;

//Definition for a binary tree node.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    int val;
    LevelOrderTraversal left;
    LevelOrderTraversal right;

    LevelOrderTraversal() {
    }

    LevelOrderTraversal(int val) {
        this.val = val;
    }

    LevelOrderTraversal(int val, LevelOrderTraversal left, LevelOrderTraversal right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public List<List<Integer>> levelOrder(LevelOrderTraversal root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null)
            return ans;

        Queue<LevelOrderTraversal> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int n = q.size();
            List<Integer> ls = new ArrayList<>();

            while (n > 0) {
                LevelOrderTraversal temp = q.remove();
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
        return ans;
    }
}
