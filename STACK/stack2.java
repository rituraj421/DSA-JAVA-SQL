package STACK;

public class stack2 {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public stack2() {
        this(DEFAULT_SIZE);
    }

    public stack2(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        ptr++;
        data[ptr] = item;
        if (isFull()) {
            System.out.println("Stack is full");
            return false;
        }

        return true;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("cannot pop from an empty stack");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public int peak() throws Exception {
        if (isEmpty()) {
            throw new Exception("cannot pop from an empty stack");
        }
        return data[ptr];
    }

    protected boolean isFull() {
        return ptr == data.length - 1;
    }

    private boolean isEmpty() {
        return ptr == -1;
    }

    public static void main(String[] args) throws Exception {
        stack2 stack = new stack2(5);

        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(9);
        stack.push(18);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        // System.out.println(stack.pop());
    }
}
