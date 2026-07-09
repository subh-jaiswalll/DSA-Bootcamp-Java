package SingularLinkedList;

import static SingularLinkedList.Main.display;

public class DetectCycleLoop {

    public static boolean isCycleLoop(Node head){

        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        head.next = second;
        second.next = third;
        third.next = fourth;

// Create a cycle
        fourth.next = second;


        System.out.println(isCycleLoop(head));   // Update the head

    }
}
