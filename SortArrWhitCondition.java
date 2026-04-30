import java.util.*;
import java.util.Arrays;
public class SortArrWhitCondition {
    public static void sortting(int[] arr,int k){
          //int[] newarr = new int[arr.length];
          int index = 0;
          PriorityQueue<Integer> ps = new PriorityQueue<>();
          for(int i = 0;i<=k && i<arr.length;i++){//{_,_,_,4}
            ps.add(arr[i]);
          }
          for(int i=k+1;i<arr.length;i++){//{4,5}
            arr[index++] = ps.poll();//{1,2,_,_,_}
            ps.add(arr[i]);//queue = {2,3,4,5}
          }
          while(!ps.isEmpty()){
            arr[index++]=ps.poll();
          }
    }
     public static void main(String[] args){
        int[] arr ={2,3,1,4};
        int k = 2;
        sortting(arr,k);
        System.out.println(Arrays.toString(arr));
     } 
}
