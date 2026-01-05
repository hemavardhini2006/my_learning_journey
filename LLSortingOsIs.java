class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
class Finding{
    public static Node finding(Node head ,int k){
         int count0=0,count1=0,count2=0;
         Node cur= head;
         while(cur!=null){
           if(cur.data==0){
            count0++;
           }
           else if(cur.data==1){
            count1++;
           }
           else {
            count2++;
           }
           cur = cur.next;
         }
         cur = head;
         while(count0-- >0){
            cur.data = 0;
            cur = cur.next;
         }
         while(count1-- >0){
            cur.data = 1;
            cur = cur.next;
         }
         while(count2-- >0){
            cur.data = 2;
            cur = cur.next;
         }
         return head;
    }
}


public class LLSortingOsIs {
    public static void printing(Node head){
    Node temp = head;
    while(temp != null){
        System.out.println(temp.data+"-->");
        temp = temp.next;
    } 
}
    public static void main(String[] args){
        Node head = new Node(0);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(0);
        head.next.next.next.next = new Node(1);
        head.next.next.next.next.next = new Node(1);
        System.out.println("original LL is");
        printing(head);
        Node curr = Finding.finding(head,2);
        System.out.println("after sorting");
        printing(curr);
    }
}
