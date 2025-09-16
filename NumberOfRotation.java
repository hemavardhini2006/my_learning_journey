import java.util.Scanner;
public class NumberOfRotation {
    public static int FindNumberOfRotation(int arr[]){
        int n  = arr.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]<=arr[high])
            {
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
     return low;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("enter elements");
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int result = FindNumberOfRotation(arr);
        System.out.println(result);
    }
}
