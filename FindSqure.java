public class FindSqure {
    public static int sqrtFloor(int n) {
        int low = 1, high = n, ans = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (mid * mid == n) {
                return mid; 
            } else if (mid * mid < n) {
                ans = mid;  
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans; 
    }

    public static void main(String[] args) {
        int n1 = 5;
        System.out.println(sqrtFloor(n1)); 
        //System.out.println(sqrtFloor(n2)); 
        //System.out.println(sqrtFloor(n3)); 
    
} }

