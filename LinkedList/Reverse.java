package LinkedList;

/**
 * Reverse
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


public class Reverse {

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        System.out.println("Original Linked List:");
        printList(head);

        // head = iterative(head);

        // System.out.println("\nReversed Linked List:");
        // printList(head);

        head = recursive(head);

        System.out.println("\nReversed Linked List:");
        printList(head);
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    // iterative solution
    public static ListNode iterative(ListNode head){
        ListNode current = head.next;
        ListNode previous = head;

        while(current != null){
            ListNode forward = current.next;
            current.next= previous;
            previous = current;
            current = forward;
        }

        head.next = null;

        return previous;
    }

    // recursive solution
    public static ListNode recursive(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
    
        ListNode newHead = recursive(head.next);
        ListNode forward = head.next;
        forward.next = head;
        head.next = null;
    
        return newHead;
    }
    
}


// its like a bubble -> which first goes to the end solves it then keeps on combining the prev elements to it.