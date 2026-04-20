import java.util.*;
public class GasStationGreedy {
    public static int detecting(int[] gas,int[] cost){
        int total = 0;int tank = 0;int start =0;
        for(int i =0;i<gas.length;i++){
            int diff = gas[i]-cost[i];
            total += diff;
            tank += diff;
            if(tank<0){
                start = start+1;
                tank=0;
            }
        }
        return (total>=0)?start:-1;
    }
          public static void main(String[] args){
        int[] gas = {4,5,7,4};
        int[] cost = {6,6,3,5};
        int res = detecting(gas,cost);
        System.out.println(res);

      }
}
