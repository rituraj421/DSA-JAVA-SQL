package GFG_9_LINKEDLIST;

class Nodeee {
    int data;
    Nodeee prev;
    Nodeee next;

    Nodeee(int d) {
        data = d;
        prev = null;
        next = null;
    }
}

public class sheet_3_DoublyLinkedList {
    // insert at the start of doubly linked list
    static Nodeee insertStart(Nodeee head, int data) {
        Nodeee temp = new Nodeee(data);
        temp.next = head;
        if (head != null) {
            head.prev = temp;
        }
        return temp;
    }

    // insert at the end of list
    static Nodeee insertEnd(Nodeee head, int data){
        Nodeee temp = new Nodeee(data);
        Nodeee curr = head;
        if(head == null){
            return temp;
        }
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = temp;
        temp.prev = curr;
        return head;
    }

    // reverse a linked list
    static Nodeee reverseList(Nodeee head){
        Nodeee temp = null;
        Nodeee curr = head;
        while(curr!=null){
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }
        if(temp!=null){
            head = temp.prev;
        }
        return head;
    }
    // delete head of doubly linked list
    static Nodeee deleteHead(Nodeee head){
        if(head == null || head.next == null){
            return null;
        }
        else{
            head = head.next;
            head.prev = null;
            return head;
        }
    }

    // delete last of doubly linked list
    static Nodeee deleteLast(Nodeee head){
        Nodeee curr = head;
        if(head == null || head.next == null){
            return null;
        }
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.prev.next = null;
        return head;
    }
    public static void main(String args[]) {
        Nodeee head = new Nodeee(10);
        Nodeee temp1 = new Nodeee(20);
        Nodeee temp2 = new Nodeee(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        printlist(head);

        head = insertStart(head, 50);
        printlist(head);

        head = insertEnd(head, 70);
        printlist(head);

        head = reverseList(head);
        printlist(head);

        head = deleteHead(head);
        printlist(head);

        head = deleteLast(head);
        printlist(head);

    }

    public static void printlist(Nodeee head) {
        Nodeee curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }
}