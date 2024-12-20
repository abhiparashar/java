package tree_prac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

//Definition for a binary tree node.
public class ReverseOddLevels {
  int val;
  ReverseOddLevels left;
  ReverseOddLevels right;

  ReverseOddLevels() {
  }

  ReverseOddLevels(int val) {
    this.val = val;
  }

  ReverseOddLevels(int val, ReverseOddLevels left, ReverseOddLevels right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

class Solution {
  public ReverseOddLevels reverseOddLevels(ReverseOddLevels root) {
    if (root == null)
      return root;
    Queue<ReverseOddLevels> q = new LinkedList<>();
    int level = 0;
    q.add(root);
    while (!q.isEmpty()) {
      int size = q.size();
      for (int i = 0; i < size; i++) {
        ReverseOddLevels temp = q.remove();
        ArrayList<ReverseOddLevels> ans = new ArrayList<>();
        if (level % 2 == 0) {
          if (temp.left != null) {
            q.add(temp.left);
          }
          if (temp.right != null) {
            q.add(temp.right);
          }
        } else {
          if (temp.left != null) {
            ans.add(temp.left);
          }
          if (temp.right != null) {
            ans.add(temp.right);
          }
          Collections.reverse(ans);
          q.addAll(ans);
        }
      }
    }
    return root;
  }
}