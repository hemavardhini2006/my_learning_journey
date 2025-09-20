import java.util.*;
public class Search2Dmatrix {
   public static boolean SeacrchTarget(int[][] arr,int target){
        int n = arr.length;
        int m = arr[0].length;
        int len = n*m;
        if(len==0){
            return false;
        }
        int low=0;
        int high=len-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            int r = mid/m,c = mid%m;
            int vax = arr[r][c];
            if(vax == target){
                return true;
            }else if(vax<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return false;
   }
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int arr[][] = {{35,45,55},{65,75,85},{95,105,115}};
    System.out.println("your array is");
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println(" ");
    }
    System.out.println("choose your target element in these array");
    int target = sc.nextInt();
    boolean result = SeacrchTarget(arr, target);
    System.out.println(result);
   }
}
