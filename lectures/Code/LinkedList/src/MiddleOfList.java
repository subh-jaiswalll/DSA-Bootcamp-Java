public class MiddleOfList {

    public Node middleList(Node head){

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

        }
        return  slow;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fouth = new Node(4);
        Node fifth = new Node(5);
        Node six = new Node(6);

        head.next = second;
        second.next = third;
        third.next = fouth;
        fouth.next = fifth;
        fifth.next = six;

        MiddleOfList obj = new MiddleOfList();

        Node middle = obj.middleList(head);

        System.out.println("Middle Node: " + middle.val);



    }
}
