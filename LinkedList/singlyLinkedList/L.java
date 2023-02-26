package LinkedList.singlyLinkedList;

public class L {

    Node head;
    private int size;

    L() {
        this.size = 0;
    }

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            L.this.size++;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = this.head;
        this.head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);

        if (this.head == null) {
            this.head = newNode;
            return;
        }

        Node lastNode = this.head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }

        lastNode.next = newNode;
    }

    public void printList() {
        Node currNode = this.head;

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("null");
    }

    public void removeFirst() {
        if (this.head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }

        this.head = this.head.next;
        this.size--;
    }

    public void removeLast() {
        if (this.head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }

        this.size--;
        if (this.head.next == null) {
            this.head = null;
            return;
        }

        Node currNode = this.head;
        Node lastNode = this.head.next;
        while (lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }

        currNode.next = null;
    }

    public int getSize() {
        return this.size;
    }

    // reverse list
    public void reverseIterate() {

        if (this.head == null || this.head.next == null) {
            return;
        }

        Node prevNode = this.head;
        Node currNode = this.head.next;

        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // update
            prevNode = currNode;
            currNode = nextNode;
        }
        this.head.next = null;
        this.head = prevNode;
    }

}
