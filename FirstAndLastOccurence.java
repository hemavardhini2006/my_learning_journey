import java.util.*;
public class FirstAndLastOccurence{
    public static int[] FindFirstLast(int[] arr,int target){
       int first = searchOccerence(arr,target,true);
       int last = searchOccerence(arr,target,false);
       return new int[]{first,last};
    }
    public static int searchOccerence(int[] arr,int tar,boolean firstlast){
        int low = 0,high = arr.length-1,ans=-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==tar){
                ans = mid;
                if(firstlast){
                    high = mid-1;
                }else{
                    low=mid+1;
                }
            }else if(arr[mid]<tar){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter target");
        int tar = sc.nextInt();
    int res[]=FindFirstLast(arr,tar);
    System.out.println("the first and last occurence is"+" "+res[0]+" - "+res[1]);
    }
}
