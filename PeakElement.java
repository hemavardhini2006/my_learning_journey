public class PeakElement {

    
    public static int findPeakBinary(int[] arr) {
        int n = arr.length;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

           
            boolean leftOK = (mid == 0) || (arr[mid] > arr[mid - 1]);
            boolean rightOK = (mid == n - 1) || (arr[mid] > arr[mid + 1]);

            if (leftOK && rightOK) {
                return mid; 
            }
            else if (mid < n - 1 && arr[mid] < arr[mid + 1]) {
                low = mid + 1; 
            }
            else {
                high = mid - 1;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 7, 8, 3};
        int[] arr2 = {10, 20, 15, 2, 23, 90, 80};

        System.out.println(findPeakBinary(arr1));
        System.out.println(findPeakBinary(arr2)); 
    }
}