package tree_prac;

//Definition for a binary tree node.
public class IsSameTree {
  int val;
  IsSameTree left;
  IsSameTree right;

  IsSameTree() {
  }

  IsSameTree(int val) {
    this.val = val;
  }

  IsSameTree(int val, IsSameTree left, IsSameTree right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

class Solution {
  public boolean isSameTree(IsSameTree p, IsSameTree q) {
    boolean ans;
    if (p == null && q == null)
      return true;
    if ((p == null && q != null) || (q == null && p != null))
      return false;
    if (p.val == q.val) {
      ans = true;
    } else {
      ans = false;
    }
    boolean x = isSameTree(p.left, q.left);
    boolean y = isSameTree(p.right, q.right);
    return ans && x && y;
  }
}