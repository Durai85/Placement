package lc0002_add_two_numbers;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Optimal {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int ones = 0;
        int carry = 0;
        ListNode dummy = new ListNode(-1);
        ListNode result = dummy;
        while(l1 != null && l2 != null){
            int sum = l1.val + l2. val + carry;
            ones = sum % 10;
            result.next = new ListNode(ones);
            carry = sum / 10;
            result = result.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null){
            int sum = l1.val + carry;
            // System.out.println(sum);
            result.next = new ListNode(sum % 10);
            carry = sum / 10;
            result = result.next;
            l1 = l1.next;
        }

        while(l2 != null){
            int sum = l2.val + carry;
            result.next = new ListNode(sum % 10);
            carry = sum / 10;
            result = result.next;
            l2 = l2.next;
        }   

        if(carry != 0){
            // System.out.println(carry);
            result.next = new ListNode(carry);
        }
        
        return dummy.next;
    }
}
