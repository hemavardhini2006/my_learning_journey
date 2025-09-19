import java.util.*;
public class FindOnesWhere{
    public static int[] findonce(int[][] arr){
      int n = arr.length;
      if(n==0){
        return new int[]{-1,0};
      }
      int maxrow=-1;
      int j =n-1;
      for(int i=0;i<n;i++){
        while(j>=0 && arr[i][j]==1){
           j--;
           maxrow =i;
        }
      }
      int maxcount = (maxrow==-1)?0:(n-j-1);
      return new int[]{maxcount,maxrow};
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("only enter 0's and 1's to find the greatest presence of 1's in row retun that row also");
        System.out.println("enter size of row");
        int k = sc.nextInt();
        System.out.println("enter the size coloum");
        int y = sc.nextInt();
        int arr[][] = new int[k][y];
        System.out.println("enter elements");
        for(int i=0;i<k;i++){
            for(int j=0;j<y;j++){
                arr[i][j]=sc.nextInt(); 
            }
        }System.out.println("the 2 dimensional martrix is");
        for(int i=0;i<k;i++){
            for(int j=0;j<y;j++){
                System.out.print(arr[i][j]);

            }
            System.out.println();
        }
        int[] result = findonce(arr);
        System.out.println(Arrays.toString(result));
    }
}
