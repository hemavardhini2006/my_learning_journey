import java.util.*;
public class  CountDistinctTriplets{
    public static int distincttriplets(int arr[]){
        Arrays.sort(arr);
        int n = arr.length;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            for(int j=i+1;j<arr.length;j++){
                if(j>0 && arr[j]==arr[j-1]){
                    continue;
                }

                    int sum = arr[i]+arr[j];
                    for(int k = 0;k<arr.length;k++){
                        if(sum == arr[k]){
                            count++;
                            break;
                        }
                    }
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the elements");
        int size = sc.nextInt();
        System.out.println("enter elements");
        int arr[] = new int[size];
       for(int i =0;i<arr.length;i++){
          arr[i] = sc.nextInt();
       }
       System.out.println("count is");
       int result = distincttriplets(arr);
       System.out.println(result);
    }
}

