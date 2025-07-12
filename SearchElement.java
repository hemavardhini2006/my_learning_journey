import java.util.Scanner;
public class SearchElement{
    public static int gettarget(int[] arr,int x)
{
 int target = x;
 for(int i=0;i<arr.length;i++){
    if(target==arr[i]){
        return i;
    }
 }
 return -1;
}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int arr[] = {1,4,2,6,5};
    int x= sc.nextInt();
    int result = gettarget(arr, x);
    System.out.println("the element present in ");
    System.out.println(result);
}
}
