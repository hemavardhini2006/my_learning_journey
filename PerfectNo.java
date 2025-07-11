import java.util.Scanner;
public class PerfectNo{
    public static boolean findperfect(int N){
        int sum =0;
        for(int i=1;i<N;i++){
         if(N%i==0){
            sum =sum+i;
         }
        }
        boolean num = sum==N?true:false;
        return num;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean result = findperfect(N);
        System.out.println(result);
    }
}
