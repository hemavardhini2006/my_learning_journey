import java.util.*;
public class AggresiveCow {
    public static int aggresivecow(int[] arr,int cow){
        Arrays.sort( arr);
        int n = arr.length;
       int low=0;
       int high = arr[n-1]-arr[0];
       int ans = 0;
       while(low<=high){
         int mid =(low+high)/2;
         if(canWePlace(arr,mid,cow)){
             ans = mid;
             low = mid+1;
       }else{
        high = mid-1;
       }
    }
       return ans;
    }
    public static boolean canWePlace(int[] arr,int mid,int cow){
        int CountCow = 1;
        int last = arr[0];
        for(int i=1;i<arr.length;i++){
        if(arr[i]-last>=mid){
            CountCow++;
            last = arr[i];
        }
        if(CountCow>=cow){
            return true;
        }
    }
    return false;
}
    public static void main(String[] args){
        int arr[] = {0,3,4,7,9,10};
        int cow = 4;
        int result = aggresivecow(arr,cow);
        System.out.println(result);
    }
}
