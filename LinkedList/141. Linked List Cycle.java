/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while(fastPointer != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next != null ? fastPointer.next.next : null;
            if(fastPointer == null)return false;
            if(slowPointer == fastPointer)return true;
        }
        return false;
    }
}
