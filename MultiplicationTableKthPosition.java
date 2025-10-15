import java.util.*;
public class MultiplicationTableKthPosition {
     public static int KthSmallestElement(int m,int n,int k){
          int low = 1;
          int high = m*n;
          while(low<=high){
            int mid = (low+high)/2;
            int poss = posibility(m, n, mid);
            if(poss<k){
              low = mid+1;
            }else{
                high= mid-1;
            }
          }
          return low;
     }
     public static int posibility(int m,int n,int x){
           int count = 0;
           for(int i=1;i<=m;i++){
            count+=Math.min(n,x/i);
           }
           return count;
     }
     public static void main(String[] args){
        int k = 5;
        int m = 3;
        int n = 3;
        int result = KthSmallestElement(m,n,k);
        System.out.println(result);
     }
}
