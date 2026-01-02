class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
class SolLLution{
    public static boolean check(Node head){
      //checking loop present in the LL or not by algo
        Node slow = head;
        Node fast = head;
        boolean loopexit = false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                loopexit = true;
                break; 
            }
        }
        if(!loopexit){
            return true;
        }
            // find the starting point of loop
        slow = head;
        while(slow != fast){
            slow=slow.next;
            fast = fast.next;
        }
        
        Node prt =slow;
        while(prt.next != slow){
            prt = prt.next;
        }
        prt.next = null;

        return true;
    }
}
public class RRemoveLoopLL {
    public static void main(String args[]){
     Node head = new Node(2);
     head.next = new Node(5);
     head.next.next = new Node(6);
     head.next.next.next = new Node(7);
     head.next.next.next.next = new Node(8);
     head.next.next.next.next.next = head.next;
     boolean result = SolLLution.check(head);
     System.out.println(result);
    }
}
