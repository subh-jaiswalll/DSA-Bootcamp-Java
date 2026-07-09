package SingularLinkedList;

import static SingularLinkedList.Main.display;

public class RemoveNthNodeFromEnd {

    public static Node removeNthNodeFromEndBruteForce(Node head, int k){

        int len = 0;

        Node temp = head;

        while (temp != null){
            len++;
            temp =temp.next;
        }

        if(k > len || k <= 0){
            return head;
        }

        if(k == len){
            return head.next;
        }


        temp = head;
        for(int i =1; i < len -k ; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }

    public static Node removeNthNodeFromEndTwoPointer(Node head, int n){

        Node dummy = new Node(0);
        dummy.next = head;

        Node fast = head;
        Node slow = head;

        for(int i = 0; i <= n; i++){
            fast =fast.next;
        }

        while (fast != null){
            slow = slow.next;
            fast = fast.next;

        }

        slow.next = slow.next.next;

        return dummy.next;
    }


    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

//        head = removeNthNodeFromEndBruteForce(head, 2);
//        display(head);

        head = removeNthNodeFromEndTwoPointer(head, 3);
        display(head);

    }
}
