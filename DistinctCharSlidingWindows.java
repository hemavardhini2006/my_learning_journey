import java.util.*;
public class DistinctCharSlidingWindows {
      public static int distinctChar(String s){
        HashSet<Character> set = new HashSet<>();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            set.add(ch);
        }
        int require = set.size();
        int left = 0;
        int mini = Integer.MAX_VALUE;
        int found = 0;
        for(int right=0;right<s.length();right++){
            char chh = s.charAt(right);
            map.put(chh,map.getOrDefault(chh,0)+1);
           if(map.get(chh) == 1){
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
        String s = "abcaacdbac";
        int reslt = distinctChar(s);
        System.out.println(reslt);
      }
}
