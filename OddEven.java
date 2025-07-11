import java.util.Scanner;

public class OddEven {

    public static String findoddeven(int N) {
       if(N % 2==0)
         return "Even";
        return "odd";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String result = findoddeven(N);
        System.out.println(result);
    }
}
