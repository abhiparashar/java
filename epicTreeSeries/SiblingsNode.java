
// Java program to check if two nodes
// are siblings

class GFG {

  // Binary Tree Node
  static class Node {
    int data;
    Node left, right;
  };

  // Utility function to create a
  // new node
  static Node newNode(int data) {
    Node node = new Node();
    node.data = data;
    node.left = node.right = null;

    return (node);
  }

  static Node root = null;

  // Function to find out if two nodes are siblings
  public static boolean CheckIfNodesAreSiblings(Node root, int data_one, int data_two) {
    boolean ans = false;
    return ans;
  }

  // Driver code
  public static void main(String[] args) {
    root = newNode(1);
    root.left = newNode(2);
    root.right = newNode(3);
    root.left.left = newNode(4);
    root.right.left = newNode(5);
    root.right.right = newNode(6);
    root.left.left.right = newNode(7);

    int data_one = 5;
    int data_two = 6;

    if (CheckIfNodesAreSiblings(root, data_one,
        data_two))
      System.out.print("YES");
    else
      System.out.print("NO");
  }
}