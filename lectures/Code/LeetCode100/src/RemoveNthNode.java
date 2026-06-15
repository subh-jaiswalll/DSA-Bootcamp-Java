import java.util.Arrays;

public class RemoveNthNode {


    public static Node removeNthNode(Node head, int n){

        Node fast = head;
        Node slow  = head;

        for(int i = 0; i < n; i++){

            fast = fast.next;
        }

        if(fast == null){
            return  head.next;
        }

        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return  head;


    }
    public static void main(String[] args) {

        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        int n = 5;

        Node result = removeNthNode(head, n);

        while(result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
