import java.util.*;
public class FactRecursion{
    public static int findrecousion(int n){
        if(n==1){
            return 1;
        }
        return n*findrecousion(n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =  sc .nextInt();
        int result = findrecousion(n);
        System.out.println(result);
    }
} 
    

