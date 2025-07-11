import java.util.Scanner;
public class Primeno{
    public static boolean findprime(int N){
        if(N<=1){
            return false;
        }
        for(int i=2;i*i<=N;i++){
            if(N%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean result = findprime(N);
        System.out.println(result);
    }
}
