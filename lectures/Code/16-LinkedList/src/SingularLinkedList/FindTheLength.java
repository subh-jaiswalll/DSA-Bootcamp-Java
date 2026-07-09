package SingularLinkedList;

import static SingularLinkedList.Main.display;

public class FindTheLength {


    public static int findLength(Node head){

        int len = 0;

        Node temp = head;

        while (temp != null){
            len++;
            temp = temp.next;
        }
        return len;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);


        System.out.println(findLength(head)); // Update the head

        display(head);
    }
}
