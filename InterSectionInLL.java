import java.util.*;
public class InterSectionInLL {
    static class Node{
        int val;
        Node next;
        public Node(int v){
            this.val = v;
            this.next = null;
        }
    }
    public static Node getInter(Node Heada,Node Headb){
       HashMap<Node,Boolean> map = new HashMap<>();
       Node temp = Heada;
       while(temp!=null){
        map.put(temp,true);
        temp = temp.next;
       }
       Node teemp = Headb;
       while(teemp!=null){
        if(map.containsKey(teemp)){
            return teemp;
        }
        teemp = teemp.next;
       }
        return null;
       
    }
    
    public static void main(String[] args){
         Node s1 = new Node(5);
         Node s2 = new Node(6);
         Node s3 = new Node(7);
         s1.next = s2;
         s2.next = s3;
         Node a1 = new Node(11);
         Node a2 = new Node(12);
          Node a3 = new Node(13);
          a1.next = a2;
          a2.next = a3;
          a3.next = s1;
          Node b1 = new Node(15);
         Node b2 = new Node(16);
          Node b3 = new Node(17);
          b1.next = b2;
          b2.next = b3;
          b3.next = s1;
          Node ans = getInter(a1, b1);
          System.out.println(ans.val);
    }
}
