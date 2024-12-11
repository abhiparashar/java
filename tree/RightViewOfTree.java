package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//Definition for a binary tree node.
public class RightViewOfTree {
    int val;
    RightViewOfTree left;
    RightViewOfTree right;

    RightViewOfTree() {
    }

    RightViewOfTree(int val) {
        this.val = val;
    }

    RightViewOfTree(int val, RightViewOfTree left, RightViewOfTree right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class SolutionOfRightViewOfTree {
    public List<Integer> rightSideView(RightViewOfTree root) {
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return list;
        Queue<RightViewOfTree> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 1; i <= size; i++) {
                RightViewOfTree temp = q.remove();
                if (i == size) {
                    list.add(temp.val);
                }
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
        }
        return list;
    }
}