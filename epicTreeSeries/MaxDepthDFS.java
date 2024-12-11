
//Definition for a binary tree node.
public class MaxDepthDFS {
  int val;
  MaxDepthDFS left;
  MaxDepthDFS right;

  MaxDepthDFS() {
  }

  MaxDepthDFS(int val) {
    this.val = val;
  }

  MaxDepthDFS(int val, MaxDepthDFS left, MaxDepthDFS right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

class SolutionOfMaxDepthDFS {
  public int maxDepth(MaxDepthDFS root) {
    // base case
    if (root == null)
      return 0;
    int left = maxDepth(root.left);
    int right = maxDepth(root.right);
    return Math.max(left, right) + 1;
  }
}