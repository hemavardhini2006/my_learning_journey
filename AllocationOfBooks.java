import java.util.*;
public class AllocationOfBooks {
    public static int allocationBook(int arr[],int stud){
    int n=arr.length;
    int sum = Arrays.stream(arr).sum();
    int low = Arrays.stream(arr).max().getAsInt();
    int high = sum;
    while(low<=high){
        int mid = (low+high)/2;
        int students = CanWePlace(arr,mid);
        if(students>stud){
            low = mid+1;
        }
        else{
            high = mid-1;
        }
        
    } 
    return low;
}
    public static int CanWePlace(int[] arr,int maxPages){
        int Countstud= 1;
        int sumation = 0;
        for(int i=0;i<arr.length;i++){
            if(sumation+arr[i]<=maxPages){
                sumation+=arr[i];
            }
            else{
                Countstud++;
                sumation = arr[i];
            }
        }
        return Countstud;
    }
  public static void main(String[] args){
    int arr[] = {25,46,28,49,24};
    int stud = 4;
    int result = allocationBook(arr,stud);
    System.out.println(result);
  }  
    }
