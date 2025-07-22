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
    public ListNode reverse(ListNode prev,ListNode curr){
        if(curr == null){return prev;}
        ListNode last = reverse(curr,curr.next);
        curr.next = prev;
        return last;
    }
    public ListNode reverseList(ListNode head) {
        if(head == null)return null;
        return reverse(null,head);
    }
}
