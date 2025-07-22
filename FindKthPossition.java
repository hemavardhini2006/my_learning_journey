
            else{
                mix[k] = b[j];
                j++;
                k++;
            }
        }import java.util.*;
public class FindKthPossition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[] = {2,5,7,9,11};
        int b[] = {1,3,6,20,25,50};
        System.out.println("after sorting the two sorted array is : ");
        int[] arr = merge(a,b);
        System.out.println(Arrays.toString(arr));
        System.out.println("enter the position i will return the value of this position");
        int pos = sc.nextInt();
        System.out.println(arr[pos]);
    }
    public static int[] merge(int[] a,int[]b){
        int mix[] = new int[a.length+b.length];
        int i = 0;
        int j =0;
        int k = 0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                mix[k] = a[i];
                i++;
                k++;
            }
        while(i<a.length){
            mix[k] = a[i];
            i++;
            k++;
        }
        while(j<b.length){
            mix[k] = b[j];
            j++;
            k++;
        }
        return mix;
    }
}
