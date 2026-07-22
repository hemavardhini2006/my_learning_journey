import java.util.*;
import java.util.LinkedList;
class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

class Pair {
    TreeNode node;
    int hd;

    Pair(TreeNode node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}

class Solution {

    public ArrayList<Integer> topView(TreeNode root) {

        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null)
            return ans;

        TreeMap<Integer, Integer> map = new TreeMap<>();

        Queue<Pair> queue = new LinkedList<>();

        queue.offer(new Pair(root, 0));

        while (!queue.isEmpty()) {

            Pair current = queue.poll();

            TreeNode node = current.node;
            int hd = current.hd;

            // Store only the first node of each vertical column
            if (!map.containsKey(hd)) {
                map.put(hd, node.data);
            }

            // Left Child
            if (node.left != null) {
                queue.offer(new Pair(node.left, hd - 1));
            }

            // Right Child
            if (node.right != null) {
                queue.offer(new Pair(node.right, hd + 1));
            }
        }

        for (int value : map.values()) {
            ans.add(value);
        }

        return ans;
    }
}

public class TopViewTree{

    public static void main(String[] args) {

        /*
                  1
                /   \
               2     3
              / \   / \
             4   5 6   7
        */

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        Solution obj = new Solution();

        ArrayList<Integer> ans = obj.topView(root);

        System.out.println("Top View:");

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}
