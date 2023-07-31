package PRACTICE.QUEUE;

public class queue3Circular {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = 0;
    int front = 0;
    private int size = 0;

    public queue3Circular() {
        this(DEFAULT_SIZE);
    }

    public queue3Circular(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }

        int removed = data[front];
        front = front % data.length;
        size--;
        return removed;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return data[front];
    }

    public void display() {
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }
        int i = front;
        do{
            System.out.println(data[i] + " ");
            i++;
            i %= data.length;
        }
        while(i != end);
        System.out.println("END");
    }

    public static void main(String[] args) throws Exception {
        queue3Circular queue = new queue3Circular(5);

        queue.insert(3);
        queue.insert(6);
        queue.insert(5);
        queue.insert(19);
        queue.insert(1);

        queue.display();

        // System.out.println(queue.remove());

        // queue.display();
    }

}
