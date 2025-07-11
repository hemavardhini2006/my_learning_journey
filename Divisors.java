import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Divisors{
    public static List<Integer> printdivisor(int a){
        List<Integer> divi = new ArrayList<>();
        for(int i = 1;i<=a;i++){
            if(a%i == 0){
                divi.add(i);
            }
        }
        return divi;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        List<Integer> result = printdivisor(a);
        for(int num:result){
            System.out.println(num);
        }
    }
}  
