package lc0092_reverse_linked_list_2;

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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left == right) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        for(int i=1; i<left; i++){
            prev = prev.next;
        }
        ListNode curr = prev.next;

        int l = right - left;

        while(l > 0){
            ListNode nextNode = curr.next;
            curr.next = nextNode.next;
            nextNode.next = prev.next;
            prev.next = nextNode;
            l--;
        }
        return dummy.next;
    }
}
