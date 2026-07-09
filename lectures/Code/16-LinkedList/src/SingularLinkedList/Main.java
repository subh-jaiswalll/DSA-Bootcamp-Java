package SingularLinkedList;

public class Main{

    public static void display(Node head){

        Node temp = head;

        while (temp != null){

            System.out.print(temp.data + " -> ");

            temp = temp.next;

        }
        System.out.println();
    }

    public static void main(String[] args) {
//        Node head = new Node(1);
//        Node second = new Node(2);
//        Node third = new Node(3);
//        Node fourth = new Node(4);
//        Node fifth = new Node(5);
//
//
//        head.next = second;
//        second.next = third;
//        third.next = fourth;
//        fourth.next = fifth;

        Node head = new Node(10);
         head.next = new Node(20);
         head.next.next = new Node(30);
         head.next.next.next = new Node(40);
         head.next.next.next.next = new Node(50);

         display(head);

    }
}
