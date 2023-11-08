package GFG_11_QUEUE;

class queue{
    int size;
    int cap;
    int[] arr;

    queue(int c){
        cap = c;
        size = 0;
        arr = new int[cap];
    }
    void enque(int x){
        arr[size] = x;
        size++;

        System.out.println(x + " is enqued");
    }

    void deque(){
        for(int i = 0; i<size-1; i++){
            arr[i] = arr[i+1];
        }
        size--;
    }

    int getFront(){
        return 0;
    }

    int getRare(){
        return size-1;
    }
}
public class sheet_1_queue {
    public static void main(String[] args) {
        // implement queue using array

        queue q = new queue(10);
        q.enque(10);

        System.out.println(q.getFront());
    }
}
