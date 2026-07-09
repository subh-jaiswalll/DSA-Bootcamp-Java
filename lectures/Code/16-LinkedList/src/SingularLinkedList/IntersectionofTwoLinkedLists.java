package SingularLinkedList;

import java.util.HashSet;

public class IntersectionofTwoLinkedLists {

    public static Node interSectionOfTwoLinkedListBruteForce(Node l1, Node l2){

        Node temp1 = l1;

        while (temp1 != null){

            Node temp2 = l2;

            while (temp2 != null){

                if(temp1 == temp2){
                    return temp1;
                }

                temp2 = temp2.next;
            }
            temp1 = temp1.next;
        }
        return null;
    }


    public static Node interSectionOfTwoLinkedListHashSet(Node l1, Node l2){

        HashSet<Node> set = new HashSet<>();


        while (l1 != null){
            set.add(l1);
            l1 = l1.next;
        }

        while (l2 != null){
            if(set.contains(l2)){
                return l2;
            }

            l2 = l2.next;
        }

        return null;
    }

    public static Node interSectionOfTwoLinkedListTwoPointer(Node l1, Node l2){
        if (l1 == null || l2 == null) {
            return null;
        }

        Node p1 = l1;
        Node p2 = l2;

        while (p1 != p2) {

            if (p1 == null) {
                p1 = l1;
            } else {
                p1 = p1.next;
            }

            if (p2 == null) {
                p2 = l2;
            } else {
                p2 = p2.next;
            }
        }

        return p1;
    }

    public static void main(String[] args) {
        Node common = new Node(40);
        common.next = new Node(50);
        common.next.next = new Node(60);

        // List A
        Node headA = new Node(10);
        headA.next = new Node(20);
        headA.next.next = new Node(30);
        headA.next.next.next = common;

        // List B
        Node headB = new Node(15);
        headB.next = new Node(25);
        headB.next.next = common;

//        Node intersectionBruteForce = interSectionOfTwoLinkedListBruteForce(headA, headB);
//
//        if (intersectionBruteForce != null) {
//            System.out.println("Intersection Node = " + intersectionBruteForce.data);
//        } else {
//            System.out.println("No Intersection");
//        }

//        Node intersectionHashSet = interSectionOfTwoLinkedListHashSet(headA, headB);
//
//        if(intersectionHashSet != null){
//            System.out.println(intersectionHashSet.data);
//        }

        Node intersectionTwoPointer = interSectionOfTwoLinkedListTwoPointer(headA, headB);

        if(intersectionTwoPointer != null){
            System.out.println(intersectionTwoPointer.data);
        }

    }
}
