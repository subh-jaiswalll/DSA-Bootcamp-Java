public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    private class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value = value;
        }
    }

    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void displayReverse(){
        Node temp = tail;

        while(temp != null){
            System.out.print(temp.value + " <-> ");
            temp = temp.prev;
        }
        System.out.println("START");
    }

    public int size(){
        return size;
    }

    public void insertFirst(int val){
        Node node = new Node(val);

        if(head == null){
            head = tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }

        size++;
    }

    public void insertLast(int val){
        Node node = new Node(val);

        if(tail == null){
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }

        size++;
    }

    public void insert(int val, int idx){

        if(idx < 0 || idx > size){
            System.out.println("Invalid index");
            return;
        }

        if(idx == 0){
            insertFirst(val);
            return;
        }

        if(idx == size){
            insertLast(val);
            return;
        }

        Node temp = head;

        for(int i = 0; i < idx - 1; i++){
            temp = temp.next;
        }

        Node node = new Node(val);

        node.next = temp.next;
        node.prev = temp;

        temp.next.prev = node;
        temp.next = node;

        size++;
    }

    public int get(int idx){

        if(idx < 0 || idx >= size){
            System.out.println("Invalid index");
            return -1;
        }

        Node temp = head;

        for(int i = 0; i < idx; i++){
            temp = temp.next;
        }

        return temp.value;
    }

    public boolean search(int val){

        Node temp = head;

        while(temp != null){
            if(temp.value == val){
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    public void deleteFirst(){

        if(head == null){
            return;
        }

        if(head == tail){
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        size--;
    }

    public void deleteLast(){

        if(tail == null){
            return;
        }

        if(head == tail){
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        size--;
    }

    public void delete(int idx){

        if(idx < 0 || idx >= size){
            System.out.println("Invalid index");
            return;
        }

        // delete first
        if(idx == 0){
            deleteFirst();
            return;
        }

        // delete last
        if(idx == size - 1){
            deleteLast();
            return;
        }

        Node temp = head;

        // go to idx
        for(int i = 0; i < idx; i++){
            temp = temp.next;
        }

        // reconnect nodes
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        size--;
    }


}