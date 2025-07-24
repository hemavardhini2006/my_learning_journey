import java.util.*;
public class CountInversion {
  public static List<List<Integer>> CountTheInversion(int[] arr){
    List<List<Integer>> list = new ArrayList<>();
    for(int i=0;i<arr.length;i++){
        for(int j = i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                list.add(Arrays.asList(arr[i],arr[j]));
            }
        }
    }
   return list; 
}  
public static void main(String[] args){
    int arr[] = {2,4,1,3,5};
    List<List<Integer>> result = CountTheInversion(arr);
    System.out.println(result);
}
}
