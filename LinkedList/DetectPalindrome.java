package LinkedList;

import java.util.List;

/**
 * Test Case:
 * 
 * Input: 1 -> 2 -> 3 -> 2 -> 1 (Palindrome)
 * Output: true
 * 
 * Input: 1 -> 2 -> 3 -> 4 -> 5 (Not a Palindrome)
 * Output: false
 */
public class DetectPalindrome {
    public static void main(String[] args) {
        ListNode palindromeList = new ListNode(1);
        palindromeList.next = new ListNode(2);
        palindromeList.next.next = new ListNode(3);
        palindromeList.next.next.next = new ListNode(2);
        palindromeList.next.next.next.next = new ListNode(1);

        ListNode nonPalindromeList = new ListNode(1);
        nonPalindromeList.next = new ListNode(2);
        nonPalindromeList.next.next = new ListNode(3);
        nonPalindromeList.next.next.next = new ListNode(4);
        nonPalindromeList.next.next.next.next = new ListNode(5);

        System.out.println("Is Palindrome? (Palindrome List): " + isPalindrome(palindromeList)); 
        System.out.println("Is Palindrome? (Non-Palindrome List): " + isPalindrome(nonPalindromeList)); 
    }

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static boolean isPalindrome(ListNode head) {
        // ListNode dummy = new ListNode(0);
        // ListNode current = dummy;
        // ListNode itr = head;
    
        // while (itr != null) {
        //     ListNode newNode = new ListNode(itr.val);
        //     newNode.next = current.next;
        //     current.next = newNode;
        //     itr = itr.next;
        // }
    
        // while (head != null) {
        //     if (head.val != dummy.next.val) {
        //         return false;
        //     }
        //     dummy = dummy.next;
        //     head = head.next;
        // }
    
        // return true;

        // finding the half and then reversing the other half in place.

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode end = reverse(slow);

        while(end != null){
            if(head.val != end.val){
                return false;
            }

            head = head.next;
            end = end.next;
        }

        return true;

    }
    
    public static ListNode reverse(ListNode node){
        ListNode prev = null;
        ListNode current = node;

        while(current != null){
            ListNode forward = current.next;
            current.next = prev;
            prev = current;
            current = forward;
        }

        return prev;
    }
}

