import java.util.*;
public class ReturnTheCeleibrity {
    public static int resolving(int[][] mat){
        int n = mat.length;
        int canditate = 0;
        for(int i=1;i<n;i++){
            if(mat[canditate][i]==1){
                canditate = i;
            }
        }
        for(int i=0;i<n;i++){
            if(canditate != i){
                if(mat[canditate][i]==1 || mat[i][canditate]==0){
                    return -1;
                }
            }
        }
        return canditate;
    }
     public static void main(String[] args){
        int[][] mat = {
            {1,1,0},
            {0,1,0},
            {0,1,1}
        };
        int res = resolving(mat);
        System.out.println(res);
     }
}
