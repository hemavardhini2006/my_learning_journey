import java.util.Scanner;
public class Gcd{
    public static int count(int a,int b){
        int big = (a>b)?a:b;
        while(big>0){
            if(a%big == 0 && b%big == 0){
                return big;
            }
            big--;
        }
        return big;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = count(a, b);
        System.out.println(result);
    }
}