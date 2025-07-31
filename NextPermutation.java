import java.util.*;
public class NextPermutation {
    public static int[] FindNextpermutation(int[] arr){
        int n = arr.length;
        int index=-1;
        for(int i=n-2;i>=0;i--){
        if(arr[i]<arr[i+1]){
          index=i;
          break;
        }
    }
        if(index==-1){
         reverseArray(arr,0,n-1);
           return arr;
        }
        
        for(int i=n-1;i>index;i--){
            if(arr[i]>arr[index]){
                int temp=arr[i];
                arr[i] =arr[index];
                arr[index]=temp;
                break;
                }    }
        reverseArray(arr,index+1,n-1);
       return arr;        
            }
      public static void reverseArray(int[] arr,int start,int end){
           while(start<end){
            int tem = arr[start];
            arr[start] = arr[end];
            arr[end] = tem;
            start++;
            end--;
           }
      } 
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        int[] result = FindNextpermutation(arr);
        System.out.println(Arrays.toString(result));

    }
}
