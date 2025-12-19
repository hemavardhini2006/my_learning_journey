class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
 class Solution{
   public void dofun(Node del_node){
      del_node.data = del_node.next.data;
      del_node.next = del_node.next.next;
    
   }
}
public class LLDeleteWithOutHeader {
public static void main(String[] args){
    Solution sl = new Solution();
     Node head = new Node(1);
     head.next = new Node(3);
     head.next.next = new Node(6);
     Node del_node = head.next;
     sl.dofun(del_node);
     Node temp = head;
     while(temp!=null){
        System.out.println(temp.data+" ");
        temp = temp.next;
     }
}
    
}
