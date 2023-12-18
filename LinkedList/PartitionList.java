package LinkedList;

/**
 * Test Case:
 * 
 * Input: 1 -> 4 -> 3 -> 2 -> 5 -> 2, x = 3
 * Output: 1 -> 2 -> 2 -> 4 -> 3 -> 5
 * partion around the value 3 like the nodes having value less than 3 should come before the node greater than 3
 */
public class PartitionList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);

        System.out.println("Original Linked List:");
        printList(head);

        int x = 3;
        ListNode result = partitionList(head, x);

        System.out.println("\nPartitioned Linked List:");
        printList(result);
    }

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode partitionList(ListNode head, int x) {

        ListNode small = new ListNode(0);
        ListNode large = new ListNode(0);

        ListNode pointSmall = small;
        ListNode pointLarge = large;

        while(head != null){
            if(head.val <x){
                pointSmall.next = head;
                pointSmall = pointSmall.next;
            }else{
                pointLarge.next = head;
                pointLarge = pointLarge.next;
            }
            head=head.next;
        }

        pointSmall.next=large.next;
        pointLarge.next = null;


        return small.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}

