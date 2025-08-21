/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int carry = 0;
    int frst_val=0;int scnd_val=0;
    ListNode dummy = new ListNode(0,null);
    ListNode pointer = dummy;
    while(l1 != null || l2 != null){
        if(l1 == null)frst_val=0;
        else frst_val = l1.val;
        if(l2 == null)scnd_val = 0;
        else scnd_val = l2.val;
        int count = frst_val + scnd_val+ carry;
        carry = count / 10;
        pointer.next = new ListNode(count % 10, null);
        pointer = pointer.next;
        if(l1 != null)l1=l1.next;
        if(l2!=null)l2=l2.next;
    }
    if(carry !=0)pointer.next  = new ListNode(carry,null);
    return dummy.next;
    }
}
