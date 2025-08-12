package LinkedList.SinglyLL;

public class Main {
    public static void main(String[] args) {
        LL ll = new LL();
        ll.insertFirst(7);
        ll.insertFirst(6);
        ll.insertFirst(5);
        ll.display();
        ll.insertLast(8);
        ll.display();
        ll.insertAtIndex(2,4);
        ll.display();
        ll.deleteAtIndex(2);
        ll.display();
    }
}
