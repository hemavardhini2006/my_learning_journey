import java.util.*;
import java.util.LinkedList;
public class ReturnMaxInEachWindow {
     public static void main(String[] args){
        int[] arr = {5,4,3,2,1,0};
        int k = 2;
        //5,4 == max= 5 
        Deque<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<k;i++){
            while(!queue.isEmpty() && arr[queue.peekLast()]<arr[i]){
               queue.pollLast();
            }
                queue.add(i);//queue=0(5,4)
        }
        if(!queue.isEmpty()){
           list.add(arr[queue.peekFirst()]);
        }
        for(int i=k;i<arr.length;i++){
            if(!queue.isEmpty() && queue.peekFirst()<=i-k){
                queue.pollFirst();//queu == 4;
            }
             while(!queue.isEmpty() && arr[queue.peekLast()]<arr[i]){
               queue.pollLast();
            }
             queue.add(i);
            
            list.add(arr[queue.peekFirst()]);
        }
        System.out.println(list);
        }
    }
