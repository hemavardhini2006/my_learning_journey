import java.util.*;
public class BoubleSort {
    public static int[] boublesort(int arr[]){
        int n = arr.length;
        for(int i = n-1;i>=1;i--){
            for(int j = 0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;

    } 
    public static void main(String[] args){
        int arr[] = {43,23,52,12,91,32};
        int[] result = boublesort(arr);
        System.out.println(Arrays.toString(result));
    }
}
