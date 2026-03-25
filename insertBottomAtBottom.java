import java.util.*;
public class insertBottomAtBottom
{ 
    public static void dooing(Stack<Integer> st,int x){
        if(st.isEmpty()){
            st.push(x);
            return;
        }
        int top = st.pop();
        dooing(st,x);
        st.push(top);
    }
    public static void main(String[] args){
       Stack<Integer> st = new Stack<>();
       st.push(3);
       st.push(4);
       st.push(5);
       st.push(6);
       int x = 2;
       dooing(st,x);
       System.out.println(st);
    }
}