package GFG_9_LINKEDLIST;

// count the nodes in a given linked list
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class Q_1_CountNodes {
    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // now add elements to the list
        Node head = new Node(1);
        Node num1 = new Node(2);
        Node num2 = new Node(3);
        Node num3 = new Node(4);

        head.next = num1;
        num1.next = num2;
        num2.next = num3;

        printList(head);

    }
}
