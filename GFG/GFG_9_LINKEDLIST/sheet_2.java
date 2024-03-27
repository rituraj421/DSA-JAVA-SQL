package GFG_9_LINKEDLIST;

// insert at the end of linked list
 class Noder {
    int data;
    Noder next;

    Noder(int x) {
        data = x;
        next = null;
    }
}

// insert at a given position
class Node1 {
    int data;
    Node1 next;

    Node1(int xx) {
        data = xx;
        next = null;
    }
}

public class sheet_2 {

    static void printList(Noder head) {
        Noder curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    static void addEnd(Noder head, int y) {
        Noder end = new Noder(y);
        if (head == null) {
            return;
        }
        Noder curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = end;
    }

    // add an element at a given position
    static void printList1(Node1 head1) {
        Node1 curr = head1;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    static void addIndex(Node1 head1, int pos, int ele) {
        Node1 temp = new Node1(ele);
        Node1 curr = head1;
        for (int i = 0; i < pos - 1 && (curr != null); i++) {
            curr = curr.next;
        }
        temp.next = curr.next;
        curr.next = temp;
    }

    static Node1 deleHead(Node1 head1){
        if(head1 == null){
            return null;
        }
        return head1.next;
    }
    public static void main(String[] args) {
        Noder head = new Noder(10);
        Noder n1 = new Noder(20);
        Noder n2 = new Noder(30);
        Noder n3 = new Noder(40);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;

        // printList(head);
        // addEnd(head, 7);
        // printList(head);

        // insert an element at a given index
        Node1 head1 = new Node1(1);
        Node1 xx1 = new Node1(2);
        Node1 xx2 = new Node1(3);
        Node1 xx3 = new Node1(4);

        head1.next = xx1;
        xx1.next = xx2;
        xx2.next = xx3;

        printList1(head1);
        addIndex(head1, 2, 20);
        printList1(head1);

        head1 = deleHead(head1);
        printList1(head1);
    }
}
