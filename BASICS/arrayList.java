package BASICS;

import java.util.*;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();

        ArrayList<Integer> l2 = new ArrayList<>(5);
        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(14);
        l2.add(15);

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(5);
        l1.remove(2);
        l1.add(10);
        l1.add(1,0);
        l1.addAll(0, l2);
        System.out.println(l1);
        // alternate long forma to print array:ist
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i));
            System.out.print(", ");
            
        }
        System.out.println();
        System.out.println(l1.contains(7));
        System.out.println(l1.indexOf(7));
    }
}