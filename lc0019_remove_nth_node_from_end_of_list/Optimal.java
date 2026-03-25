package lc0019_remove_nth_node_from_end_of_list;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {this.val = val;}
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}

public class Optimal {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;

        while(n > 0){
            fast = fast.next;
            n--;
        }
        if(fast == null){
            return head.next;
        }
        
        ListNode prev = null;
        while(fast != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = slow.next;
        return head;
    }
}
