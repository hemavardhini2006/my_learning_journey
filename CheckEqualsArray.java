import java.util.HashMap;
import java.util.Scanner;
public class CheckEqualsArray {
    public static boolean EqualsArray(int[] a,int[] b){
     if(a.length!=b.length){
        return false;
     }
     HashMap<Integer,Integer> map = new HashMap<>();
     for(int num:a){
        map.put(num,map.getOrDefault(num, 0)+1);
     }
     for(int num:b){
        if(!map.containsKey(num)){
            return false;
        }
        map.put(num,map.get(num)-1);
        if(map.get(num)==0){
            map.remove(num);
        }

     }
     return map.isEmpty();
    }
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of (a) array");
    int n= sc.nextInt();
    System.out.println("enter the size of (b) array");
    int m = sc.nextInt();
    System.out.println("enter element for (a) array");
    int a[]= new int[n];
    int b[] = new int[m];
    for(int i=0;i<a.length;i++){
        a[i]=sc.nextInt();
    }
    System.out.println("enter the elements of (b) array");
    for(int j=0;j<b.length;j++){
        b[j]=sc.nextInt();
    }
    boolean result = EqualsArray(a, b);
    System.out.println(result);
 }
}
