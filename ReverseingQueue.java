import java.util.*;
import java.util.LinkedList;
public class ReverseingQueue {
    public  static void reversal(Queue<Integer> q){
      Stack<Integer> st = new Stack<>();
      while(!q.isEmpty()){
          st.push(q.remove());
      }
      while(!st.isEmpty()){
        q.add(st.pop());
      }
    }
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
          q.add(1);
          q.add(2);
          q.add(3);
          reversal(q);
        System.out.println(q);

    }
}
