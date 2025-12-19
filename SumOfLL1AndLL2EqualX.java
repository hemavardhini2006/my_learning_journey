import java.util.HashSet;

class Node{
    int data;
    Node next;
      public Node(int data){
        this.data = data;
        this.next = null;
      }
}
class Sol{
  public int finding(Node head1,Node head2,int x){
    HashSet<Integer> set = new HashSet<>();
    int count=0;
    Node temp2 = head2;
      while(temp2!=null){
        set.add(temp2.data);
        temp2 = temp2.next;
      }
      Node temp1= head1;
      while(temp1!=null){
        if(set.contains(x-temp1.data)){
         count++;
        }
        temp1 = temp1.next;
        
      } return count;

  }
 
}
public class SumOfLL1AndLL2EqualX {
    public static void main(String[] args){
        Sol sl = new Sol();
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(5);
        head1.next.next.next = new Node(6);
        head1.next.next.next.next = new Node(7);
        head1.next.next.next.next.next = new Node(9);
        Node head2 = new Node(13);
        head2.next=new Node(10);
        head2.next.next=new Node(46);
        int x = 15;
        int result = sl.finding(head1,head2,x);
        System.out.println(result);
    }
}
