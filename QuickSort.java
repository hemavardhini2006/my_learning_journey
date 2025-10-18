import java.util.*;
public class QuickSort {
    public static void quicksorting(int[] arr,int low,int high){
        if(low<high){
            int pIndex = partition(arr,low,high);
            quicksorting(arr, low, pIndex-1);
            quicksorting(arr, pIndex+1, high);
        }
    }
    public static int partition(int[] arr,int low,int high){
        int pivot = arr[low];
        int i = low;int j = high;
        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;  
            }
        }
        int temp = arr[low];
                arr[low] = arr[j];
                arr[j] = temp;  
        
        return j;
    }
   public static void main(String[] args){
    int arr[] = {34,2,6,53,97};
    int low = 0;
    int high = arr.length-1;
    quicksorting(arr,low,high);
    System.out.println(Arrays.toString(arr));
   } 
}
