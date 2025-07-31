import java.util.*;
public class Search2DArray {
 public static boolean Search2D(int[][] num,int n,int m,int target){
    int low = 0;
    int high = n*m -1;
    while(low<=high){
       int mid = (low+high)/2;
       int row = mid/ m;
       int col = mid%m;
       if(num[row][col]==target){
        return true;
       }else if(num[row][col]<target){
        low = mid+1;
       }else{
        high = mid-1;
       }
    }
    return false;
 }  
 public static void main(String[] arr){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size off row");
    int n = sc.nextInt();
    System.out.println("enter the size of coloumn");
    int m = sc.nextInt();
    int[][] num = new int[n][m];  
    System.out.println("enter elements3");
    for(int i =0;i<n;i++){
        for(int j =0;j<m;j++){
            num[i][j]=sc.nextInt();
        }
    }
 System.out.println("enter the target element if it is present in array or not");
 int target = sc.nextInt();
 boolean result = Search2D(num,n,m,target);
 System.out.println(result);
    
 } 
}
