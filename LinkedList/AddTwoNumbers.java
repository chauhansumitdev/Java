package LinkedList;

/**
 * Test Case:
 * 
 * Input:
 * Number 1: 2 -> 4 -> 3 (represents the number 342)
 * Number 2: 5 -> 6 -> 4 (represents the number 465)
 * 
 * Output:
 * Sum: 7 -> 0 -> 8 (represents the number 807)
 */

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode number1 = new ListNode(2);
        number1.next = new ListNode(4);
        number1.next.next = new ListNode(3);

        ListNode number2 = new ListNode(5);
        number2.next = new ListNode(6);
        number2.next.next = new ListNode(4);

        System.out.println("Number 1:");
        printList(number1);

        System.out.println("\nNumber 2:");
        printList(number2);

        ListNode sum = addTwoNumbers(number1, number2);

        System.out.println("\nSum:");
        printList(sum);
    }

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }

        if(l2 == null){
            return l1;
        }

        ListNode dummy = new ListNode(0);

        while(l1 != null && l2 != null){

            int val1 = l1.val;

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

// manya times the dummy node in ll questions is beneficial 
