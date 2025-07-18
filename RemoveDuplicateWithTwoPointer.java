import java.util.*;
public class RemoveDuplicateWithTwoPointer {
  public static int duplicateRemove(int a[]){
    Arrays.sort(a);
    int i =0;
    for(int j=1;j<a.length;j++){
      if(a[i]!=a[j]){
        i++;
        a[i]=a[j];
      }
    }
    return i+1;
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size");
    int size = sc.nextInt();
    System.out.println("enter elements");
    int a[] = new int[size];
    for(int i =0;i<a.length;i++){
        a[i] = sc.nextInt();
    }
    System.out.println("after removal of duplicates the size of array is ");
    int result = duplicateRemove(a);
    System.out.println(result);
    System.out.println("elements in the array");
    for(int k =0;k<result;k++){
     System.out.println(a[k]);
    }
  }
}
