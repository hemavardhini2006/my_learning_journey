class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

class Soll {
    Node skipMdeleteN(Node head, int m, int n) {
        Node curr = head;
        
        while (curr != null) {
            // 1. Skip m nodes
            for (int i = 1; i < m && curr != null; i++) {
                curr = curr.next;
            }
            
            if (curr == null) break;

            // 2. Delete next n nodes
            Node temp = curr.next;
            for (int i = 0; i < n && temp != null; i++) {
                temp = temp.next;
            }
            
            // Connect current node to node after deleted nodes
            curr.next = temp;

            // Move curr to next node after deletion
            curr = temp;
        }
        return head;
    }
    public void printlis(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data+"-->");
            temp = temp.next;
        }
    }
}
    public class MnDeletionNode{
        public static void main(String[] args){
       Soll sol = new Soll();
       Node head = new Node(12);
     head.next = new Node(15);
     head.next.next = new Node(10);
     head.next.next.next = new Node(11);
      head.next.next.next.next= new Node(5);
       head.next.next.next.next.next= new Node(6);
       head.next.next.next.next.next.next= new Node(2);
       head.next.next.next.next.next.next.next= new Node(3);
     Node Nhead = sol.skipMdeleteN(head,2,1);
     sol.printlis(Nhead);
        }
    }

