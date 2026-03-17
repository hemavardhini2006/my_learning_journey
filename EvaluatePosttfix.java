import java.util.*;
class funcationality{
   public static int checking(String[] srr){
    Stack<Integer> stack = new Stack<>();
    for(String token:srr){
      if(!isOperator(token)){
        stack.push(Integer.parseInt(token));
      }
      else{
        int b = stack.pop();
        int a = stack.pop();
        switch(token){
            case "+":
                  stack.push(a+b);
                  break;
            case "-":
                  stack.push(a-b);
                  break;
            case "*":
                  stack.push(a*b);
                  break;
            case "/":
                  stack.push(a/b);
                  break;
        }
      }
    }
    return  stack.pop();
   } 
   public static boolean isOperator(String s){
     return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"); 
   }
}
public class EvaluatePosttfix {
    public static void main(String[] args){
      String srr[] ={"2","3","+"};
      System.out.println(funcationality.checking(srr));
    }
}
