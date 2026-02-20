class TwoStacks {
    int[] arr;
    int size;
    int top1, top2;

    // Constructor
    TwoStacks(int n) {
        size = n;
        arr = new int[n];
        top1 = -1;
        top2 = n;
    }

    void push1(int x) {
        if (top1 + 1 == top2) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top1] = x;
    }

    void push2(int x) {
        if (top1 + 1 == top2) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[--top2] = x;
    }

    int pop1() {
        if (top1 == -1) {
            return -1;
        }
        return arr[top1--];
    }

    int pop2() {
        if (top2 == size) {
            return -1;
        }
        return arr[top2++];
    }
}

public class TwoStackInOneArray{
    public static void main(String[] args) {

        TwoStacks ts = new TwoStacks(6);

        ts.push1(2);
        ts.push1(3);
        ts.push2(4);

        System.out.println(ts.pop1()); // 3
        System.out.println(ts.pop2()); // 4
        System.out.println(ts.pop2()); // -1

    }
}
