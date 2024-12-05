package tree;

//Definition for a binary tree node.
public class SizeOfTree {
  int val;
  SizeOfTree left;
  SizeOfTree right;

  SizeOfTree() {
  }

  SizeOfTree(int val) {
    this.val = val;
  }

  SizeOfTree(int val, SizeOfTree left, SizeOfTree right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

class Solution {
  public int countNodes(SizeOfTree root) {
    if (root == null)
      return 0;
    int x = countNodes(root.left);
    int y = countNodes(root.right);
    return x + y + 1;
  }

}