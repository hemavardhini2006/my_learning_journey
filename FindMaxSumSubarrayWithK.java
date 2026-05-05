import java.util.*;
public class FindMaxSumSubarrayWithK {
    public static int MaxSum(int[] arr,int k){
        int sum =0;
        int max = 0;
        for(int i=0;i<k;i++){
            sum += arr[i];
            max = Math.max(max,sum);
        }
        for(int i =k;i<arr.length;i++){
            int last = arr[i-k];
            sum = (sum-last)+arr[i];
            max = Math.max(max,sum);
        }
        return max;
    }

     public static void main(String[] args){
        int[] arr = {100,200,300,400};
        int k =2;
       int res = MaxSum(arr,k);
       System.out.println(res);
    } 
}
