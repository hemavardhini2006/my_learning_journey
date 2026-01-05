class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class PairWiseLLSwap {
    public static Node reversal(Node head,int k){
    if(head == null)
        return null;
    Node curr = head;
    Node pre = null;
    Node next = null;
    int cout =0;
    while(curr != null && cout<k){
      next = curr.next;
      curr.next = pre;
      pre = curr;
      curr = next;
      cout++;
    } 
    
    if(next != null){
        head.next = reversal(next,k);
    }
    return pre;
}
   public static void sol(Node head){
    Node temp = head;
    while(temp != null){
        System.out.println(temp.data+" "+"-->");
        temp = temp.next;
    }
   }
    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3); 
        head.next.next.next = new Node(4); 
        head.next.next.next.next = new Node(5);
        int k = 2;
        System.out.println("orignal LL is");
        sol(head);
        System.out.println("after K reversal");
        Node head2 = reversal(head,k);
        sol(head2);
    }
}
