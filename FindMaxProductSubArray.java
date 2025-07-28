import java.util.*;
public class FindMaxProductSubArray {
  public static int MaxProduct(int[] arr){
    int pre=1;
    int suf=1;
    int maxi = Integer.MIN_VALUE;
    int n= arr.length;
    for(int i=0;i<n;i++){
        if(pre==0){
            pre = 1;
        }
        if(suf ==0){
            suf=1;
        }
        pre = pre*arr[i];
        suf =suf*arr[n-i-1];
        int ans = Math.max(pre,suf);
        maxi = Math.max(ans,maxi);
    }
   return maxi;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of an array");
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.println("enter the elements");
    for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
    }
    int result = MaxProduct(arr);
    System.out.println(result);
  } 
}
