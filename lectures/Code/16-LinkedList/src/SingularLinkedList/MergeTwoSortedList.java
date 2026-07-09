package SingularLinkedList;

public class MergeTwoSortedList {

    public static Node mergeTwoSortedList(Node l1, Node l2){

        Node dummy = new Node(-1);
        Node tail = dummy;

        while (l1 != null && l2 != null){

            if(l1.data <= l2.data){
                tail.next = l1;
                l1 = l1.next;
            }
            else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        if(l1 != null){
            tail.next = l1;
        }
        if(l2 != null){
            tail.next = l2;
        }
        return  dummy.next;
    }
    public static void main(String[] args) {

        Node l1 = new Node(10);
        l1.next = new Node(30);
        l1.next.next = new Node(50);

        Node l2 = new Node(20);
        l2.next = new Node(40);
        l2.next.next = new Node(60);

        Node result = mergeTwoSortedList(l1, l2);

        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
    }
}
