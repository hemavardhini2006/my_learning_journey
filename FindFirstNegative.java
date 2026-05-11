import java.util.*;
import java.util.LinkedList;
public class FindFirstNegative {
    public static void main(String[] args){
        int[] arr = {12,-1,-7,8,-15,30,16,28};
        int k = 3;
        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<k;i++){
            if(arr[i]<0){
                queue.add(i);
            }//queueu = 0
        }
        if(!queue.isEmpty()){
         list.add(arr[queue.peek()]);
        }else{
            list.add(0);//list=-2
        }

        for(int i=k;i<arr.length;i++){
            if(!queue.isEmpty() && queue.peek()<=i-k){
                queue.poll();
            }
            if(arr[i]<0){
                queue.add(i);
            }
            if(!queue.isEmpty()){
         list.add(arr[queue.peek()]);
        }else{
            list.add(0);//list=-2
        }
        }
        System.out.println(list);
    }
}
