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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while(temp != null){
            int a = temp.val;
            ListNode temp2 = temp.next;
            while(temp2 != null && temp2.val == a)temp2 = temp2.next;
            temp.next = temp2;
            temp = temp.next;
        }
        return head;
    }
}
