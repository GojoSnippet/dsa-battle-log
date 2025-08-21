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
    ListNode reverse(ListNode prev,ListNode curr){
        if(curr == null)return prev;
        ListNode next = curr.next;
        curr.next = prev;
        return reverse(curr,next);
    }
    public void reorderList(ListNode head) {
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while(fastPointer.next != null && fastPointer.next.next!=null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        // ListNode head_2 = reverse(null,slowPointer.next);
        ListNode curr = slowPointer.next;
        ListNode prev = null;
        while(curr != null){
            ListNode temp1 = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp1;
        }
        ListNode head_2 = prev;
        ListNode pointer1 =head;
        ListNode pointer2 = head_2;
        slowPointer.next = null;
        while(pointer2 != null){
            ListNode temp1 = pointer1.next;
            ListNode temp2 = pointer2.next;
            pointer1.next = pointer2;
            pointer1 = temp1;
            pointer2.next = pointer1;
            pointer2 = temp2;
        }
        return ;
    }
}
