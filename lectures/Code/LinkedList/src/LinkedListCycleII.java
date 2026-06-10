public class LinkedListCycleII {

    public static Node detectCycle(Node head){

        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next.next != null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                Node cycle = head;

                while (slow != cycle){
                    slow = slow.next;
                    cycle = cycle.next;
                }
                return cycle;
            }
        }
        return null;
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

        fifth.next = third;

        Node startNode = detectCycle(head);

        if(startNode != null){
            System.out.println(startNode.val);
        }
        else {
            System.out.println();
        }
    }
}
