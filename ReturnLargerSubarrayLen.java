import java.util.*;
public class ReturnLargerSubarrayLen {
    public static int functioning(int[] arr, int k){
       HashMap<Integer,Integer> map = new HashMap<>();
          int maxi =0;
          int prefixsum = 0;
         for(int i=0;i<arr.length;i++){
            prefixsum +=arr[i];
            if(prefixsum == k){
              maxi = Math.max(maxi ,i+1);
            }
            if(map.containsKey(prefixsum-k)){
                int ledo =map.get(prefixsum-k);
                int len = i-ledo;
                maxi = Math.max(maxi,len);
            }
            if(!map.containsKey(prefixsum)){
                map.put(prefixsum,i);
            }
         }
         return maxi;
    }
    public static void main(String[] args)
    {
        int[] arr = {10,5,2,7,1};
        int k = 15;
        int res = functioning(arr, k);
        System.out.println(res);
    }
}
