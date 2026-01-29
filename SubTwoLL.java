class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SubTwoLL{

    public Node sub(Node head1, Node head2) {

        head1 = removeLeadingZeros(head1);
        head2 = removeLeadingZeros(head2);

        if (isSmaller(head1, head2)) {
            Node temp = head1;
            head1 = head2;
            head2 = temp;
        }

        head1 = reverse(head1);
        head2 = reverse(head2);

        Node result = subtract(head1, head2);

        result = reverse(result);
        result = removeLeadingZeros(result);

        return result == null ? new Node(0) : result;
    }

    private Node subtract(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node curr = dummy;
        int borrow = 0;

        while (l1 != null) {
            int d1 = l1.data - borrow;
            int d2 = (l2 != null) ? l2.data : 0;

            if (d1 < d2) {
                d1 += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }

            curr.next = new Node(d1 - d2);
            curr = curr.next;

            l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummy.next;
    }

    private Node reverse(Node head) {
        Node prev = null, curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    private Node removeLeadingZeros(Node head) {
        while (head != null && head.data == 0) {
            head = head.next;
        }
        return head;
    }

    private boolean isSmaller(Node h1, Node h2) {
        int len1 = length(h1);
        int len2 = length(h2);

        if (len1 != len2)
            return len1 < len2;

        while (h1 != null && h2 != null) {
            if (h1.data != h2.data)
                return h1.data < h2.data;
            h1 = h1.next;
            h2 = h2.next;
        }
        return false;
    }

    private int length(Node head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }

    // Print Linked List
    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    // MAIN METHOD
    public static void main(String[] args) {
        SubTwoLL sol = new SubTwoLL();

        // Example: 100 - 12 = 88

        // LinkedList1: 1 -> 0 -> 0
        Node head1 = new Node(1);
        head1.next = new Node(0);
        head1.next.next = new Node(0);

        // LinkedList2: 1 -> 2
        Node head2 = new Node(1);
        head2.next = new Node(2);

        System.out.print("Number 1: ");
        printList(head1);

        System.out.print("Number 2: ");
        printList(head2);

        Node result = sol.sub(head1, head2);

        System.out.print("Result:   ");
        printList(result);
    }
}