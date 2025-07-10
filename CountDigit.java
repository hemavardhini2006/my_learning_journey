 import java.util.Scanner;

public class CountDigit {
    public static int count(int a) {
        int last = a % 10;
        int num = a;
        int count = 0;

        while (a > 1) {
            if (a % last == 0) {
                count++;
            }
            a = a / 10;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = count(a);
        System.out.println(result);
    }
}
