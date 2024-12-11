//Definition for a binary tree node.

import java.util.LinkedList;
import java.util.Queue;

public class MaxDepthBFS {
  int val;
  MaxDepthBFS left;
  MaxDepthBFS right;

  MaxDepthBFS() {
  }

  MaxDepthBFS(int val) {
    this.val = val;
  }

  MaxDepthBFS(int val, MaxDepthBFS left, MaxDepthBFS right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

class SolutionOfMaxDepthBFS {
  public int maxDepth(MaxDepthBFS root) {
    if (root == null)
      return 0;
    int count = 0;
    Queue<MaxDepthBFS> q = new LinkedList<>();
    q.add(root);
    while (!q.isEmpty()) {
      int size = q.size();
      while (size > 0) {
        MaxDepthBFS temp = q.remove();
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