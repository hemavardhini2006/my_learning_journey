import java.util.*;
import java.util.Arrays;
public class VariableSlidingWindow{
    public static int[] VariableSliding(int[] arr,int target){
      int left =0;
      int sum=0;
      for(int i=0;i<arr.length;i++){
           int right = i;
           sum += arr[right];
           while(sum > target){
              sum -=arr[left];
                 left++;
           }
           if(sum == target){
            return new int[]{left+1,right+1};
           }
      }
      return new int[]{-1};
    }
 public static void main(String[] args){
    int arr[] = {1,2,3,7,5};
    int target = 12;
    int[] res = VariableSliding(arr,target);
    System.out.println(Arrays.toString(res));
 }
}