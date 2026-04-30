import java.util.*;
import java.util.PriorityQueue;
public class MakeSingleRope {
    public static int minCost(int[] arr){
        int sum =0;
        int tt;
        PriorityQueue<Integer> pq = new PriorityQueue<>();//{2,3,4,6}
        for(int s : arr){
            pq.add(s);
        }
        while(pq.size() > 1){
            int fir = pq.poll();//2//4//9
            int sec = pq.poll();//3//5//6
            tt = (fir+sec);
            sum += tt;
            pq.add(tt);//{4,5,6}//{9,6}
        }
       return sum;
    }
    public static void main(String[] args){
        int[] arr = {4,2,7,6,9};
        int minnn =  minCost(arr);
        System.out.println(minnn);
    }
}
