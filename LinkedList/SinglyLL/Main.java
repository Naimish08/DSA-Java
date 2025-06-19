package LinkedList.SinglyLL;

public class Main {
    public static void main(String[] args) {
        LL ll = new LL();
        ll.insertFirst(5);
        ll.insertFirst(6);
        ll.insertFirst(7);
        ll.display();
        ll.insertLast(8);
        ll.display();
        ll.deleteFirst();
        ll.display();
        ll.deleteLast();
        ll.display();
    }
}
