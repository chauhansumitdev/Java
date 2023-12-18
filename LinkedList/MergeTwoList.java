package LinkedList;
/**
 * Problem:
 * Given two sorted linked lists, merge them into a single sorted linked list.
 * 
 * Example:
 * Input:
 * List 1: 1 -> 3 -> 5
 * List 2: 2 -> 4 -> 6
 * Output:
 * Merged List: 1 -> 2 -> 3 -> 4 -> 5 -> 6
 * 
 */

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}



public class MergeTwoList {
    public static void main(String[] args) {
        
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);
        
        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        ListNode result = merge(list1, list2);

        print(result);

    }

    public static void print(ListNode head){
        while(head!=null){
            System.out.println(head.val);
            head=head.next;
        }
    }

    public static ListNode merge(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
    
        if (list2.val < list1.val) {
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }
    
        ListNode result = list1;
    
        while (list1 != null && list2 != null) {
            ListNode connection = null;
    
            while (list1 != null && list1.val < list2.val) {
                connection = list1;
                list1 = list1.next;
            }
    
            connection.next = list2;
    
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }
    
        return result;
    }
    
}
