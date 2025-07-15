import java.util.Scanner;
import java.util.Arrays;
public class AntirotationArray {
   public static int[] anticlockwiserotate(int[] arr){
    int n=arr.length;
    if(n==1)
      return arr;
    int[] rotate = new int[n];
     //rotate[n-1] = arr[0];
     for(int i = 0;i<n-1;i++){
        rotate[i]=arr[i+1];
     }
     rotate[n-1] = arr[0];
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
    int[] result = anticlockwiserotate(arr);
    System.out.println("after clock rotation");
    System.out.println(Arrays.toString(result));
   }
}

