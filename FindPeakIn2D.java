import java.util.Arrays;

public class FindPeakIn2D {
    public static int[] findpeak(int[][] arr) {
        if (arr == null || arr.length == 0 || arr[0].length == 0) return new int[] { -1, -1 };

        int n = arr.length;
        int m = arr[0].length;
        int low = 0;
        int high = m - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int row = maxRowInColumn(arr, mid); 

            int left = (mid - 1 >= 0) ? arr[row][mid - 1] : -1;
            int right = (mid + 1 < m) ? arr[row][mid + 1] : -1;
             if (arr[row][mid] > left && arr[row][mid] > right) {
                return new int[] { row, mid }; 
            } else if (left > arr[row][mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return new int[] { -1, -1 };
    }
    private static int maxRowInColumn(int[][] arr, int col) {
        int maxRow = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i][col] > arr[maxRow][col]) maxRow = i;
        }
        return maxRow;
    }

    public static void main(String[] args) {
        int arr[][] = {
            {4, 2, 5, 4, 5},
            {2, 9, 3, 2, 3},
            {1, 7, 6, 0, 1},
            {3, 6, 2, 3, 7}
        };

        int[] result = findpeak(arr);
        if (result[0] == -1) {
            System.out.println("No peak found.");
        } else {
            System.out.println("Peak found at (row, col): " + Arrays.toString(result));
            System.out.println("Peak value: " + arr[result[0]][result[1]]);
        }
    }
}
