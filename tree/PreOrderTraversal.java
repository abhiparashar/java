package tree;

import java.util.ArrayList;
import java.util.List;

//Definition for a binary tree node.
// PreOrderTraversal is basically TreeNode
public class PreOrderTraversal {
  int val;
  PreOrderTraversal left;
  PreOrderTraversal right;

  PreOrderTraversal() {
  }

  PreOrderTraversal(int val) {
    this.val = val;
  }

  PreOrderTraversal(int val, PreOrderTraversal left, PreOrderTraversal right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

class SolutionOfPreOrderTraversal {
  public List<Integer> preorderTraversal(PreOrderTraversal root) {
    List<Integer> arr = new ArrayList<>();
    preHelper(root, arr);
    return arr;
  }

  public static void preHelper(PreOrderTraversal root, List<Integer> arr) {
    if (root == null)
      return;
    arr.add(root.val);
    preHelper(root.left, arr);
    preHelper(root.right, arr);
  }
}