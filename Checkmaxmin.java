import java.util.Scanner;
class Pair{
    int min;
    int max;
    Pair(int min,int max){
        this.min = min;
        this.max = max;
    }
}
public class Checkmaxmin{
    public static Pair getminmax(int[] arr){
      int min = arr[0];
      int max = arr[0];
      for(int i=1;i<arr.length;i++){
        if(arr[i]<min){
            min = arr[i];
        }
        if(arr[i]>max){
            max = arr[i];
        }
      }
      return new Pair(min,max);
    }
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        System.out.println("enterr the elements");
        int arr[] = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Pair result = getminmax(arr);
        System.out.println("the min value is"+result.min);
        System.out.println("the max value is"+result.max);
    }
}