package tree;

import java.util.ArrayList;
import java.util.List;

//Definition for a binary tree node.*
//PostOrderTraversal is Node basically
public class PostOrderTraversal {
  int val;
  PostOrderTraversal left;
  PostOrderTraversal right;

  PostOrderTraversal() {
  }

  PostOrderTraversal(int val) {
    this.val = val;
  }

  PostOrderTraversal(int val, PostOrderTraversal left, PostOrderTraversal right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

class SolutionOfPostOrderTraversal {
  public List<Integer> postorderTraversal(PostOrderTraversal root) {
    List<Integer> list = new ArrayList<>();
    postHelper(root, list);
    return list;
  }

  public static void postHelper(PostOrderTraversal root, List<Integer> list) {
    if (root == null)
      return;
    postHelper(root.left, list);
    postHelper(root.right, list);
    list.add(root.val);
  }
}