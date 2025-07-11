import java.util.Scanner;

public class FindLastDigit {

    public static int lastdigit(String a, String b) {

        int num = a.charAt(a.length() - 1) - '0';

        if (b.equals("0"))
            return 1;

        int rem = 0;

        for (int i = 0; i < b.length(); i++){
            int digit = b.charAt(1) - '0';

        rem = (rem * 10 + digit) % 4;
        }
        if (rem==0)
            rem = 4;

        double power = Math.pow(num, rem);

        int finaly = (int) power % 10;

        return finaly;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        String b = sc.nextLine();

        int result = lastdigit(a, b);

        System.out.println(result);
    }
}
