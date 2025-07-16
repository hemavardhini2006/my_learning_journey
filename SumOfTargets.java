import java.util.*;
public class SumOfTargets{
    public static boolean Sumofarray(int arr[],int target){
     int last = arr.length-1;
     int first = 0;
     while(first<=last){
     for(int i=0;i<arr.length;i++){
        int sum = first+last;
        if(sum==target){
            return true;
        }else if(sum<target){
            first++;
        }else{
            last--;
        }
     }
    } 
     return false;
    }
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the size of an array");
     int size = sc.nextInt();
     System.out.println("enter elements");
     int arr[] = new int[size];
     for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
     }
     System.out.println("enter the target value");
     int target = sc.nextInt();
     boolean result = Sumofarray(arr, target);
     System.out.println(result);
    }
}