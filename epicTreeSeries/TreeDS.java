import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TreeDS {
    class TreeNode<T> {
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        public TreeNode(T data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {

    }

    @SuppressWarnings({ "rawtypes" })
    public ArrayList<Integer> BFS(TreeNode<Integer> root) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode temp = q.remove();
            list.add((Integer) temp.data);
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
        return list;
    }
}
