import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//Definition for a binary tree node.
public class RightView {
    int val;
    RightView left;
    RightView right;

    RightView() {
    }

    RightView(int val) {
        this.val = val;
    }

    RightView(int val, RightView left, RightView right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class SolutionOfRightView {
    public List<Integer> rightSideView(RightView root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;
        Queue<RightView> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            while (size > 0) {
                RightView temp = q.remove();
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
                size--;
                if (size == 0) {
                    ans.add(temp.val);
                }
            }
        }
        return ans;
    }
}