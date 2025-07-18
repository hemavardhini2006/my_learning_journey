import java.util.*;
public class UnionArray {
    public static List<Integer> union(int a[],int b[]){
        Set<Integer> result = new HashSet<>();
        for(int num:a){
            result.add(num);
        }
        for(int num:b){
            result.add(num);
        }
        List<Integer> goal=new ArrayList<>(result);
        Collections.sort(goal);
        return goal;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of (a)Array");
        int size1 = sc.nextInt();
        int a[] = new int[size1];
        System.out.println("enter elements of (a) Array");
        for(int i =0;i<a.length;i++){
           a[i] = sc.nextInt();
        }
        System.out.println("enter size of (b)Array");
        int size2 = sc.nextInt();
        int b[] = new int[size2];
        System.out.println("enter elements of (b) Array");
        for(int i =0;i<b.length;i++){
           b[i] = sc.nextInt();
        }
        System.out.println("union of(a)&(b)");
        List<Integer> finaly = union(a , b);
        for(int res:finaly){
            System.out.println(res);
        }
    }
}
