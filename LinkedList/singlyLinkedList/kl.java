package LinkedList.singlyLinkedList;

public class kl {

    private Node head;
    private Node tail;

    private int size;

    public kl() {
        this.size = 0;
    }

    // insert in list at start
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = this.head;
        this.head = node;

        if (this.tail == null) {
            this.tail = this.head;
        }
        this.size++;
    }

    // insert at last
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

    // insert at index
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

    // get index
    public Node get(int index) {
        Node node = this.head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // delete first
    public int deleteFirst() {
        int val = this.head.value;
        this.head = this.head.next;
        if (this.head == null) {
            this.tail = null;
        }
        this.size--;
        return val;
    }

    // delete last item;
    public int deleteLast() {
        if (this.size <= 1) {
            return this.deleteFirst();
        }
        Node secondLast = this.get(this.size - 2);
        int val = this.tail.value;
        this.tail = secondLast;
        this.tail.next = null;
        return val;
    }

    // delete index
    public int delete(int index) {
        if (index == 0) {
            return this.deleteFirst();
        }
        if (index == this.size - 1) {
            this.deleteLast();
        }
        Node prev = this.get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;

        return val;
    }

    // return node;
    public Node find(int value) {
        Node node = this.head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    // display list
    public void display() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
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