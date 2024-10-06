package LinkedList.implementation;

public class Main {
    public static void main(String[] args) {
        /*LL list = new LL();
        list.InsertFirst(5);
        list.InsertLast(6);
        list.InsertLast(8);
        list.Insert(7,2);
        list.print();*/
        DLL Doublylist = new DLL();
        Doublylist.InsertLast(5);
        Doublylist.print();
        Doublylist.InsertLast(7);
        Doublylist.print();
        Doublylist.InsertFirst(4);
        Doublylist.print();
        Doublylist.Insert(6,2);
        Doublylist.print();
        Doublylist.DeleteFirst();
        Doublylist.print();
        Doublylist.DeleteLast();
        Doublylist.print();
        Doublylist.InsertLast(7);
        Doublylist.print();
        Doublylist.Delete(1);
        Doublylist.print();
    }
}
