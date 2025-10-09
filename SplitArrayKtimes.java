import java.util.Arrays;

public class SplitArrayKtimes {
  public static int painterPart(int arr[],int k){
    int n=arr.length;
    int sum = Arrays.stream(arr).sum();
    int low = Arrays.stream(arr).max().getAsInt();
    int high = sum;
    int ans= high;
    while(low<=high){
        int mid = (low+high)/2;
        int painters = CanWePlace(arr,mid);
        if(painters<=k){
            ans = mid;
            high = mid-1;
        }
        else{
            low =  mid +1;
        }
        
    } 
    return ans;
}
    public static int CanWePlace(int[] arr,int maxPages){
        int Countpaint= 1;
        int sumation = 0;
        for(int i=0;i<arr.length;i++){
            if(sumation+arr[i]<=maxPages){
                sumation+=arr[i];
            }
            else{
                Countpaint++;
                sumation = arr[i];
            }
        }
        return Countpaint;
}
public static void main(String[] args){
    int arr[] = {10,20,30,40};
    int k= 2;
    int result = painterPart(arr,k);
    System.out.println(result);
  } 
}
  
}
