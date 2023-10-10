package GFG_9_LINKEDLIST;

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

    public static void main(String[] args) {
        qNode head = new qNode(1);
        qNode temp1 = new qNode(2);
        qNode temp2 = new qNode(4);

        head.next = temp1;
        temp1.next = temp2;

        printList(head);

        qNode el = new qNode(5);
        head = sortedInsert(head, el);
        printList(head);
    }
}
