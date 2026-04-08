import java.util.*;
class Arrays {
    int arr[];
    int rare;
    int front;
    int size;
    public Arrays(int size){
        this.size = size;
        arr = new int[size];
        front = 0;
        rare = -1;
    }
    public void enqueue(int x){
        if(rare==size-1){
            return;
        }
        rare++;
        arr[rare]=x;
    }
    public void dequeue(){
        if(front>rare){
            return;
        }
        front++;
    }
    int getfront(){
        if(front>rare){
            return -1;
        }
        else{
            return arr[front];
        }
    }
}
public  class ArraysQueue{
    public static void main(String[] args){
     Arrays arra = new Arrays(3);
     arra.enqueue(6);
    arra.enqueue(4);
    arra.enqueue(7);
    System.out.println(arra.getfront());
arra.dequeue();
     //System.out.println(arra.getfront());
}
}


