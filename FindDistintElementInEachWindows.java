import java.util.*;
public class FindDistintElementInEachWindows{
    public static void DistintFind(int[] arr,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<k;i++){
          map.put(arr[i],map.getOrDefault(arr[i] ,0)+1);
        }
        System.out.println(map.size());
        for(int i =k;i<arr.length;i++){
            int last = arr[i-k];
            map.put(last,map.get(last)-1);
            if(map.get(last)==0){
                map.remove(last);
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            System.out.println(map.size());
        }
    }
        public static void main(String[] args){
    int[] arr = {1,2,1,3,4,5,6};
    int k = 4;
    DistintFind(arr,k);
}
}