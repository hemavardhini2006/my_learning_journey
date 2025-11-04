import java.util.Scanner;

class SearchinNode {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        myLinkedList list = new myLinkedList();

        list.add(4);
        list.add(5);
        list.add(7);
        list.add(9);

        list.display();

        System.out.println("Enter the element you want to search:");
        int tar = sc.nextInt();
        list.isThere(tar);
    }
}

class myLinkedList {
    Node head;

    class Node {
        int data;
        Node next;
        public Node(int val) {
            data = val;
            next = null;
        }
    }

    public myLinkedList() {
        head = null;
    }

    public void add(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void display() {
        Node temp = head;
        System.out.print("Linked List Elements: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public boolean isThere(int tar) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == tar) {
                System.out.println(tar + " is present in the list.");
                return true;
            }
            temp = temp.next;
        }
        System.out.println(tar + " is not present in the list.");
        return false;
    }
}
