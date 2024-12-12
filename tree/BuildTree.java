package tree;

import java.util.HashMap;

//Definition for a binary tree node.
public class BuildTree {
    int val;
    BuildTree left;
    BuildTree right;

    BuildTree() {
    }

    BuildTree(int val) {
        this.val = val;
    }

    BuildTree(int val, BuildTree left, BuildTree right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    HashMap<Integer, Integer> map;

    public BuildTree buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;
        map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(inorder[i], i);
        }
        return construct(preorder, 0, n - 1, inorder, 0, n - 1);
    }

    public BuildTree construct(int[] pre, int ps, int pe, int[] in, int is, int ie) {
        if (ps > pe || is > ie)
            return null;

        BuildTree root = new BuildTree(pre[ps]);
        int idx = map.get(pre[ps]);

        int count = idx - is;
        root.left = construct(pre, ps + 1, ps + count, in, is, idx - 1);
        root.right = construct(pre, ps + count + 1, pe, in, idx + 1, ie);

        return root;
    }
}
