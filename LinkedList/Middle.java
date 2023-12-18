package LinkedList;


class ListNode {
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}


public class Middle {
    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(10); 
        head.next.next.next.next.next = new ListNode(9); 

        System.out.println(middle(head).data);
    }


    public static ListNode middle(ListNode head){
        
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null  && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
}
