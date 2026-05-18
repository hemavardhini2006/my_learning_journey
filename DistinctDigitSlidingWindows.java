import java.util.*;
public class DistinctDigitSlidingWindows {
    public static int fordigit(String s,int require){
        int mini = Integer.MAX_VALUE;
        int left = 0;
        int found=0;
        HashMap<Character,Integer> map = new HashMap<>();
       for(int right =0;right<s.length();right++){
        char ch = s.charAt(right); 
        map.put(ch,map.getOrDefault(ch,0)+1);
         if(map.get(ch) == 1){
            found++;
           }
           
           while(found==require){
            mini = Math.min(mini,right-left+1);
             char leftele = s.charAt(left);
             map.put(leftele,map.get(leftele)-1);
             if(map.get(leftele)==0){
                found--;
             }
             left++;
           }
       }
       return mini;
    }
    public static void main(String[] args){
        String s = "011120";
        int require = 3;
        System.out.println(fordigit(s,require));
    }
}
