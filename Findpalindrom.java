import java.util.Scanner;
public class Findpalindrom
{
public static boolean palindrom(int N){
    int copy = N;
    int rem = 0;
    while(N>0){
        int digi = N%10;
        rem = rem*10+digi;
        N=N/10;
    }
    boolean ans = copy==rem?true:false;
    return ans;
}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    boolean result = palindrom(N);
    System.out.println(result);
}
}
