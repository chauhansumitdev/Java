package LinkedList;


class ListNode {
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

// use hashing for brute force

public class Cycle {
    public static void main(String[] args) {
        // Create a linked list with a cycle
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head.next;

        // Test cycle detection
        boolean hasCycle = hasCycle(head);
        System.out.println("Does the linked list have a cycle? " + hasCycle);

        ListNode node = hasCycleLocation(head);
        System.out.println("the cycle starts at "+ node.data);
    }

    public static boolean hasCycle(ListNode head){

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }

        return false;
    }

    // if you want to know the node where the cycle started
    public static ListNode hasCycleLocation(ListNode head){

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                slow = head;

                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
            }

            return slow;
        }

        return null;
    }
    
}
