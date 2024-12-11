class Solution {
  public static int countNodes(Node root) {
    if (root == null)
      return 0;
    int l = countNodes(root.left);
    int r = countNodes(root.right);
    return l + r + 1;
  }
}