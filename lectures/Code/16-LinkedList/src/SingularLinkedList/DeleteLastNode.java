package SingularLinkedList;

import static SingularLinkedList.Main.display;

public class DeleteLastNode {


    public static Node deleteLastNode(Node head){

        if(head == null || head.next == null){
            return null;
        }

        Node temp = head;

        while (temp.next.next != null){
            temp = temp.next;
        }

        temp.next = null;

        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);


        head = deleteLastNode(head);   // Update the head

        display(head);

    }
}
