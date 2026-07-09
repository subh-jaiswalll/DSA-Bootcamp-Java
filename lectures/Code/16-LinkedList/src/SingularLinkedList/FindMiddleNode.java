package SingularLinkedList;

import java.lang.reflect.Array;
import java.util.Arrays;

import static SingularLinkedList.Main.display;

public class FindMiddleNode {

    public static Node findMiddleNodeTwoPointer(Node head){

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static Node findMiddleNodeInitialization(Node head){

        int len = 0;

        Node temp = head;

        while (temp != null){
            len++;
            temp = temp.next;
        }

        temp = head;

        int middle = len / 2;

        for(int i = 0; i < middle; i++){
            temp = temp.next;
        }
        return temp;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);


        Node middle=  findMiddleNodeTwoPointer(head);
        System.out.println(middle.data);
        display(head);

        head = findMiddleNodeInitialization(head);
        System.out.println(head.data);
    }
}
