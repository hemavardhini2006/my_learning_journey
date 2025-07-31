import java.util.*;
public class SieveEnatosthems {
     public static List<Integer> FindPrimeNum(int num){
        List<Integer> list = new ArrayList<>();
      int N =num;
      int prime[] = new int[N+1];
      for(int i=2;i<=N;i++){
        prime[i] = 1;
      }
      for(int i=2;i*i<=N;i++){
        if(prime[i]==1){
            for(int j = i*i;j<=N;j+=i){
                prime[j] = 0;
            }
        }
      }
      for(int i=2;i<=N;i++){
        if(prime[i]==1){
          list.add(i);
        }
      }
      return list;
     }
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        List<Integer> res = FindPrimeNum(num);
        System.out.println("the posible prime numbers are available inbetween the"+" "+num+" "+"is :");
        System.out.println(res);
     }
}
