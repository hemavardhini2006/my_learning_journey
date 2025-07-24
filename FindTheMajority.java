import java.util.*;
public class FindTheMajority {
    public static int MajorityElemet(int nums[]){
        int element=0;
        int count=0;
        for(int num :nums){
        if(count == 0){
          element=num;
        }
        count+=(element==num)?1:-1;
        }
        int frequency=0;
        for(int num:nums){
            if(num==element){
                frequency++;
            }
        }
        if(frequency>nums.length/2){
            return element;
        }
    return -1;
    }
    public static void main(String[] args){
        int nums[] = {1,1,2,2,3,4,2,5,2,6,7,5,2,5,5,5,5,5,5,5,5,5,5,5,5,5};
        System.out.println("length of array" +" "+ nums.length);
        System.out.println("divide the length of array by (2)"+" "+ +nums.length/2);
        int result = MajorityElemet(nums);
        System.out.println(result);
            } 
}
