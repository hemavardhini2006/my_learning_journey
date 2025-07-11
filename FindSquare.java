import java.util.Scanner;
public class FindSquare{
 public static int sguareroot(int N){
    for(int i =1;i*i<=N;i++){
        if(i*i==N){
            return i;
        }
    }
    return -1;
 }
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int result = sguareroot(N);
    System.out.println(result);
    
 }
}
