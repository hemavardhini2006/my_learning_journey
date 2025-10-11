import java.util.Arrays;
public class CapasityOfShip {
    public static int MinCapOfShip(int[] weight,int days){
        int n = weight.length;
        int low = Arrays.stream(weight).max().getAsInt();
        int high = Arrays.stream(weight).sum();
        while(low<=high){
            int mid = (low+high)/2;
            int reqdays = possible(weight,mid);
            if(reqdays<=days){
                 high = mid-1;
            }
            else{
                  low = mid+1;
            }
        }
        return low;
    }
    public static int possible(int[] weight,int cap){
        int dayss =1;
        int countcap =0;
        for(int i=0;i<weight.length;i++){
            if(weight[i]+countcap >cap){
               dayss++;
               countcap = weight[i];
            }
            else{
                countcap +=weight[i];
            }
        }
        return dayss;
    }
    public static void main(String[] args){
        int weight[] = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        int result = MinCapOfShip(weight,days);
        System.out.println(result);
    }
}
