import java.util.*;
public class SortStack {
    public static void sorting(Stack<Integer> st,int value){
     if(st.isEmpty()|| st.peek()<=value){
        st.push(value);
        return;
     }
     int top = st.pop();
     sorting(st,value);
     st.push(top);
    }
    public static void empty(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int top = st.pop();
        empty(st);
        sorting(st,top);
    }
   public static void main(String[] args){
     Stack<Integer> st = new Stack<>();
     st.push(45);
     st.push(90);
     st.push(31);
     st.push(2);
     empty(st);
     System.out.println(st);
   }
}
