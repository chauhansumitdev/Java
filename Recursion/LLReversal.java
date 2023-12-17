package Recursion;
/**
 * Problem Statement: Linked List Reversal
 * 
 * You are given the head of a singly linked list. Reverse the linked list in-place and return its head.
 * 
 * Example:
 * 
 * Input: 1 -> 2 -> 3 -> 4 -> 5
 * Output: 5 -> 4 -> 3 -> 2 -> 1
 * 
 * Constraints:
 * - The linked list is guaranteed to be non-empty.
 * - You must do it in-place, meaning that you need to modify the input linked list directly.
 * - Do not use extra space.
 * 
 * Function Signature:
 * 
 * public ListNode reverseList(ListNode head) {
 *     // Your code here
 * }
 * 
 * ListNode Class:
 * 
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

 // brute - stack
 // optimal - while(){}  prev temp forward
 //


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }



public class LLReversal {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        System.out.println("Original Linked List:");
        printList(head);

        head = reverseList(head);

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

    public static ListNode reverseList(ListNode head){

        if(head ==  null || head.next == null){
            return head;
        }

        ListNode reverse = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return reverse;
    }
}
