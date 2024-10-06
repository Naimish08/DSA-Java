package LinkedList.implementation;
public class LL {
    private Node head;
    private Node tail;
    int size;
    LL(){
        size=0;
    }
    class Node{
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

    void InsertFirst(int x){
        Node newNode = new Node(x);
        newNode.next = head;
        head = newNode;
        size++;
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
    void InsertLast(int x){
        size++;
        Node newNode = new Node(x);
        if(head == null){
            head = newNode;
            return;
        }
        Node traverse = head;
        while(traverse.next != null){
            traverse = traverse.next;
        }
        traverse.next = newNode;
    }

    void RemoveFirst(){
        if(head == null){
            System.out.println("The Linked List is Empty\n");
            return;
        }
        size--;
        Node newNode = head.next;
        head = newNode;
    }

    void RemoveLast(){
        if(head == null){
            System.out.println("The Linked List is Empty\n");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node SecondLast = head;
        Node Last = head.next;
        while(Last.next != null){
            Last = Last.next;
            SecondLast = Last;
        }
        Last = null;
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
