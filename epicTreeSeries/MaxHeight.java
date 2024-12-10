
//Definition for a binary tree node.
public class MaxHeight {
    int val;
    MaxHeight left;
    MaxHeight right;

    MaxHeight() {
    }

    MaxHeight(int val) {
        this.val = val;
    }

    MaxHeight(int val, MaxHeight left, MaxHeight right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public int maxDepth(MaxHeight root) {
        if (root == null)
            return 0;
        int leftHeight = maxDepth(root.left);
        int rigthHeight = maxDepth(root.right);
        int ans = Math.max(leftHeight, rigthHeight) + 1;
        return ans;
    }
}