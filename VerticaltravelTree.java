
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

class PairHD {
    TreeNode node;
    int hd;

    PairHD(TreeNode node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}

public class VerticaltravelTree{

    public static ArrayList<Integer> topView(TreeNode root) {

        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null)
            return ans;

        TreeMap<Integer, Integer> map = new TreeMap<>();

        Queue<PairHD> queue = new LinkedList<>();

        queue.offer(new PairHD(root, 0));

        while (!queue.isEmpty()) {

            PairHD current = queue.poll();

            TreeNode node = current.node;
            int hd = current.hd;

            if (!map.containsKey(hd)) {
                map.put(hd, node.data);
            }

            if (node.left != null)
                queue.offer(new PairHD(node.left, hd - 1));

            if (node.right != null)
                queue.offer(new PairHD(node.right, hd + 1));
        }

        for (int value : map.values()) {
            ans.add(value);
        }

        return ans;
    }

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

        ArrayList<Integer> ans = topView(root);

        System.out.println("Top View:");

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}