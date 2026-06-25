import java.util.ArrayList;
import java.util.List;

public class MergeKSortedList {


    public Node mergeKLists(Node[] lists) {

        if (lists == null || lists.length == 0) {
            return null;
        }

        while (lists.length > 1) {

            List<Node> temp = new ArrayList<>();

            for (int i = 0; i < lists.length; i += 2) {

                Node l1 = lists[i];
                Node l2;

                if (i + 1 < lists.length) {
                    l2 = lists[i + 1];
                } else {
                    l2 = null;
                }

                temp.add(mergeLists(l1, l2));
            }

            lists = temp.toArray(new Node[0]);
        }

        return lists[0];
    }

    private Node mergeLists(Node l1, Node l2) {

        Node dummy = new Node();
        Node tail = dummy;

        while (l1 != null && l2 != null) {

            if (l1.val < l2.val) {
                tail.next = l1;
                tail = tail.next;
                l1 = l1.next;
            } else {
                tail.next = l2;
                tail = tail.next;
                l2 = l2.next;
            }
        }

        if (l1 != null) {
            tail.next = l1;
        } else {
            tail.next = l2;
        }

        return dummy.next;
    }

    public static void main(String[] args) {

        // List 1: 1 -> 4 -> 5
        Node l1 = new Node(1);
        l1.next = new Node(4);
        l1.next.next = new Node(5);

        // List 2: 1 -> 3 -> 4
        Node l2 = new Node(1);
        l2.next = new Node(3);
        l2.next.next = new Node(4);

        // List 3: 2 -> 6
        Node l3 = new Node(2);
        l3.next = new Node(6);

        Node[] lists = {l1, l2, l3};

        MergeKSortedList sol = new MergeKSortedList();
        Node result = sol.mergeKLists(lists);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
