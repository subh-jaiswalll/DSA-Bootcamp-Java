package SingularLinkedList;

import static SingularLinkedList.Main.display;

public class ReverseAnList {

    public static Node reverseAndList(Node head){

        Node prev = null;
        Node curr = head;

        while (curr != null){
            Node next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);



        head = reverseAndList(head);   // Update the head

        display(head);
    }
}

