
//Definition for a binary tree node.

import java.util.LinkedList;
import java.util.Queue;

public class IsCousins {
  int val;
  TreeNode left;
  TreeNode right;

  IsCousins() {
  }

  IsCousins(int val) {
    this.val = val;
  }

  IsCousins(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

class Solution {
  public boolean isCousins(TreeNode root, int x, int y) {
    if (root == null)
      return false;

    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);

    while (!q.isEmpty()) {
      int size = q.size();
      boolean foundX = false;
      boolean foundY = false;

      for (int i = 0; i < size; i++) {
        TreeNode temp = q.remove();

        // Check if current node's children are x and y
        if (temp.left != null && temp.right != null) {
          if ((temp.left.val == x && temp.right.val == y) ||
              (temp.left.val == y && temp.right.val == x)) {
            return false; // Same parent, not cousins
          }
        }

        // Add children to queue and check for x and y
        if (temp.left != null) {
          q.add(temp.left);
          if (temp.left.val == x)
            foundX = true;
          if (temp.left.val == y)
            foundY = true;
        }

        if (temp.right != null) {
          q.add(temp.right);
          if (temp.right.val == x)
            foundX = true;
          if (temp.right.val == y)
            foundY = true;
        }
      }

      // If both x and y are found at the same level, they are cousins
      if (foundX && foundY) {
        return true;
      }
    }

    return false;
  }
}