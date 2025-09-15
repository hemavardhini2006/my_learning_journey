public class OptimalFirstOne {
    static long firstOneIndex; 

    public static int get(long i) {
        return (i < firstOneIndex) ? 0 : 1;
    }

    public static long findFirstOne() {
        long low = 0, high = 1;

        
        while (get(high) == 0) {
            low = high + 1;
            high *= 2;
        }

    
        long ans = -1;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (get(mid) == 1) {
                ans = mid;
                high = mid - 1; 
            } else {
                low = mid + 1;  
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        firstOneIndex = 10; 
        System.out.println(findFirstOne()); 
    }
}
