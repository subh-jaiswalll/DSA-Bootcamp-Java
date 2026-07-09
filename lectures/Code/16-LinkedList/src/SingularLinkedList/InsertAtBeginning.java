package SingularLinkedList;

import static SingularLinkedList.Main.display;

public class InsertAtBeginning {

    public static Node insertAtBeginning(Node head, int data){

        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
        display(head);
        return head;
    }
    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        insertAtBeginning(head, 5);
    }
}
