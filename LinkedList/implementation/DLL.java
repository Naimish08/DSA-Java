package LinkedList.implementation;

public class DLL {
    Node head;
    int size;

    public DLL(){
        size = 0;
    }

    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    void InsertFirst(int x){
        Node newNode = new Node(x);
        size++;
        if(head == null){
            head = newNode;
            return;
        }
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    void InsertLast(int x){
        Node newNode = new Node(x);
        size++;
        if(head == null){
            head = newNode;
            return;
        }
        Node Traverse = head;
        while(Traverse.next!=null){
            Traverse = Traverse.next;
        }
        Traverse.next = newNode;
        newNode.prev = Traverse;
    }

    void Insert(int x,int index){
        Node newNode = new Node(x);
        size++;
        if(head == null){
            head = newNode;
            return;
        }
        else if(index == 0){
            InsertFirst(x);
        }
        else if(index == size-1){
            InsertLast(x);
        }
        Node Traverse = head;
        for(int i=1;i<index;i++){
            Traverse = Traverse.next;
        }
        newNode.next = Traverse.next;
        Node tempNode = Traverse.next;
        tempNode.prev = newNode;
        Traverse.next = newNode;
        newNode.prev = Traverse;
    }

    void DeleteFirst(){
        if(head == null){
            System.out.println("Linked List is Empty so can't Delete any Item");
            return;
        }
        size--;
        Node tempNode = head.next;
        tempNode.prev = null;
        head = tempNode;
    }

    void DeleteLast(){
        if(head == null){
            System.out.println("Linked List is Empty so can't Delete any Item");
            return;
        }
        size--;
        Node tempNode = head;
        while(tempNode.next != null){
            tempNode = tempNode.next;
        }
        Node secondlast = tempNode.prev;
        secondlast.next = null;
        tempNode = null;
    }

    void Delete(int index){
        if(head == null){
            System.out.println("Linked List is Empty so can't Delete any Item");
            return;
        }
        else if(index == 0){
            DeleteFirst();
        }
        else if(index == size-1) {
            DeleteLast();
        }
        Node tempNode = head;
        for(int i=1;i<index;i++){
            tempNode = tempNode.next;
        }
        Node secondNode = tempNode.next;
        secondNode = secondNode.next;
        secondNode.prev = tempNode;
        tempNode.next = secondNode;
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
