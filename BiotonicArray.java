public class BiotonicArray {
    public static int findpeak(int arr[]){
        int n=arr.length;
        int low=0;
        int high = n-1;
        while(low<=high){
            int mid =low+(high-low)/2;
            boolean leftside = (mid==0) || (arr[mid]>arr[mid-1]);
            boolean rightside = (mid==n-1)|| (arr[mid]>arr[mid+1]);
            if(leftside && rightside){
                return mid;
            }else if(mid<n-1 && arr[mid]<arr[mid+1]){
                low = mid+1;
            }
            else{
                high =mid-1;
            }
            
        }
        return -1;
    }
    
    private static int binarySearchAsc(int[] arr, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    private static int binarySearchDesc(int[] arr, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] > target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
    public static int findindex(int arr[],int target){
     int peak = findpeak(arr);
     int left =binarySearchAsc(arr,0,peak,target);
         if(left !=-1) return left;
     return  binarySearchDesc(arr,peak+1,arr.length-1,target);
     
    }

    
    public static void main(String[] args){
     int arr[] = {2,3,9,12,11,7,3};
     int target = 7;
     int result = findindex(arr,target);
     System.out.println(result);
    }
}
