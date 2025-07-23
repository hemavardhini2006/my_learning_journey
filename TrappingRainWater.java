import java.util.*;
public class TrappingRainWater {
   public static int trrappingRainWater(int arr[]){
    int[] l= new int[arr.length];
    int[] r = new int[arr.length];
    int max = -1;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]>=max)
        {
            max = arr[i];
        }
        l[i] = max;
    }
    max =-1;
    for(int i = arr.length-1;i>=0;i--){
        if(arr[i]>=max){
         max= arr[i];
        }
        r[i] = max;
    }
    int total = 0;
    for(int i=0;i<arr.length;i++){
     total +=Math.min(l[i],r[i])-arr[i];
    }
    return total;
   } 
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of the array");
    int size = sc.nextInt();
    System.out.println("enter the elements in array");
    int arr[] = new int[size];
    for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("elements are : ");
    for(int i=0;i<arr.length;i++){
        System.out.println((arr[i]));
    }
    System.out.println("the total water trap in bolcks are : ");
    int result = trrappingRainWater(arr);
    System.out.println(result);
   }
}
