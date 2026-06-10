
public class Palindrome {

    public boolean checkPalindrome(Node head){

        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalf = reverse(slow.next);

        Node firstHalf = head;


        while (secondHalf != null) {

            if (firstHalf.val != secondHalf.val) {
                return false;
            }

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return  true;
    }

    private Node reverse(Node head){

        Node curr = head;
        Node prev = null;

        while (curr != null){
            Node currNext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = currNext;
        }
        return prev;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth  = new Node(2);
        Node fifth = new Node(1);
        Node six = new Node(0);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = six;

        Palindrome list = new Palindrome();

        System.out.println(list.checkPalindrome(head));

    }
}

