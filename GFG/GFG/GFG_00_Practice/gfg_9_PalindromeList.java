package GFG.GFG_00_Practice;

import java.util.ArrayList;
import java.util.Collections;

class Nodep {
    int data;
    Nodep next;

    Nodep(int x) {
        data = x;
        next = null;
    }
}

public class gfg_9_PalindromeList {
    static void printList(Nodep head) {
        Nodep curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // function to check if a list is pallindrome or not
    static boolean palli(Nodep head) {
        ArrayList<Integer> l1 = new ArrayList<>();
        for (Nodep curr = head; curr != null; curr = curr.next) {
            l1.add(curr.data);
        }

        ArrayList<Integer> reversed = new ArrayList<>(l1);
        Collections.reverse(reversed);

        // return l1 == reversed;
        return l1.equals(reversed);
    }

    public static void main(String[] args) {
        Nodep head = new Nodep(1);
        Nodep t = new Nodep(2);
        Nodep t1 = new Nodep(1);

        head.next = t;
        t.next = t1;

        printList(head);

        System.out.println(palli(head));
    }
}
