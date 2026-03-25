import java.util.*;
public class reverseStack {
    public static void insertion(Stack<Integer>st,int value){
          if(st.isEmpty()){//st[]
            st.push(value);
            return;
          }
          int remove = st.pop();//st[]//4
          insertion(st,value);//st[],3
          st.push(remove);//
    }
    public static void reverse(Stack<Integer> st){
         if(st.isEmpty()){
            return;
         }
         int top = st.pop();
         reverse(st);
         insertion(st,top);//st[4] top=3
    }
      public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        reverse(st);
        System.out.println(st);
      }
}
