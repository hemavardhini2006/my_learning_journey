import java.util.*;
public class Recursion{
    public static void findrecousion(int n){
        if(n==0){
            return;
        }
        findrecousion(n-1);
        System.out.println(n);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =  sc .nextInt();
        findrecousion(n);
    }
}