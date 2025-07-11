import java.util.Scanner;
public class ReverseDigit{
    public  static int count(int a){
        int num = a;
        int rem = 0;
        while(a>0){
            int last = a%10;
            rem = rem*10+last;
            a=a/10;
        }
        return rem;
    }
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int a=sc.nextInt();
     int result = count(a);
     System.out.println(result);
    }
}
