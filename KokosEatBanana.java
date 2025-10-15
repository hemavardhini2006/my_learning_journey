import java.util.*;
public class KokosEatBanana {
    public static int KokoCanEat(int[] arr,int hours){
        int low = 1;
        int high = Arrays.stream(arr).max().getAsInt();
        
        while(low<=high){
            int mid = (low+high)/2;
            int reqhr = possiblity(arr,mid);
            if(reqhr<=hours){
               
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    public static int possiblity(int[] arr,int NoOfBananasPerHr){
        int reqHr =0;
        for(int i=0;i<arr.length;i++){
            reqHr += (int)Math.ceil((double)arr[i]/NoOfBananasPerHr);
        }
        return reqHr;
    }
    public static void main(String[] args){
        int arr[] = {3,6,7,11};
        int hour = 8;
        System.out.println("the koko can eat the bellow no.of bananas per hr to compleate all given banans with in a hour");
        int result = KokoCanEat(arr,hour);
        System.out.println(result);

    }
}
