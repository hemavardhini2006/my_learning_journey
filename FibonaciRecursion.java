import java.util.Scanner;
public class FibonaciRecursion {
  public static int FindFibonacii(int n){
    if(n==0)
      return 0;
    if(n==1)
      return 1;
    return FindFibonacii(n-1)+FindFibonacii(n-2);
  } 
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int result = FindFibonacii(n);
    System.out.println(result);
  } 
}
