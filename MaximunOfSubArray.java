import java.util.*;
public class MaximunOfSubArray {
     public static int FindMaxiValueInSub(int nums[]){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int num:nums){
            sum = sum+num;
            if(sum>max){
              max = sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
     }
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of elements");
        int size = sc.nextInt();
        System.out.println("enter the elements");
        int nums[] = new int[size];
        for(int i = 0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
        int result = FindMaxiValueInSub(nums);
        System.out.println(result);
     }
}
