class Node{
        int data;
        Node next;
        public Node(int val){
            this.data = val;
            this.next = null;
        }
    }
class MidleOFLL{
    Node head;
    MidleOFLL(){
       head = null;
    }
    public void add(int val){
     Node newNode = new Node(val);
     if(head == null){
        head = newNode;
        return;
     }
     Node temp = head;
     while(temp.next != null){
         temp = temp.next;
     }
     temp.next = newNode;
    }
    public void display(){
        Node temp = head;
        while(temp!= null){
            System.out.println(temp.data);
            temp = temp.next;      }
    }
    public void middle(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("the mid is"+" "+ slow.data);
    }
} 
public class simple{
    public static void main(String[] args){
     MidleOFLL min = new MidleOFLL();
     min.add(5);
     min.add(1);
     min.add(3);
     min.add(4);
     min.add(8);
     min.display();
     min.middle();
    }
}
