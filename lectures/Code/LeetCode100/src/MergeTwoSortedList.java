public class MergeTwoSortedList {

    public static Node mergeSortedList(Node l1, Node l2){

        Node newList = new Node();
        Node tail = newList;

        while (l1 != null && l2 != null){

            if(l1.val < l2.val){

                tail.next = l1;
                tail = tail.next;
                l1 = l1.next;
            }
            else {
                tail.next = l2;
                tail = tail.next;
                l2  = l2.next;

            }
        }

        if(l1 != null){
            tail.next = l1;

        }
        else {
            tail.next = l2;
        }

        return newList.next;
    }

    public static void main(String[] args) {




        Node l1 = new Node(1);
        l1.next = new Node(3);
        l1.next.next = new Node(5);

        Node l2 = new Node(2);
        l2.next = new Node(4);
        l2.next.next = new Node(6);

        Node result = mergeSortedList(l1, l2);

        while(result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }


    }
}
