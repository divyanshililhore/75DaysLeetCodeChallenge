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
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode far = null;
        ListNode curr = head;

        while(curr!=null){
            pre = curr.next;
            curr.next = far;
            far = curr;
            curr = pre;
        }
        return far;
    }
}