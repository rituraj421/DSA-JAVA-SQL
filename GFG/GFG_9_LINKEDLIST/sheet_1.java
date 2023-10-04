package GFG_9_LINKEDLIST;

// simple linked list
class Node {
    int data;
    Node next;

    // now create its constructor(parametirised constructor)
    Node(int x) {
        data = x;
        next = null; // this is optional , in java if we do not write it will automatically take it
                     // as null
    }
}

// recursively print a list
class nud {
    int data;
    nud next;

    nud(int y) {
        data = y;
        next = null;
    }
}

// insert at the head of list
class Node2 {
    int data;
    Node2 next;

    Node2(int A) {
        data = A;
        next = null;
    }
}

public class sheet_1 {
    // creating a method to print the given list (in main funtion there are two
    // other methods as weel to print it )
    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // recursive method
    static void recPrintList(nud first) {
        if (first == null) {
            return;
        }
        System.out.print(first.data + " ");
        recPrintList(first.next);
    }

    // insert at the begin of list
    static Node2 insertBegin(Node2 head2, int A) {
        Node2 newNode = new Node2(A);
        newNode.next = head2;
        head2 = newNode;
        return newNode;
    }

    static void insertPri(Node2 head2) {
        Node2 curr = head2;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        
        head.next = temp1;
        temp1.next = temp2;

        printList(head);
        // System.out.println(head.data + "->" + temp1.data + "->" + temp2.data); //
        // method 1 to print the list
        // another method
        // Node curr = head;
        // while (curr != null) {
        // System.out.print(curr.data + " ");
        // curr = curr.next;
        // }

        // recursivelt print a list
        nud first = new nud(5);
        nud n1 = new nud(4);
        nud n2 = new nud(3);

        first.next = n1;
        n1.next = n2;

        // recPrintList(first);

        // insert at the begining of list

        Node2 head2 = new Node2(10);
        Node2 n0 = new Node2(20);

        head2.next = n0;
        insertPri(head2);

        head2 = insertBegin(head2, 100); // Update the head of the list
        insertPri(head2);
        // insertBegin(head2, 2);
    }
}
