package GFG_9_LINKEDLIST;

class cNode {
    int data;
    cNode next;

    cNode(int c) {
        data = c;
        next = null;
    }
}

public class sheet_4_circularLinkedList {
    static void printCNode(cNode head) {
        cNode curr = head;
        if (head == null) {
            return;
        }
        System.out.print(head.data + "->");
        while (curr.next != head) {
            curr = curr.next;
            System.out.print(curr.data + "->");
        }
        System.out.println("pointing towards head");
    }

    // insert at the begin of list
    static cNode insertBegin(cNode head, int x) {
        cNode temp = new cNode(x);
        if (head == null) {
            temp.next = temp;
        } else {
            cNode curr = head;
            while (curr.next != head) {
                curr = curr.next;
            }
            curr.next = temp;
            temp.next = head;
        }
        return temp;
    }

    // insert at the end of a list
    static cNode insertEnd(cNode head, int y){
        cNode temp = new cNode(y);
        if(head == null){
            temp.next = temp;
            // return temp;
        }
        else{
            cNode curr = head;
            while(curr.next!= head){
                curr = curr.next;
            }
            curr.next = temp;
            temp.next = head;
        }
        return head;
    }

    // delete head node of list
    static cNode deleteHead(cNode head){
        cNode curr = head;
        while(curr.next!= head){
            curr = curr.next;
        }
        curr.next = head.next;
        return head.next;
    }

    // delete kth of list 
    static cNode deleteKth(cNode head, int k){
        if(head == null || head.next == null){
            return head;
        }
        cNode curr = head;
        for(int i = 0; i<k-2;i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
    public static void main(String[] args) {

        // add elements to the list
        cNode head = new cNode(1);
        head.next = new cNode(2);
        head.next.next = new cNode(3);
        head.next.next.next = new cNode(4);
        head.next.next.next.next = head;

        printCNode(head);

        head = insertBegin(head, 0);
        printCNode(head);

        head = insertEnd(head, 40);
        printCNode(head);

        head = deleteHead(head);
        printCNode(head);

        head = deleteKth(head, 3);
        printCNode(head);
    }
}
