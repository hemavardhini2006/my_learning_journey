import java.util.Scanner;
public class FindMaxRow {
    public static int max2DArray(int arr[],int x){
         int ans = arr.length;
         int low=0;
         int high = arr.length-1;
         while(low<=high){
           int mid = (low+high)/2;
           if(arr[mid]==1){
            ans = mid;
            high = mid-1;
           } else{
            low=mid+1;
           }
         }
      return ans;
    }
    public static int MaxRowInArray(int num[][],int row,int col){
        int maxcount=0;
        int index = -1;
        for(int i=0;i<row;i++){
        int count = col-max2DArray(num[i],1);
        if(count>maxcount){
            maxcount = count;
            index=i;
        }
        }
        return index;
    }
    public static void main(String[] args){
        int num[][]={{0,0,1,1},{1,1,1,1},{0,0,0,0},{0,1,1,1}};
        int n =4,m=4;
        int result = MaxRowInArray(num,n,m);
        System.out.println(result);
    }
}
