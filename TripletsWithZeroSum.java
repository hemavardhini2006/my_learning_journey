import java.util.*;
public class TripletsWithZeroSum{
    public static List<List<Integer>> triplesum(int[] arr,int target){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        for(int i =0;i<n-2;i++){
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            int left = i+1;
            int last=n-1;
            while(left<last){
                int sum = arr[i]+arr[left]+arr[last];
                if(sum==target){
                    result.add(Arrays.asList(arr[i],arr[left],arr[last]));
                    while(left<last && arr[left]==arr[left+1]){
                        left++;
                    }
                    while(left<last && arr[last]==arr[last-1]){
                        last--;
                    }
                    left++;
                    last--;
                }else if(sum<target){
                    left++;
                }else{
                    last--;
                }
            }
        }
   return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int a = sc.nextInt();
        System.out.println("enter elements");
        int arr[] = new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int target = 0;
        System.out.println("sum of three elements in the array is (equal/not equal) to the targer element");
        List<List<Integer>> result = triplesum(arr, target);
        for(List<Integer> res:result){
            System.out.println(res);
        }  
    }
    }

