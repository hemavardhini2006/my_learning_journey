class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class DeleteNodeGreaterOnRight {
   
    public Node reverse(Node head){
        Node pre = null;
        Node curr = head;
        while(curr!=null){
            Node next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }
    public Node soll(Node head){
        head = reverse(head);
        int max = head.data;
        Node curr = head;
        while(curr.next!=null){
            if(curr.next.data<max){
                curr.next =curr.next.next; 
            }
            else{
                curr = curr.next;
                max = curr.data;
            }
        }
        return reverse(head);
    }
    public void printlis(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data+"-->");
            temp = temp.next;
        }
    }
    //delete if the node is greater than right 
    public static void main(String[] args){
         DeleteNodeGreaterOnRight obj = new DeleteNodeGreaterOnRight();
     Node head = new Node(12);
     head.next = new Node(15);
     head.next.next = new Node(10);
     head.next.next.next = new Node(11);
      head.next.next.next.next= new Node(5);
       head.next.next.next.next.next= new Node(6);
       head.next.next.next.next.next.next= new Node(2);
       head.next.next.next.next.next.next.next= new Node(3);
     Node Nhead = obj.soll(head);
     obj.printlis(Nhead);
    }
}
