import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class MyQueue {
    Node front, rear;
    int count;

    MyQueue() {
        front = null;
        rear = null;
        count = 0;
    }

    // enqueue
    void enqueue(int x) {
        Node temp = new Node(x);

        if (front == null) {
            front = rear = temp;
        } else {
            rear.next = temp;
            rear = temp;
        }
        count++;
    }

    // dequeue
    void dequeue() {
        if (front == null) return;

        front = front.next;
        count--;

        if (front == null) {
            rear = null;
        }
    }

    // getFront
    int getFront() {
        if (front == null) return -1;
        return front.data;
    }

    // isEmpty
    boolean isEmpty() {
        return front == null;
    }

    // size
    int size() {
        return count;
    }
}

// Driver class
public class Main {
    public static void main(String[] args) {

        MyQueue q = new MyQueue();

        q.enqueue(5);
        q.enqueue(3);
        q.enqueue(4);

        System.out.println(q.getFront()); // 5

        q.dequeue();

        System.out.println(q.size());     // 2
        System.out.println(q.isEmpty());  // false
    }
}