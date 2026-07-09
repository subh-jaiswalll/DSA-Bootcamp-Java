package SingularLinkedList;

import static SingularLinkedList.Main.display;

public class InsertAtEnd {

    public static Node insertAtEnd(Node head, int data){

        Node newNode = new Node(data);

        if(head == null){
           return  newNode;
        }

        Node temp = head;

        while (temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        display(head);

        return head;
    }


    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        insertAtEnd(head, 60);
    }
}
