public class addTwoNumber {


    public Node addNumber(Node l1, Node l2){

        Node result = new Node(0);
        Node curr = result;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0){

            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            sum = sum % 10;

            curr.next = new Node(sum);
            curr = curr.next;
        }
        return result.next;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {

        Node l1 = new Node(2);
        l1.next = new Node(4);
        l1.next.next = new Node(3);

        // l2 = 5 -> 6 -> 4
        Node l2 = new Node(5);
        l2.next = new Node(6);
        l2.next.next = new Node(4);

        addTwoNumber obj = new addTwoNumber();

        Node result = obj.addNumber(l1, l2);

        System.out.print("Result: ");
        printList(result);
    }
}
