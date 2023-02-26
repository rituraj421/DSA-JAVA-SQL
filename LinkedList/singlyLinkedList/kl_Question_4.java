package LinkedList.singlyLinkedList;

public class kl_Question_4 {
    public static void main(String[] args) {
        kl list = new kl();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);

        list.display();

        list.insertLast(0);
        list.display();

        list.insert(100, 2);
        list.display();

        list.deleteFirst();
        list.display();

        list.deleteLast();
        list.display();

        list.delete(2);
        list.display();

        list.find(100);
        list.display();
    }
}