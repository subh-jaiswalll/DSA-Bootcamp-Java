package SingularLinkedList;

public class DeteteFirst {

    public static Node deleteFirst(Node head){
        if(head == null){
            return null;
        }

        return head.next;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);



        deleteFirst(head);
    }
}
