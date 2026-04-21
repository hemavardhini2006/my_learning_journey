import java.util.*;
import java.util.LinkedList;
public class StreamingFirstOut {
    public static String streaming(String s){
        int[] frequency = new int[26];
        StringBuilder res = new StringBuilder();
        Queue<Character> q = new LinkedList<>();
        for (char ch : s.toCharArray()) {
            int diff = ch - 'a';
            frequency[diff]++;
            q.add(ch);
            while(!q.isEmpty() && frequency[q.peek() - 'a']>1){
              q.poll();
            }
            if(q.isEmpty()){
                res.append('#');
            }else{
                res.append(q.peek());
            }
        }
        return res.toString();
    }
    public static void main(String[] arg){
        String s = "aabc";
        String sm = streaming(s);
        System.out.println(sm);
    }
}
