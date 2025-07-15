import java.util.Scanner;
import java.util.Arrays;
public class RotateArray {
   public static int[] clockwiserotate(int[] arr){
    int n=arr.length;
    if(n<=1)
      return arr;
    int[] rotate = new int[n];
     rotate[0] = arr[n-1];
     for(int i = 0;i<n-1;i++){
        rotate[i+1]=arr[i];
     }
     return rotate;

   } 
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter size");
    int a = sc.nextInt();
    System.out.println("enter the elements");
    int arr[] = new int[a];
    for(int i = 0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("before rotation");
    for(int i = 0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
    int[] result = clockwiserotate(arr);
    System.out.println("after clock rotation");
    System.out.println(Arrays.toString(result));
   }
}
