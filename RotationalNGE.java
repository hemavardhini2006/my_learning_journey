import java.util.*;
class Soll{
   public int[] RNGE(int[] arr){
      int n = arr.length;
      int[] result = new int[n];
      Stack<Integer> stack = new Stack<>();
      Arrays.fill(result, -1);
      for(int i = 2*n - 1;i>=0;i--){
        int index = i%n;
        while(!stack.isEmpty() && stack.peek()<=arr[index]){
            stack.pop();
        }
        if(i<n && !stack.isEmpty()){
            result[index] = stack.peek();
        }
        stack.push(arr[index]);
      }
      return result;
   }
}
public class RotationalNGE {
    public static void main(String[] args){
        Soll sol = new Soll();
        int[] arr = {3,4,5,6,1};
        int[] res = sol.RNGE(arr);
        System.out.println(Arrays.toString(res));
    }
}
