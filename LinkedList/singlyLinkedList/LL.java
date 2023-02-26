package LinkedList.singlyLinkedList;

public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    // insert at head
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = this.head;
        this.head = node;

        if (this.tail == null) {
            this.tail = this.head;
        }

        this.size += 1;
    }

    // insert at head
    public void insertLast(int val) {
        if (this.tail == null) {
            this.insertFirst(val);
            return;
        }
        Node node = new Node(val);
        this.tail.next = node;
        this.tail = node;
        this.size++;
    }

    // insert at specific index
    public void insert(int val, int index) {
        if (index == 0) {
            this.insertFirst(val);
            return;
        }
        if (index == this.size) {
            this.insertLast(val);
            return;
        }

        Node temp = this.head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        this.size++;

    }

    // insert using recursive 
    public void insertRec(int val, int index){

    }

    
    public void display() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.value + " ->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;

        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
