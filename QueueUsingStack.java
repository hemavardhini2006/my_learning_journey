import java.util.*;
public class QueueUsingStack {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();
    static void push(int x){
        s1.push(x);
     }
    static int pop(){
     if(s1.isEmpty() && s2.isEmpty()){
        return -1;
    }
    if(s2.isEmpty()){
        while (!s1.isEmpty()) {
      s2.push(s1.pop());
    }
}
    return s2.pop();
    }
    public static void main(String[] args){
       push(2);
       push(3);
       System.out.println(pop());
    }
}
