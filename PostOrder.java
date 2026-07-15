import java.util.*;
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class PostOrder {

    static void dfs(TreeNode root, ArrayList<Integer> list) {

        if (root == null) {
            return;
        }
        dfs(root.left, list);

        dfs(root.right, list);

        
        list.add(root.data);
    }

    public static void main(String[] args) {

       
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        ArrayList<Integer> list = new ArrayList<>();

        dfs(root, list);

        System.out.println("Postorder Traversal: " + list);
    }
}

