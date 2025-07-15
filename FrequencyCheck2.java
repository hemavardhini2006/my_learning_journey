import java.util.*;
public class FrequencyCheck2 {
    public static List<Integer> findFrequency(int[] arr,int n){
      List<Integer> result = new ArrayList<>(Collections.nCopies(n,0));
      for(int i =0;i<arr.length;i++){
        int num = arr[i];
        if(num>=1 && num<=n){
            int index = num-1;
            int count = result.get(index);
            result.set(index,count+1);
        }
      }
      return result;
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of (a) array");
    int a= sc.nextInt();
    System.out.println("enter element for (a) array");
    int arr[]= new int[a];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int n = arr.length;
    System.out.println("the frequency of an array from 1 to"+" "+n);
    List<Integer> res = findFrequency(arr,n);
    //for(int value:res){
      //System.out.println(value);
    //}
    System.out.println(res);
 }
}
