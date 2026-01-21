import java.util.HashSet;


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Solution class
class Practice {

    // Function to remove duplicates from unsorted linked list
    public Node removeDuplicates(Node head) {

        // If list is empty or has only one node
        if (head == null || head.next == null) {
            return head;
        }

        HashSet<Integer> set = new HashSet<>();

        Node current = head;
        Node prev = null;

        // Traverse the list
        while (current != null) {

            // If duplicate found
            if (set.contains(current.data)) {
                prev.next = current.next;   // remove current node
            } 
            else {
                // First time seeing this value
                set.add(current.data);
                prev = current;
            }

            current = current.next;
        }

        return head;
    }
}

// Main class to run the program
public class RemoveDup{

    // Helper function to print linked list
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null)
                System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Create linked list: 5 -> 2 -> 2 -> 4
        Node head = new Node(5);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);

        System.out.println("Original Linked List:");
        printList(head);

        Practice sol = new Practice();
        head = sol.removeDuplicates(head);

        System.out.println("After Removing Duplicates:");
        printList(head);
    }
}
