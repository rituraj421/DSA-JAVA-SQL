package GFG_9_LINKEDLIST;

import java.util.ArrayList;
import java.util.HashSet;

class qNode {
    int data;
    qNode next;

    qNode(int x) {
        data = x;
        next = null;
    }
}

public class sheet_5_problems {

    public static void printList(qNode head) {
        qNode curr = head;
        if (head == null) {
            return;
        }
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // sorted insert
    static qNode sortedInsert(qNode head, qNode el) {
        qNode curr = head;
        if (head == null || head.data > el.data) {
            el.next = head;
            return el;
        }

        while (curr.next != null && curr.next.data < el.data) {
            curr = curr.next;
        }
        el.next = curr.next;
        curr.next = el;
        return head;

    }

    // middle of linked list
    static void middleList(qNode head) {
        if (head == null) {
            return;
        }
        qNode curr;
        int count = 0;
        for (curr = head; curr != null; curr = curr.next) {
            count++;
        }
        curr = head;
        for (int i = 0; i < count / 2; i++) {
            curr = curr.next;
        }
        System.out.println(curr.data);
    }

    // Nth node from the end
    static void nthNode(qNode head, int n) {
        // qNode num = new qNode(n);
        int len = 0;
        qNode curr;
        for (curr = head; curr != null; curr = curr.next) {
            len++;
        }
        curr = head;
        for (int i = 0; i < len - n; i++) {
            curr = curr.next;
        }
        System.out.println(curr.data);
    }

    // reverse a linked list
    static qNode reverseList(qNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (qNode curr = head; curr != null; curr = curr.next) {
            arr.add(curr.data);
        }
        for (qNode curr = head; curr != null; curr = curr.next) {
            curr.data = arr.remove(arr.size() - 1);
        }
        return head;
    }

    // remove duplicates
    static qNode remDup(qNode head) {
        qNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.data == curr.next.data) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }

    // intersection of two linked list
    static int intersectionList(qNode head1, qNode head2) {
        HashSet<qNode> set1 = new HashSet<>();
        qNode curr1 = head1;
        while (curr1 != null) {
            set1.add(curr1);
            curr1 = curr1.next;
        }
        curr1 = head2;
        while (curr1 != null) {
            if (set1.contains(curr1)) {
                return curr1.data;
            }
            curr1 = curr1.next;
        }
        return -1;
    }

    // pairewise swap
    static qNode pairSwap(qNode head) {
        qNode curr = head;
        while (curr != null && curr.next != null) {
            int temp = curr.data;
            curr.data = curr.next.data;
            curr.next.data = temp;
            curr = curr.next.next;
        }
        return head;
    }

    public static void main(String[] args) {
        qNode head = new qNode(1);
        qNode temp1 = new qNode(1);
        qNode temp2 = new qNode(4);
        qNode temp3 = new qNode(6);

        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;

        printList(head);

        qNode el = new qNode(5);
        head = sortedInsert(head, el);
        printList(head);

        // middle of a linked list
        middleList(head);
        printList(head);

        // nth node from the last
        // qNode num = new qNode(2);
        nthNode(head, 3);
        printList(head);

        // reverse a linked list
        head = reverseList(head);
        printList(head);

        // remove duplicates
        head = remDup(head);
        printList(head);

        // intersection of two linked list
        // first create the list
        qNode head1 = new qNode(1);
        qNode h1 = new qNode(2);
        qNode h11 = new qNode(3);

        head1.next = h1;
        h1.next = h11;

        // second list
        qNode head2 = new qNode(3);
        qNode h2 = new qNode(2);
        qNode h22 = new qNode(1);

        head2.next = h2;
        h2.next = h22;

        // intersectionList(head1, head2);
        // System.out.println(intersectionList(head1, head2));

        printList(head);
        head = pairSwap(head);
        printList(head);
    }
}
