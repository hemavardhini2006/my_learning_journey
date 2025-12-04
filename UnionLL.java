import java.util.*;
public class UnionLL {
    static class Node{
        int val;
        Node next;
        public Node(int v){
            this.val = v;
            this.next = null;
        }
        public static Node unionn(Node heada1,Node headb1){
            HashSet<Integer> set = new HashSet<>();
            Node temp = heada1;
            while(temp!=null){
                set.add(temp.val);
                temp = temp.next;
            }
            Node teemp = headb1;
            while(teemp!=null){
                set.add(teemp.val);
                teemp = teemp.next;
            }
            ArrayList<Integer> list = new ArrayList<>(set);
            Collections.sort(list);
            Node dummy = new Node(0);
            Node tail = dummy;
            for(int v : list){
                tail.next = new Node(v);
                tail = tail.next;
            }
            return dummy.next;
        }
        public static void placecheak(Node headN){
        Node tamp = headN;
        while(tamp!=null){
            System.out.println(tamp.val);
            tamp = tamp.next;
        }
        }
        public static void main(String[] args){
          Node a1 = new Node(1);
          Node a2 = new Node(3);
          Node a3 = new Node(5);
          Node a4 = new Node(7);
          Node a5 = new Node(9);
          a1.next = a2;
          a2.next = a3;
          a3.next = a4;
          a4.next = a5;
          Node b1 = new Node(2);
          Node b2 = new Node(4);
          Node b3 = new Node(6);
          Node b4 = new Node(8);
          Node b5 = new Node(10);
          b1.next = b2;
          b2.next = b3;
          b3.next = b4;
          b4.next = b5;
          Node ans = unionn(a1,b1);
          placecheak(ans);

        }
    }
}
