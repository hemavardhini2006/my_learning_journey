import java.util.*;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class  TreeBoundaryTraversal {

    public static ArrayList<Integer> boundaryTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null) return ans;

        if (!isLeaf(root))
            ans.add(root.data);

        addLeftBoundary(root, ans);
        addLeaves(root, ans);
        addRightBoundary(root, ans);

        return ans;
    }

    static boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }

    static void addLeftBoundary(TreeNode node, ArrayList<Integer> ans) {
        TreeNode curr = node.left;

        while (curr != null) {
            if (!isLeaf(curr))
                ans.add(curr.data);

            if (curr.left != null)
                curr = curr.left;
            else
                curr = curr.right;
        }
    }

    static void addLeaves(TreeNode node, ArrayList<Integer> ans) {
        if (node == null) return;

        if (isLeaf(node)) {
            ans.add(node.data);
            return;
        }

        addLeaves(node.left, ans);
        addLeaves(node.right, ans);
    }

    static void addRightBoundary(TreeNode node, ArrayList<Integer> ans) {
        Stack<Integer> stack = new Stack<>();
        TreeNode curr = node.right;

        while (curr != null) {
            if (!isLeaf(curr))
                stack.push(curr.data);

            if (curr.right != null)
                curr = curr.right;
            else
                curr = curr.left;
        }

        while (!stack.isEmpty())
            ans.add(stack.pop());
    }

    public static void main(String[] args) {

        // Example Tree
        //         1
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.right.left = new TreeNode(8);
        root.left.right.right = new TreeNode(9);

        System.out.println(boundaryTraversal(root));
    }
}
