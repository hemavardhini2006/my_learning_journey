import java.util.*;
public class InsertionArray {
   public static int insertion(int[] a,int[] b){
    Set<Integer> set1 = new HashSet<>();
    for(int num:a){
      set1.add(num);
    }
    int count =0;
    Set<Integer> set2 = new HashSet<>();
    for(int num:b){
        if(set1.contains(num) && !set2.contains(num)){
            count++;
            set2.add(num);
        }
    }
    return count;
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
        System.out.println("intersection of(a)&(b)");
        int finaly = insertion(a , b);
        System.out.println(finaly);
    }
}
