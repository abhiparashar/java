package tree;

import java.util.ArrayList;
import java.util.List;

//Definition for a binary tree node.
// InOrderTraversal is basically Node
public class InOrderTraversal {
  int val;
  InOrderTraversal left;
  InOrderTraversal right;

  InOrderTraversal() {
  }

  InOrderTraversal(int val) {
    this.val = val;
  }

  InOrderTraversal(int val, InOrderTraversal left, InOrderTraversal right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

class SolutionOfInOrderTraversal {
  public List<Integer> inorderTraversal(InOrderTraversal root) {
    List<Integer> list = new ArrayList<>();
    inorderHelper(root, list);
    return list;
  }

  public static void inorderHelper(InOrderTraversal root, List<Integer> list) {
    if (root == null)
      return;
    inorderHelper(root.left, list);
    list.add(root.val);
    inorderHelper(root.right, list);
  }
}