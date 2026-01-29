class Node{
  int data;
  Node next;
    public Node(int data){
       this.data = data;
       this.next = null;
    }
}
class Addition{
   public  Node solving(Node h1,Node h2){
    h1=reverse(h1);
    h2=reverse(h2);
    Node result = Addition(h1,h2);
    return reverse(result);
   }
   public Node reverse(Node head){
    Node pre = null;
    Node curr = head;
    while(curr != null){
        Node next = curr.next;
        curr.next = pre;
        pre = curr;
        curr = next;
    }
    return pre;
   }
   public Node Addition(Node h1, Node h2){
    Node dummy = new Node(0);
    Node curr = dummy;
    int carry = 0;
    while(h1!=null || h2!=null || carry!=0){
        int sum = carry;
        if(h1!=null){
            sum+=h1.data;
            h1=h1.next;
        }
        if(h2!=null){
            sum+=h2.data;
            h2=h2.next;
        }
        carry = sum/10;
        curr.next = new Node(sum%10);
        curr = curr.next;
    }
    return dummy.next;
   }
   public void print(Node head){
    Node temp = head;
    while(temp!=null){
        System.out.println(temp.data+":"+"-->");
        temp = temp.next;
    }
   }
}
public class AddTwoLL {
    public static  void main(String[] args){
     Addition addd = new Addition();
     Node head = new Node(1);
     head.next = new Node(0);
     head.next.next = new Node(0);
     System.out.println("the LL1 is : ");
     addd.print(head);
      Node head2 = new Node(1);
     head2.next = new Node(2);
     System.out.println("the LL2 is : ");
     addd.print(head2);
     System.out.println("addition of two LL is :");
     Node finn =  addd.solving(head, head2);
     addd.print(finn);
     
    } 
}
