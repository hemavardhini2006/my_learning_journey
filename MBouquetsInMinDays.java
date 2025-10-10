import java.util.Arrays;
public class MBouquetsInMinDays {
    public static int MinDayToMakeBouquets(int[] BloomDay,int m ,int k){
          int n = BloomDay.length;
          if(n<(m*k)){
            return -1;
          }
          int low = Arrays.stream(BloomDay).min().getAsInt();
          int high = Arrays.stream(BloomDay).max().getAsInt();
          int ans = high;
          while(low<=high){
            int mid = (low+high)/2;
            if(possible(BloomDay,mid,m,k)){
                 ans = mid;
                 high = mid-1;
            }
            else{
                low = mid+1;
            }
          }
          return ans;
    }
    public static boolean possible(int[] BloomDay,int days,int m,int k){
        int count = 0;
        int NoOfBouquets = 0;
        for(int i=0;i<BloomDay.length;i++){
            if(BloomDay[i]<=days){
                count++;
            }else{
                NoOfBouquets +=count/k;
                count=0;
            }
        }
        NoOfBouquets +=count/k;
        if(NoOfBouquets>=m){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        int BloomDay[] = {7,7,7,7,13,11,12,7};
        int m = 2;//no of bouquets
        int k = 3;//no of k adjent flower int each bouquets
        int result = MinDayToMakeBouquets(BloomDay,m,k);
        System.out.println(result);
    }
}
