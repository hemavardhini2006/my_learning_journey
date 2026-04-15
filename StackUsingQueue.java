import java.util.*;
import java.util.LinkedList;
public class StackUsingQueue {
    static Queue<Integer> q = new LinkedList<>();
    static void push(int x){
      q.add(x);
      int size = q.size();
      for(int i=0;i<size-1;i++){
        q.add(q.remove());
      }
    }
    static int pop(){
        if(q.isEmpty()){
            return -1;
        }
        return q.remove();
    }
    public static void main(String[] args){
      push(2);
      push(3);
      push(4);
      System.out.println(pop());
    }
}
