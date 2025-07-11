import java.util.Scanner;
public class FindAmstrong{
    public static boolean amstrong(int N){
        int orignal = N;
        int sum = 0;
        while(N>0){
            int dig = N%10;
            sum+=dig*dig*dig;
            N=N/10;
        }
        return sum==orignal;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        boolean result = amstrong(N);
        System.out.println(result);
    }
}
