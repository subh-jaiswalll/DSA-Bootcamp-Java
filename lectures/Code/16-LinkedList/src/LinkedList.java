public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    // Node class
    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // Display method
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public int size(){
        return size;
    }

    public Node get(int idx){
        Node node = head;

        for(int i = 0;i < idx; i++){
            node = node.next;
        }
        return node;
    }

    public void insertFirst(int val){
        Node node = new Node(val);

        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insertLast(int val){

        if(tail == null){
            insertFirst(val);
            return;
        }

        Node node = new Node(val);

        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int idx){

        if(idx > size || idx < 0){
            System.out.println("Invalid Index");
            return;
        }
        if(idx == 0){
            insertFirst(val);
            return;
        }

        if(size == 0){
            insertLast(val);
            return;
        }

        Node temp = head;

        for(int i = 1; i < idx; i++){
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);

        temp.next = node;
        size++;
    }

//    public int deleteFirst(){
//
//        int val = head.value;
//
//        head = head.next;
//
//        if(head == null){
//            tail = null;
//        }
//        size--;
//        return val;
//
//    }
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }

        head  = head.next;

        if(head ==null){
            tail = null;
        }
        size--;
    }

//    public int deleteLast(){
//
//        if(size <= 1){
//            return  deleteFirst();
//        }
//
//        Node secondLast = get(size - 2);
//        int val = tail.value;
//
//        tail = secondLast;
//        tail.next = null;
//        size--;
//        return  val;
//    }
    public void deleteLast(){
        if (head == null){
            System.out.println("List is Empty");
            return;
        }

        if(head == tail){
            head = tail = null;
            size--;
            return;
        }

        Node temp = head;

        while (temp.next != tail){

            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
        size--;
    }

    void delete(int idx){

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

        // go to (idx - 1)
        for(int i = 1; i < idx; i++){
            temp = temp.next;
        }

        // correct pointer update
        temp.next = temp.next.next;

        size--;
    }

    int search(int val){


        int idx = 0;

        if(head == null){
            return idx;
        }

        Node temp = head;

        while (temp != null) {


            if (temp.value == val) {
                return idx;
            }

            temp = temp.next;

            idx++;
        }
        return  -1;


    }
}