class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class LLlooping {
    public static boolean isloop(Node head){
      Node slow = head;
      Node fast = head;
     while(fast != null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
            return true;
        }
     }
     return false;
    }
 public static void main(String[] args){
    Node head=new Node(3);
    head.next=new Node(2);
    head.next.next = new Node(4);
    head.next.next.next=new Node(7);
    head.next.next.next.next=new Node(1);
    boolean check = isloop(head);
    System.out.println(check);
 }   
}
