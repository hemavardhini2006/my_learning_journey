import java.util.*;
public class SumOfThreeElemet {
    public static boolean SumOfTarget(int arr[],int target){
        int n = arr.length;
        Arrays.sort(arr);
        for(int i = 0;i<n-2;i++){
            int first = i+1;
            int last = n-1;
            while(first<=last){
                int sum = first+last;
                if(sum==target){
                    return true;
                }
                else if(sum<target){
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
        System.out.println("enter the size of the array");
        int a = sc.nextInt();
        System.out.println("enter elements");
        int arr[] = new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the target element");
        int target = sc.nextInt();
        System.out.println("sum of three elements in the array is (equal/not equal) to the targer element");
        boolean result = SumOfTarget(arr, target);
        System.out.println(result);    
    }
}
