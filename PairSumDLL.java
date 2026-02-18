import java.util.ArrayList;

class Node {
    int data;
    Node next, prev;

    Node(int data) {
        this.data = data;
        next = prev = null;
    }
}

public class PairSumDLL {

    // Function to find pairs in SORTED DLL
    static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(Node head, int target) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if (head == null) return ans;

        Node left = head;
        Node right = head;

        // Move right to the last node
        while (right.next != null) right = right.next;

        // Two pointer traversal
        while (left != right && right.next != left) {
            int sum = left.data + right.data;

            if (sum == target) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(left.data);
                pair.add(right.data);
                ans.add(pair);

                left = left.next;
                right = right.prev;
            } else if (sum < target) {
                left = left.next;
            } else {
                right = right.prev;
            }
        }

        return ans;
    }

    // Function to insert node at the end
    static Node insert(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) return newNode;

        Node temp = head;
        while (temp.next != null) temp = temp.next;

        temp.next = newNode;
        newNode.prev = temp;

        return head;
    }

    public static void main(String[] args) {
        Node head = null;

        // Sorted Doubly Linked List
        head = insert(head, 1);
        head = insert(head, 2);
        head = insert(head, 4);
        head = insert(head, 5);
        head = insert(head, 6);
        head = insert(head, 8);
        head = insert(head, 9);

        int target = 7;

        ArrayList<ArrayList<Integer>> result = findPairsWithGivenSum(head, target);

        System.out.println("Pairs with sum " + target + ":");
        for (ArrayList<Integer> pair : result) {
            System.out.println("(" + pair.get(0) + ", " + pair.get(1) + ")");
        }
    }
}
