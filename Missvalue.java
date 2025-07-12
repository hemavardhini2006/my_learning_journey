import java.util.Scanner;
public class Missvalue{
    public static int FindMissElement(int[] num){
     int a =num.length+1;
     int actual = a*(a+1)/2;
     int sum=0;
        for(int j =0;j<num.length;j++){
            sum = sum+num[j];
        }
     return actual-sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n = sc.nextInt();
        System.out.println("enter elements");
        int num[] = new int[n];
        for(int i=0;i<num.length;i++){
          num[i]=sc.nextInt();
        }
        int result = FindMissElement(num);
        System.out.println("the miss number is"+result);
    }
}
