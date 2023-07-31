package PRACTICE.QUEUE;

import java.util.ArrayDeque;
import java.util.Deque;

public class dequeue1 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(44);
        deque.addFirst(45);
        deque.removeFirst();

        System.out.println(deque);
    }
}
