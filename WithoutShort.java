import java.util.Arrays;
public class WithoutShort{
  public static int[] shortelement(int[] arr){
    int low=0;
    int mid=0;
    int high = arr.length-1;
    while(mid<=high){
     if(arr[mid]==0){
        int temp = arr[mid];
        arr[mid]=arr[low];
        arr[low]=temp;
        low++;
        mid++;
     }
     else if(arr[mid]==1){
      mid++;
     }else if(arr[mid]==2){
        int temp = arr[mid];
        arr[mid]=arr[high];
        arr[high]=temp;
        high--;
     }
    }
    return arr;
  }
  public static void main(String[] args){
   // Scanner sc = new Scanner(System.in);
    int arr[] = {2,0,1,1,0,2};
    int[] result =shortelement(arr);
    System.out.println(Arrays.toString(result)); 
  }
}
