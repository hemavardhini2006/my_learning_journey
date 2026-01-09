class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Solution {
    public static Node sortedMerge(Node head1, Node head2) {

        Node dummy = new Node(-1); // dummy node
        Node tail = dummy;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }

        if (head1 != null) {
            tail.next = head1;
        } else {
            tail.next = head2;
        }

        return dummy.next;
    }
}

public class MergerTwoLL {
    public static void main(String[] args) {

        Node head1 = new Node(2);
        head1.next = new Node(4);
        head1.next.next = new Node(6);
        head1.next.next.next = new Node(8);
        head1.next.next.next.next = new Node(10);
        head1.next.next.next.next.next = new Node(12);

        Node head2 = new Node(1);
        head2.next = new Node(3);

        Node res = Solution.sortedMerge(head1, head2);

        // ✅ Correct printing
        while (res != null) {
            System.out.print(res.data + " ");
            res = res.next;
        }
    }
}