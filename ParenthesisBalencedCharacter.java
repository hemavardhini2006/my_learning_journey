import java.util.*;
public class ParenthesisBalencedCharacter {
    public static boolean iscorrect(String s){
      Stack<Character>stack = new Stack<>();
      for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        if(ch=='(' || ch=='{' || ch=='['){
            stack.push(ch);
        }
        else{
            if(stack.isEmpty()){
                return false;
            }
            char top = stack.pop{();
            if((ch==')' && top!='(' )|| (ch=='}' && top!='{') || (ch==']' && top!='[')){
                return false;
            }
        }
    }
        return stack.isEmpty();
      }
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the balenced parenthesis");
     String wordding = sc.nextLine();
     boolean result = iscorrect(wordding);
     System.out.println(result);
    }
}
