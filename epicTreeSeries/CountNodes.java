import java.util.*;
import java.io.*;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int val) {
    this.val = val;
    left = null;
    right = null;
  }
}

class GFG {
  public static void main(String[] args) throws IOException {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      int[] v = new int[n];
      for (int i = 0; i < n; i++) {
        v[i] = sc.nextInt();
      }
      TreeNode root = new TreeNode(v[0]);
      int cnt = 0;
      Queue<TreeNode> q = new LinkedList<>();
      q.add(root);
      TreeNode cur = null;
      for (int i = 1; i < n; i++) {
        TreeNode node = new TreeNode(v[i]);
        if (cnt == 0) {
          cur = q.peek();
          q.poll();
        }
        if (cnt == 0) {
          cnt++;
          cur.left = node;
        } else {
          cnt = 0;
          cur.right = node;
        }
        if (v[i] >= 0) {
          q.add(node);
        }
      }

      Solution obj = new Solution();
      @SuppressWarnings("static-access")
      int ans = obj.countNodes(root);
      System.out.println(ans);
    }
  }
}

class Solution {
  public static int countNodes(TreeNode root) {
    if (root == null)
      return 0;
    int l = countNodes(root.left);
    int r = countNodes(root.right);
    return l + r + 1;
  }
}