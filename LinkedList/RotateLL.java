package LinkedList;

/**
 * Test Case:
 * 
 * Input: 1 -> 2 -> 3 -> 4 -> 5, k = 2
 * Output: 4 -> 5 -> 1 -> 2 -> 3
 */

public class RotateLL {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List:");
        printList(head);

        int k = 2;
        ListNode result = rotateLinkedList(head, k);

        System.out.println("\nRotated Linked List:");
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

    public static ListNode rotateLinkedList(ListNode head, int k) {

        if(head == null || k<=0 || head.next == null){
            return head;
        }

        int size = 0;

        ListNode current = head;
        
        while(current.next != null){
            current=current.next;
            size++;
        }

        k = k % size;

        if(k == 0){
            return head;
        }

        int headIndex = size -k;
        ListNode newHead = head;

        for(int i=0;i<headIndex;i++){
            newHead=newHead.next;
        }        

        current.next = head;
        head = newHead.next;
        newHead.next = null;

        return head;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
