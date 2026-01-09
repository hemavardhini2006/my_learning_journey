
import java.util.HashSet;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class HasSET {

    public static Node removeDup(Node head) {

        if (head == null) return null;

        HashSet<Integer> set = new HashSet<>();

        Node curr = head;
        Node prev = null;

        while (curr != null) {

            // If data already seen → remove node
            if (set.contains(curr.data)) {
                prev.next = curr.next;
            } 
            // First time seeing data
            else {
                set.add(curr.data);
                prev = curr;
            }

            curr = curr.next;
        }

        return head;
    }
    public static void print(Node head){
      Node temp = head;
      while(temp!=null){
        System.out.println(temp.data+"-->");
        temp = temp.next;
      }
    }
}
public class RemoveDuplicatessLL{
    public static void main(String[] args){
      Node head = new Node(2);
     head.next = new Node(5);
     head.next.next = new Node(6);
     head.next.next.next = new Node(7);
     head.next.next.next.next = new Node(8);
     Node res = HasSET.removeDup(head);
     HasSET.print(res);
    }
}