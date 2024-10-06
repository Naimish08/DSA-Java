package LinkedList.implementation;

public class CLL {
    Node head;
    int size;

    /*public DLL(){
        size = 0;
    }*/

    private class Node{
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
    Node tailFinder(){
        Node Tail = head;
        while(Tail.next != head){
            Tail.next = Tail;
        }
        return Tail;
    }
    void InsertFirst(int x){
        Node Tail = tailFinder();
        Node newNode = new Node(x);
        size++;
        if(head == null) {
            head = newNode;
            Tail = newNode;
            return;
        }
        newNode.next = head;
        Tail.next = newNode;
        Tail = newNode;
    }
    void InsertLast(int x){
        InsertFirst(x);
    }
    void Insert(int x,int index){
        Node tempNode = head;
        for (int i=1;i<index;i++){
            tempNode = tempNode.next;
        }
        Node newNode = new Node(x,tempNode.next);
        tempNode.next = newNode;
        size++;
    }

    void RemoveFirst(){

    }

    public int getSize(){
        return size;
    }

    public void print(){
       Node currentNode = head;
        while (currentNode!= null){
            System.out.print(currentNode.value+"->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

}
