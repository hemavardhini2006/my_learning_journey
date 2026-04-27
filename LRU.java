import java.util.*;
public class LRU {
    class Node{
        int key;
        int value;
        Node prev;
        Node next;
        public Node(int key,int value){
            this.key = key;
            this.value = value;
        }
    }
        int cap;
        HashMap<Integer,Node> map ;
        Node head,tail;
        public LRU(int cap){
            this.cap = cap;
            map = new HashMap<>();
            head = new Node(0,0);
            tail = new Node(0,0);
            head.next = tail;
            tail.prev = head;
        }
        public void remove(Node node){
          node.prev.next = node.next;
          node.next.prev = node.prev;
        }
        public void insert(Node node){
            tail.prev.next = node;
            tail.prev = node;
            node.next = tail;
            node.prev = tail.prev;
        }
        public int get(int key){
            if(!map.containsKey(key)){
                return -1;
            }
            Node nupo = map.get(key);
            remove(nupo);
            insert(nupo);
           return nupo.value;
        }
        public void put(int key,int value){
            if(map.containsKey(key)){
                Node lun = map.get(key);
                lun.value = value;
                remove(lun);
                insert(lun);
            }
            else{ if(map.size() == cap){
                Node luckk = head.next;
                remove(luckk);
            }
            Node po = new Node(key,value);
            insert(po);
            map.put(key,po);
        }
    }
    public static void main(String[] args){
        LRU lrr = new LRU(2);
        lrr.put(1,1);
        lrr.put(2,2);
        System.out.println(lrr.get(1));
        lrr.put(3,3);
         System.out.println(lrr.get(2));
         lrr.put(4,4);
    }
}
