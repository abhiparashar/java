package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

// Definition for a binary tree node.
public class VerticalTraversal {
    int val;
    VerticalTraversal left;
    VerticalTraversal right;

    VerticalTraversal() {
    }

    VerticalTraversal(int val) {
        this.val = val;
    }

    VerticalTraversal(int val, VerticalTraversal left, VerticalTraversal right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public List<List<Integer>> verticalTraversal(VerticalTraversal root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null)
            return ans;

        // Use TreeMap to automatically sort vertical levels
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();

        // Queue to store node, vertical level, and row
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0, 0)); // Added row parameter

        while (!q.isEmpty()) {
            int size = q.size();
            // Temporary map to handle nodes at same vertical level
            Map<Integer, List<Integer>> levelMap = new HashMap<>();

            for (int i = 0; i < size; i++) {
                Pair pair = q.remove();
                VerticalTraversal node = pair.n;
                int vertlevel = pair.vertlevel;
                int row = pair.row;

                // Use levelMap to group nodes at same vertical level
                levelMap.putIfAbsent(vertlevel, new ArrayList<>());
                levelMap.get(vertlevel).add(node.val);

                if (node.left != null) {
                    q.add(new Pair(node.left, vertlevel - 1, row + 1));
                }
                if (node.right != null) {
                    q.add(new Pair(node.right, vertlevel + 1, row + 1));
                }
            }

            // Sort and merge nodes at each vertical level
            for (int vertLevel : levelMap.keySet()) {
                List<Integer> levelList = levelMap.get(vertLevel);
                Collections.sort(levelList);

                map.putIfAbsent(vertLevel, new ArrayList<>());
                map.get(vertLevel).addAll(levelList);
            }
        }

        // Convert to final answer list
        return new ArrayList<>(map.values());
    }

    // Inner class for storing node with vertical level and row
    class Pair {
        VerticalTraversal n;
        int vertlevel;
        int row;

        Pair(VerticalTraversal n, int vertlevel, int row) {
            this.n = n;
            this.vertlevel = vertlevel;
            this.row = row;
        }
    }
}