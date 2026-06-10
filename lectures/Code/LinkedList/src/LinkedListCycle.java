public class LinkedListCycle {

    public  boolean hasCycle(Node head){

        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;


            if(slow == fast){
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        // Connect nodes
        head.next = second;
        second.next = third;
        third.next = fourth;

        // Create cycle
        fourth.next = second;

        LinkedListCycle obj = new LinkedListCycle();

        boolean result = obj.hasCycle(head);

        System.out.println("Cycle Present: " + result);
    }
}
