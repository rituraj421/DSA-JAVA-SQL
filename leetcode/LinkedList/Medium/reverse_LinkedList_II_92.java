package leetcode.LinkedList.Medium;

import java.util.LinkedList;

import leetcode.ARRAY.Easy.ListNode;

public class reverse_LinkedList_II_92 {
    static ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }

        // skip the first left-1 nodes
        ListNode current = head;
        ListNode prev = null;
        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }

        ListNode last = prev;
        ListNode newEnd = current;

        // reverse between left and right
        ListNode next = current.next;
        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }

        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }

        newEnd.next = current;
        return head;
    }

    public static void main(String[] args) {
        System.out.println(reverseBetween(null, 2, 4));
        LinkedList<Integer> list = new LinkedList<Integer>();

        // question1 list = new question1();
        list.addFirst(5);
        list.addFirst(4);
        list.addLast(3);
        list.addLast(2);
        list.addLast(1);
        System.out.println(list);
    }
}
