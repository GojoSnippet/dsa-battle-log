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
    int recursive(ListNode prev,ListNode node,int n){
        if(node == null)return 0;
        int curr_count = recursive(node, node.next,n) + 1;
        if(curr_count == n){
            prev.next= node.next;
        }
        return curr_count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0,head);
        int x = recursive(dummy,head,n);
        return dummy.next;
    }
}
