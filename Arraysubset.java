import java.util.Scanner;
import java.util.HashMap;
public class Arraysubset{
   public static boolean checksubset(int[] a,int[] b){
    HashMap <Integer,Integer> map = new HashMap<>();
    for(int num : a){
        map.put(num,num);
    }
    for(int num:b){
        if(map.containsKey(b)){
            return true;
        }
    }
    return map.
   }
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] a = new int[7];
    for(int i=0;i<=a.length;i++){
        a[i]=sc.nextInt();
    }
    int[] b = new int[3];
    for(int j=0;j<=a.length;j++){
        b[j]=sc.nextInt();
    }
   boolean result = checksubset(a, b);
   System.out.println(result);
   }
}
