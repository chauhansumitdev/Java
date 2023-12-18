package LinkedList;
/**
 * Test Case:
 * 
 * List A: 4 -> 1 -> 8 -> 4 -> 5
 * List B: 5 -> 0 -> 1 -> 8 -> 4 -> 5
 * Intersection Node: 8
 */
public class LLIntersection {
    public static void main(String[] args) {
        ListNode listA = new ListNode(4);
        listA.next = new ListNode(1);
        listA.next.next = new ListNode(8);
        listA.next.next.next = new ListNode(4);
        listA.next.next.next.next = new ListNode(5);

        ListNode listB = new ListNode(5);
        listB.next = new ListNode(0);
        listB.next.next = new ListNode(1);
        listB.next.next.next = new ListNode(8);
        listB.next.next.next.next = new ListNode(4);
        listB.next.next.next.next.next = new ListNode(5);

        ListNode intersectionNode = listA.next.next;

        listA.next.next.next.next.next = intersectionNode;
        listB.next.next.next.next.next.next = intersectionNode;

        System.out.println("List A:");
        printList(listA);

        System.out.println("\nList B:");
        printList(listB);

        // System.out.println("\nIntersection Node: " + getIntersectionNode(listA, listB).val);
    }

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1 = 0;
        int len2 = 0;
    
        ListNode A = headA;
        ListNode B = headB;
    
        while (A != null) {
            A = A.next;
            len1++;
        }
    
        while (B != null) {
            B = B.next;
            len2++;
        }
    
        int diff = Math.abs(len2 - len1);
    
        ListNode greater = (len1 > len2) ? headA : headB;
        ListNode smaller = (len1 < len2) ? headA : headB;
    
        for (int i = 0; i < diff; i++) {
            greater = greater.next;
        }
    
        while (greater != null) {
            if (greater == smaller) {
                return greater;
            }
            greater = greater.next;
            smaller = smaller.next;
        }
    
        return null;
    }
    

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
