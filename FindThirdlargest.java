import java.util.Scanner;
public class FindThirdlargest{
    public static int thirddigit(int[] arr){
     if(arr.length<3){
        return -1;
     }
     int first = Integer.MIN_VALUE;
     int second = Integer.MIN_VALUE;
     int third = Integer.MIN_VALUE;
     for(int i = 0;i<arr.length;i++){
        int num = arr[i];
        if(num==first || num==second ||num==third){
            continue;
        }
        if(num>first){
           third=second;
           second=first;
           first=num; 
        }else if(num>second){
            third = second;
            second=num;
        }else if(num>third){
            third=num;
        }
     }
    return third;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        System.out.println("enter elements");
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int result = thirddigit(arr);
        System.out.println("the third larger value is:");
        System.out.println(result);
     }
}

