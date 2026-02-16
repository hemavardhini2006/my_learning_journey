class DNode{
    int data;
    DNode prev;
    DNode next;
   
    public DNode(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
        
    }
}
public class ReeverseDoubleLL {
    public static DNode insertAtEnd(DNode head,int data){
        DNode newNode = new DNode(data);
        if(head==null){
            return newNode;
        }
        DNode temp=head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        return head;
    }
    public static DNode reversal(DNode head){
     DNode curr = head;
     DNode temp = null;
     while(curr != null){
        temp = curr.prev;
        curr.prev = curr.next;
        curr.next = temp;
        curr = curr.prev;
     }
     return temp.prev;
    }
    public static void printLL(DNode head){
        DNode temp = head;

        while(temp != null){
            System.out.println(temp.data);
            if(temp.next != null){
                System.out.println("<-->");
            }
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
       DNode head=null;
       head = insertAtEnd(head,3);
       head = insertAtEnd(head,4); 
       head = insertAtEnd(head,5);
       printLL(head);
       DNode Nhead = reversal(head);
       printLL(Nhead);
    }
}
