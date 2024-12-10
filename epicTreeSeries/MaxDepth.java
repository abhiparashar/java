//Definition for a binary tree node.

import java.util.LinkedList;
import java.util.Queue;

public class MaxDepth {
  int val;
  MaxDepth left;
  MaxDepth right;

  MaxDepth() {
  }

  MaxDepth(int val) {
    this.val = val;
  }

  MaxDepth(int val, MaxDepth left, MaxDepth right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

class Solution {
  public int maxDepth(MaxDepth root) {
    if (root == null)
      return 0;
    int count = 0;
    Queue<MaxDepth> q = new LinkedList<>();
    q.add(root);
    while (!q.isEmpty()) {
      int size = q.size();
      while (size > 0) {
        MaxDepth temp = q.remove();
        if (temp.left != null) {
          q.add(temp.left);
        }
        if (temp.right != null) {
          q.add(temp.right);
        }
        size--;
      }
      count++;
    }
    return count;
  }
}