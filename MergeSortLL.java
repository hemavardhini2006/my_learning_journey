class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Solution {

    public static Node mergeSort(Node head) {

        // Base case
        if (head == null || head.next == null) {
            return head;
        }

        // Find middle
        Node mid = getMiddle(head);
        Node right = mid.next;
        mid.next = null;

        // Recursive calls
        Node leftSorted = mergeSort(head);
        Node rightSorted = mergeSort(right);

        // Merge two sorted halves
        return sortedMerge(leftSorted, rightSorted);
    }

    private static Node getMiddle(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private static Node sortedMerge(Node a, Node b) {

        if (a == null) return b;
        if (b == null) return a;

        if (a.data <= b.data) {
            a.next = sortedMerge(a.next, b);
            return a;
        } else {
            b.next = sortedMerge(a, b.next);
            return b;
        }
    }
}

public class MergeSortLL {
    public static void main(String[] args) {

        // Create Linked List: 10 -> 3 -> 5 -> 2 -> 8
        Node head = new Node(10);
        head.next = new Node(3);
        head.next.next = new Node(5);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(8);

        // Sort the linked list
        head = Solution.mergeSort(head);

        // Print sorted linked list
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
