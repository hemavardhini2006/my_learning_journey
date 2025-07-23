import java.util.*;
public class LongSubArray {
    public static int FindLongSubArray(int arr[],int k){
     HashMap<Integer,Integer> map = new HashMap<>();
     int sum = 0;
     int len = 0;
     for(int i=0;i<arr.length;i++){
        sum = sum+arr[i];
        if(sum==k){
            len = i+1;
        }
        if(map.containsKey(sum-k)){
            int preIndex = map.get(sum-k);
            int length = i-preIndex;
            len = Math.max(len,length);
        }
        if(!map.containsKey(sum-k)){
            map.put(sum,i);
        }

     }
     return len;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {10,5,2,7,1,9};
        int k = 15;
        int result = FindLongSubArray(arr, k);
        System.out.println("the possiblity to find the sum of K is "+" "+result);
    }
}
