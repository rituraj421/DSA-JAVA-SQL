package BASICS;

import java.util.ArrayDeque;

public class arrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();

        ad1.add(6);
        ad1.add(56);
        ad1.addFirst(3);
        System.out.println(ad1);
        System.out.println(ad1.getLast());
    }
}