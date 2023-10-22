package GFG.GFG_00_Practice;

class Nodem {
    Nodem next;
    int data;

    Nodem(int x) {
        data = x;
        next = null;
    }
}

public class gfg_8_middleOfList {
    static void printList(Nodem head) {
        Nodem curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    static int middleList(Nodem head) {
        int count = 0;
        Nodem curr = head;
        while (curr != null) {
            curr = curr.next;
            count++;
        }

        // now realocate curr to head
        curr = head;
        for (int i = 0; i < count / 2; i++) {
            curr = curr.next;
        }
        return curr.data;
    }

    public static void main(String[] args) {

        Nodem head = new Nodem(1);
        Nodem h1 = new Nodem(2);
        Nodem h2 = new Nodem(3);
        Nodem h3 = new Nodem(4);

        head.next = h1;
        h1.next = h2;
        h2.next = h3;

        printList(head);
        System.out.println(middleList(head));

    }
}
