import java.util.*;
public class SideBySideCalcMin {
    Stack<Integer> stac = new Stack<>();
    Stack<Integer> minstack = new Stack<>();
    public void push(int x){
      stac.push(x);
      if(!minstack.isEmpty() || x<=minstack.peek()){
        minstack.push(x);
      }
    }
    public void pop(){
        if(stac.isEmpty()){
            return;
        }
         int remove = stac.pop();
         if(remove == minstack.peek()){
            minstack.pop();
         }
    }
    public int getMin(){
        return minstack.peek();
    }
    public static void main(String[] args){
        SideBySideCalcMin scc = new SideBySideCalcMin();
      scc.push(6);
      scc.push(2);
      scc.push(1);
      System.out.println(scc.getMin());
      scc.pop();
      System.out.println(scc.getMin());
    }
}
