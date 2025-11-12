import java.util.Scanner;
class Node{
        int data;
        Node next;
        public Node(int val){
            this.data = val;
            this.next = null;
        }
    } 
class LLpalindrom {
    Node head;
    LLpalindrom(){
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
    public Node middle(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public Node reversal(Node head){
        Node temp = head;
        Node pre = null;
        while(temp != null){
            Node fro = temp.next;
            temp.next = pre;
            pre = temp;
            temp = fro;
        }
        return pre;
    }
    public void isPali(){
        //partner plese twoo pointeer that mid previous is conside as a first part and after the the mid is consider as a second half
        Node mid = middle();
        Node secondHalfStart = reversal(mid);
        Node firstHalf = head;
        Node secondHalf = secondHalfStart;
        boolean isPalindrom = true;
        while(secondHalf != null){
            if(firstHalf.data != secondHalf.data){
                isPalindrom = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        if(isPalindrom){
            System.out.println("it  is palindrom");
        }else{
            System.out.println("not palindrom");
        }
        reversal(secondHalfStart);
    }
}
public class LinkPalindrom{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
     LLpalindrom min = new LLpalindrom();
     System.out.println("enter numbers how many node");
     int n = sc.nextInt();
     System.out.println("enter values");
      for(int i = 0;i<n;i++){
        int val = sc.nextInt();
        min.add(val);
      }
     min.display();
     min.isPali();
    }
}
