package LinkedList.SinglyLL;

public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

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

    public void insertFirst(int value){
        Node newNode = new Node(value);
        size++;
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void deleteFirst(){
        if(head == null){
            return;
        }
        head = head.next;
    }

    public void insertAtIndex(int index,int value){
        if(index == size){
            insertLast(value);
            return;
        }
        Node newNode = new Node(value);
        size++;
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        Node temp = head;
        for(int i = 0; i < index-1; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void deleteAtIndex(int index){
        if(index == 0){
            deleteFirst();
        }
        if(index == size){
            deleteLast();
        }
        Node temp = head;
        for(int i = 0; i < index-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public void insertLast(int value){
        size++;
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void deleteLast(){
        if(head == null){
            return;
        }
        Node Temp = head;
        while(Temp.next != tail){
            Temp = Temp.next;
        }
        tail = Temp;
        tail.next = null;
    }

    public void display(){
        if(head == null){
            System.out.println("No Items in the List");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

}
