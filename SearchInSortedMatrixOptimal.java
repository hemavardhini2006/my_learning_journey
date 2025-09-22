public class SearchInSortedMatrixOptimal {
    public static boolean searchMatrix(int[][] mat, int x) {
        int n = mat.length;        
        int m = mat[0].length;     

        int low = 0, high = n * m - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int row = mid / m;
            int col = mid % m;

            int val = mat[row][col];

            if (val == x) return true;   
            else if (val < x) low = mid + 1; 
            else high = mid - 1;            
        }
        return false; 
    }

    public static void main(String[] args) {
        int[][] mat1 = {{1, 5, 9}, {14, 20, 21}, {30, 34, 43}};
        System.out.println(searchMatrix(mat1, 14)); 
    }
}
