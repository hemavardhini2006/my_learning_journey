import java.util.*;
public class TargetEqualToZero {
    public static boolean happening(int arr[]){
         HashSet<Integer> set = new HashSet<>();
         int prefixSum =0;
         for(int i=0;i<arr.length;i++){
            prefixSum +=arr[i];
            if(prefixSum == 0){
                return false;
            }
            if(set.contains(prefixSum)){
                return false;
            }
            if(!set.contains(prefixSum)){
                set.add(prefixSum);
            }
         }
         return false;
    }
    public static void main(String[] args){// our main thougth is find the subarray whodse sum is equals to zero  and then thaa
// here the main tech is use the prifix sum and hashset 
     int[] arr = {-2,0,1,4};
     boolean result = happening(arr);
     System.out.println(result);
    }
}
