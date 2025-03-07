/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

import java.util.LinkedList;
import java.util.Queue;

class SolutionOfMaxDepthOfNarray {
    public int maxDepth(Node root) {
        int levelCount = 0;
        if (root == null)
            return 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            while (size > 0) {
                Node temp = q.remove();
                for (Node elem : temp.children) {
                    q.add(elem);
                }
                size--;
            }
            levelCount++;
        }
        return levelCount;
    }
}