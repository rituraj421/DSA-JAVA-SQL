package PRACTICE.QUEUE;

import java.util.LinkedList;
import java.util.Queue;

public class queue1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(5);
        queue.add(6);
        queue.add(15);
        queue.add(19);

        System.out.println(queue.peek());
    }

}
