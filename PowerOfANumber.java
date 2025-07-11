import java.util.Scanner;
public class PowerOfANumber{
    public static int count(int a){
        int num = a;
        int rem = 0;
        while(a>0){
            int last = a%10;
            rem = rem*10+last;
            a=a/10;
        }
        double power = Math.pow(num,rem);
        int finaly = (int)power;
      return finaly;  
      }
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = count(a);
        System.out.println(result);
      }
}