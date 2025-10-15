import java.util.Arrays;
public class Selectionsort {
  public static int[] selection(int[] arr){
    int n = arr.length;
    for(int i =0;i<n-1;i++){
        int min = i;
        for(int j = i;j<n;j++){
            if(arr[min]>arr[j]){
                min = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }
    return arr;

  }
  public static void main(String[] args){
    int[] arr = {56,3,8,9,2};
    int[] result = selection(arr);
    System.out.println(Arrays.toString(result));
  }  
}
