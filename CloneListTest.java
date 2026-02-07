import java.util.*;

class Node {
    int data;
    Node next;
    Node random;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.random = null;
    }
}

class Solution {
    public Node copyList(Node head) {
        if (head == null) return null;

        Node curr = head;

        // STEP 1: Insert cloned nodes after each original node
        while (curr != null) {
            Node copy = new Node(curr.data);
            copy.next = curr.next;
            curr.next = copy;
            curr = copy.next;
        }

        // STEP 2: Assign random pointers to cloned nodes
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        // STEP 3: Separate original and cloned list
        curr = head;
        Node copyHead = head.next;
        Node copyCurr = copyHead;

        while (curr != null) {
            curr.next = curr.next.next;

            if (copyCurr.next != null) {
                copyCurr.next = copyCurr.next.next;
            }

            curr = curr.next;
            copyCurr = copyCurr.next;
        }

        return copyHead;
    }
}

// Helper class to test
public class CloneListTest {
    // Function to print list with random pointers
    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            int randomData = (curr.random != null) ? curr.random.data : -1;
            System.out.println("Node data: " + curr.data + ", Random points to: " + randomData);
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create nodes
        Node node1 = new Node(1);
        Node node2 = new Node(3);
        Node node3 = new Node(5);
        Node node4 = new Node(9);

        // Connect next pointers
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        // Connect random pointers
        node1.random = node3; // 1 -> 5
        node2.random = node3; // 3 -> 5
        node3.random = null;  // 5 -> null
        node4.random = node3; // 9 -> 5

        System.out.println("Original List:");
        printList(node1);

        // Clone list
        Solution solution = new Solution();
        Node clonedHead = solution.copyList(node1);

        System.out.println("Cloned List:");
        printList(clonedHead);

        System.out.println("Original List after cloning (to check unchanged):");
        printList(node1);
    }
}