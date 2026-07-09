package SingularLinkedList;

import static SingularLinkedList.Main.display;

public class SearchAnElement {

    public static boolean searchAnElement(Node head, int key){



        Node temp = head;

        while (temp != null){

            if(temp.data == key){
                return true;
            }

            temp = temp.next;
        }

        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);


        System.out.println(searchAnElement(head, 330));
    }
}

