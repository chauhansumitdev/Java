package LinkedList;


/**
 * Test Case:
 * 
 * Input: 1 -> 1 -> 2 -> 3 -> 3
 * Output: 1 -> 2 -> 3
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        System.out.println("Original Linked List:");
        printList(head);

        head = removeDuplicates(head);

        System.out.println("\nLinked List after Removing Duplicates:");
        printList(head);
    }

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode removeDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
    
        ListNode current = head;
    
        while (current.next != null) {
            if (current.next.val != current.val) {
                current = current.next;
            } else {
                current.next = current.next.next;
            }
        }
    
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
